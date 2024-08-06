package net.mcreator.specimentmod.procedures;

import net.neoforged.bus.api.Event;

public class DarkKailonBossQuandLentiteMeurtProcedure {
	public static void execute(LevelAccessor world) {
		SpecimentModModVariables.WorldVariables.get(world).darkkailonphase2 = 0;
		SpecimentModModVariables.WorldVariables.get(world).syncData(world);
	}
}
