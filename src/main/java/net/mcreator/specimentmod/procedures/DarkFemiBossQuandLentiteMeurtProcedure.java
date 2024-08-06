package net.mcreator.specimentmod.procedures;

import net.neoforged.bus.api.Event;

public class DarkFemiBossQuandLentiteMeurtProcedure {
	public static void execute(LevelAccessor world) {
		SpecimentModModVariables.WorldVariables.get(world).darkfemiphase2 = 0;
		SpecimentModModVariables.WorldVariables.get(world).syncData(world);
	}
}
