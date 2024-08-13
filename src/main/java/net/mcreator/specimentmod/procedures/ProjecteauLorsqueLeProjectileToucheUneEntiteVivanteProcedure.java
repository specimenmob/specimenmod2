package net.mcreator.specimentmod.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class ProjecteauLorsqueLeProjectileToucheUneEntiteVivanteProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.setBlock(BlockPos.containing(x, y + 2, z), Blocks.WATER.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y + 1, z), Blocks.WATER.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 1, y, z), Blocks.WATER.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x + 2, y, z), Blocks.WATER.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, z + 1), Blocks.WATER.defaultBlockState(), 3);
		world.setBlock(BlockPos.containing(x, y, z + 2), Blocks.WATER.defaultBlockState(), 3);
	}
}
