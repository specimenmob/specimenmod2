package net.mcreator.specimentmod.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.specimentmod.init.SpecimentModModItems;

public class McqueenTeleportationProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("speciment_mod:biomemcqueen"))) {
			if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
				ResourceKey<Level> destinationType = Level.OVERWORLD;
				if (_player.level().dimension() == destinationType)
					return;
				ServerLevel nextLevel = _player.server.getLevel(destinationType);
				if (nextLevel != null) {
					_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
					_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
					_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
					for (MobEffectInstance _effectinstance : _player.getActiveEffects())
						_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
					_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
				}
			}
		} else {
			if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("speciment_mod:biomeshyro"))) {
				if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
					ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("speciment_mod:mc_queen_manor"));
					if (_player.level().dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level().isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level().getServer(), _ent), "tp @s 6 250 9");
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(SpecimentModModItems.CATALYST_OF_MCQUEEN_MANOR.get(), 1200);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(SpecimentModModItems.CATALYST_OF_FEMI_FOREST.get(), 1200);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(SpecimentModModItems.CATALYST_OF_KAILON_KALEIDOSCOPE.get(), 1200);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(SpecimentModModItems.CATALYST_OF_MINO_MYSTERIA.get(), 1200);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(SpecimentModModItems.CATALYST_OF_SHYRO_SKYLAND.get(), 1200);
			} else {
				if (entity instanceof ServerPlayer _player && !_player.level().isClientSide()) {
					ResourceKey<Level> destinationType = ResourceKey.create(Registries.DIMENSION, new ResourceLocation("speciment_mod:mc_queen_manor"));
					if (_player.level().dimension() == destinationType)
						return;
					ServerLevel nextLevel = _player.server.getLevel(destinationType);
					if (nextLevel != null) {
						_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
						_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
						_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
						for (MobEffectInstance _effectinstance : _player.getActiveEffects())
							_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
						_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
					}
				}
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(SpecimentModModItems.CATALYST_OF_MCQUEEN_MANOR.get(), 1200);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(SpecimentModModItems.CATALYST_OF_FEMI_FOREST.get(), 1200);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(SpecimentModModItems.CATALYST_OF_KAILON_KALEIDOSCOPE.get(), 1200);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(SpecimentModModItems.CATALYST_OF_MINO_MYSTERIA.get(), 1200);
				if (entity instanceof Player _player)
					_player.getCooldowns().addCooldown(SpecimentModModItems.CATALYST_OF_SHYRO_SKYLAND.get(), 1200);
			}
		}
	}
}
