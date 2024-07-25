package net.mcreator.specimentmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.specimentmod.network.SpecimentModModVariables;

public class PortalfemiChaqueMiseAJourDeTickDeLentiteProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (SpecimentModModVariables.MapVariables.get(world).portalfemireset < 200) {
			SpecimentModModVariables.MapVariables.get(world).portalfemireset = SpecimentModModVariables.MapVariables.get(world).portalfemireset + 1;
			SpecimentModModVariables.MapVariables.get(world).syncData(world);
		} else {
			if (!entity.level().isClientSide())
				entity.discard();
			SpecimentModModVariables.MapVariables.get(world).portalfemireset = 0;
			SpecimentModModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
