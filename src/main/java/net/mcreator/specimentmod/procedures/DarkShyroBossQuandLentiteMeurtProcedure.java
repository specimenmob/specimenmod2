package net.mcreator.specimentmod.procedures;

import net.minecraft.world.level.LevelAccessor;

import net.mcreator.specimentmod.network.SpecimentModModVariables;

public class DarkShyroBossQuandLentiteMeurtProcedure {
	public static void execute(LevelAccessor world) {
		SpecimentModModVariables.WorldVariables.get(world).darkshyrophase2 = 0;
		SpecimentModModVariables.WorldVariables.get(world).syncData(world);
	}
}
