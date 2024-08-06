package net.mcreator.specimentmod.procedures;

import net.neoforged.bus.api.Event;

public class DarkMcqueenBossQuandLentiteMeurtProcedure {
	public static void execute(LevelAccessor world) {
		SpecimentModModVariables.WorldVariables.get(world).darkmcqueenphase2 = 0;
		SpecimentModModVariables.WorldVariables.get(world).syncData(world);
	}
}
