package net.mcreator.specimentmod.procedures;

import net.neoforged.bus.api.Event;

@EventBusSubscriber
public class DarkfemiProcedure {
	@SubscribeEvent
	public static void onBlockPlace(BlockEvent.EntityPlaceEvent event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ());
	}

	public static void execute(LevelAccessor world, double x, double y, double z) {
		execute(null, world, x, y, z);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("speciment_mod:biome_femi"))) {
			if ((world.getBlockState(BlockPos.containing(x + 0, y + 0, z + 0))).getBlock() == SpecimentModModBlocks.BLOCDARKFEMI.get()
					&& (world.getBlockState(BlockPos.containing(x + 0, y - 1, z + 0))).getBlock() == SpecimentModModBlocks.FEMIUM_BLOCK.get()
					&& (world.getBlockState(BlockPos.containing(x + 0, y - 2, z + 0))).getBlock() == SpecimentModModBlocks.FEMIUM_BLOCK.get()) {
				SpecimentModMod.queueServerWork(100, () -> {
					if (world instanceof ServerLevel _level) {
						LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
						entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x, y, z)));
						entityToSpawn.setVisualOnly(true);
						_level.addFreshEntity(entityToSpawn);
					}
					if (world instanceof ServerLevel _level)
						_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 1000, 5, 5, 3, 1);
					if (world instanceof ServerLevel _level) {
						Entity entityToSpawn = SpecimentModModEntities.DARK_FEMI_BOSS.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
						if (entityToSpawn != null) {
							entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
						}
					}
					world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 1, z), Blocks.AIR.defaultBlockState(), 3);
					world.setBlock(BlockPos.containing(x, y - 2, z), Blocks.AIR.defaultBlockState(), 3);
				});
			}
		}
	}
}
