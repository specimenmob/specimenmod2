package net.mcreator.specimentmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.specimentmod.network.SpecimentModModVariables;

public class DarkMinoBossQuandLentiteMeurtProcedure {
	public static void execute(LevelAccessor world) {
		SpecimentModModVariables.WorldVariables.get(world).darkminophase2 = 0;
		SpecimentModModVariables.WorldVariables.get(world).syncData(world);
	}
}
