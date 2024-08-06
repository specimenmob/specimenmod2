package net.mcreator.specimentmod.procedures;

import net.neoforged.bus.api.Event;

public class LavacastLorsqueLeProjectileToucheUnBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x + 0.5, y + 1, z + 0.5), Blocks.LAVA.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 0.5, y + 2, z + 0.5), Blocks.LAVA.defaultBlockState(), 3);
	}
}
