
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.specimentmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.entity.SpawnPlacementRegisterEvent;
import net.neoforged.neoforge.event.entity.EntityAttributeCreationEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.registries.Registries;

import net.mcreator.specimentmod.entity.ZombieFemiEntity;
import net.mcreator.specimentmod.entity.RockyEntity;
import net.mcreator.specimentmod.entity.PneuwetEntity;
import net.mcreator.specimentmod.entity.PneusoftEntity;
import net.mcreator.specimentmod.entity.PneumediumEntity;
import net.mcreator.specimentmod.entity.PneuhardEntity;
import net.mcreator.specimentmod.entity.PneuIntermediaireEntity;
import net.mcreator.specimentmod.entity.MimirEntity;
import net.mcreator.specimentmod.entity.F1Entity;
import net.mcreator.specimentmod.entity.DarkShyroBossEntity;
import net.mcreator.specimentmod.entity.DarkMinoBossEntity;
import net.mcreator.specimentmod.entity.DarkMcqueenBossEntity;
import net.mcreator.specimentmod.entity.DarkKailonBossEntity;
import net.mcreator.specimentmod.entity.DarkFemiBossEntity;
import net.mcreator.specimentmod.entity.CharomaneEntity;
import net.mcreator.specimentmod.SpecimentModMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class SpecimentModModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(Registries.ENTITY_TYPE, SpecimentModMod.MODID);
	public static final DeferredHolder<EntityType<?>, EntityType<MimirEntity>> MIMIR = register("mimir",
			EntityType.Builder.<MimirEntity>of(MimirEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.9f, 1.4f));
	public static final DeferredHolder<EntityType<?>, EntityType<RockyEntity>> ROCKY = register("rocky",
			EntityType.Builder.<RockyEntity>of(RockyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<PneusoftEntity>> PNEUSOFT = register("pneusoft",
			EntityType.Builder.<PneusoftEntity>of(PneusoftEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<PneumediumEntity>> PNEUMEDIUM = register("pneumedium",
			EntityType.Builder.<PneumediumEntity>of(PneumediumEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<PneuhardEntity>> PNEUHARD = register("pneuhard",
			EntityType.Builder.<PneuhardEntity>of(PneuhardEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<PneuIntermediaireEntity>> PNEU_INTERMEDIAIRE = register("pneu_intermediaire",
			EntityType.Builder.<PneuIntermediaireEntity>of(PneuIntermediaireEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<PneuwetEntity>> PNEUWET = register("pneuwet",
			EntityType.Builder.<PneuwetEntity>of(PneuwetEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(1f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<F1Entity>> F_1 = register("f_1", EntityType.Builder.<F1Entity>of(F1Entity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

			.sized(2.5f, 1f));
	public static final DeferredHolder<EntityType<?>, EntityType<CharomaneEntity>> CHAROMANE = register("charomane",
			EntityType.Builder.<CharomaneEntity>of(CharomaneEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<ZombieFemiEntity>> ZOMBIE_FEMI = register("zombie_femi",
			EntityType.Builder.<ZombieFemiEntity>of(ZombieFemiEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkFemiBossEntity>> DARK_FEMI_BOSS = register("dark_femi_boss",
			EntityType.Builder.<DarkFemiBossEntity>of(DarkFemiBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkMinoBossEntity>> DARK_MINO_BOSS = register("dark_mino_boss",
			EntityType.Builder.<DarkMinoBossEntity>of(DarkMinoBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkKailonBossEntity>> DARK_KAILON_BOSS = register("dark_kailon_boss",
			EntityType.Builder.<DarkKailonBossEntity>of(DarkKailonBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkMcqueenBossEntity>> DARK_MCQUEEN_BOSS = register("dark_mcqueen_boss",
			EntityType.Builder.<DarkMcqueenBossEntity>of(DarkMcqueenBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));
	public static final DeferredHolder<EntityType<?>, EntityType<DarkShyroBossEntity>> DARK_SHYRO_BOSS = register("dark_shyro_boss",
			EntityType.Builder.<DarkShyroBossEntity>of(DarkShyroBossEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> DeferredHolder<EntityType<?>, EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(SpawnPlacementRegisterEvent event) {
		MimirEntity.init(event);
		RockyEntity.init(event);
		PneusoftEntity.init(event);
		PneumediumEntity.init(event);
		PneuhardEntity.init(event);
		PneuIntermediaireEntity.init(event);
		PneuwetEntity.init(event);
		F1Entity.init(event);
		CharomaneEntity.init(event);
		ZombieFemiEntity.init(event);
		DarkFemiBossEntity.init(event);
		DarkMinoBossEntity.init(event);
		DarkKailonBossEntity.init(event);
		DarkMcqueenBossEntity.init(event);
		DarkShyroBossEntity.init(event);
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(MIMIR.get(), MimirEntity.createAttributes().build());
		event.put(ROCKY.get(), RockyEntity.createAttributes().build());
		event.put(PNEUSOFT.get(), PneusoftEntity.createAttributes().build());
		event.put(PNEUMEDIUM.get(), PneumediumEntity.createAttributes().build());
		event.put(PNEUHARD.get(), PneuhardEntity.createAttributes().build());
		event.put(PNEU_INTERMEDIAIRE.get(), PneuIntermediaireEntity.createAttributes().build());
		event.put(PNEUWET.get(), PneuwetEntity.createAttributes().build());
		event.put(F_1.get(), F1Entity.createAttributes().build());
		event.put(CHAROMANE.get(), CharomaneEntity.createAttributes().build());
		event.put(ZOMBIE_FEMI.get(), ZombieFemiEntity.createAttributes().build());
		event.put(DARK_FEMI_BOSS.get(), DarkFemiBossEntity.createAttributes().build());
		event.put(DARK_MINO_BOSS.get(), DarkMinoBossEntity.createAttributes().build());
		event.put(DARK_KAILON_BOSS.get(), DarkKailonBossEntity.createAttributes().build());
		event.put(DARK_MCQUEEN_BOSS.get(), DarkMcqueenBossEntity.createAttributes().build());
		event.put(DARK_SHYRO_BOSS.get(), DarkShyroBossEntity.createAttributes().build());
	}
}
