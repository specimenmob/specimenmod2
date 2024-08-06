package net.mcreator.specimentmod.procedures;

import net.neoforged.bus.api.Event;

public class DarkShyroBossQuandLentiteMeurtProcedure {
	public static void execute(LevelAccessor world) {
		SpecimentModModVariables.WorldVariables.get(world).darkshyrophase2 = 0;
		SpecimentModModVariables.WorldVariables.get(world).syncData(world);
	}
}
