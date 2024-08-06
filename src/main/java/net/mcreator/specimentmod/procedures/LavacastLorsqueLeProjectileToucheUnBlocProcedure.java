package net.mcreator.specimentmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LavacastLorsqueLeProjectileToucheUnBlocProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x + 0.5, y + 1, z + 0.5), Blocks.LAVA.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 0.5, y + 2, z + 0.5), Blocks.LAVA.defaultBlockState(), 3);
	}
}
