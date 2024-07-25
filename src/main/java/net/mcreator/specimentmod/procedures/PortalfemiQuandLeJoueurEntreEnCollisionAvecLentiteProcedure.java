package net.mcreator.specimentmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.specimentmod.network.SpecimentModModVariables;

public class PortalfemiQuandLeJoueurEntreEnCollisionAvecLentiteProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (SpecimentModModVariables.MapVariables.get(world).portalfemi == 1) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "execute as @p in speciment_mod:femi_forest run tp @p ~ ~ ~");
				}
			}
			SpecimentModModVariables.MapVariables.get(world).portalfemi = 2;
			SpecimentModModVariables.MapVariables.get(world).syncData(world);
		} else if (SpecimentModModVariables.MapVariables.get(world).portalfemi == 2) {
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "execute as @p in minecraft:overworld run tp @p ~ ~ ~");
				}
			}
			SpecimentModModVariables.MapVariables.get(world).portalfemi = 1;
			SpecimentModModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
