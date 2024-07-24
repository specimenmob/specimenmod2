package net.mcreator.specimentmod.procedures;

import net.neoforged.neoforge.event.tick.PlayerTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.init.SpecimentModModBlocks;

import javax.annotation.Nullable;

import java.util.Collections;

@EventBusSubscriber
public class CraftunlockmcqueenProcedure {
	@SubscribeEvent
	public static void onPlayerTick(PlayerTickEvent.Post event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(SpecimentModModBlocks.MCQUEENCIFOLIA_LOG.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("speciment_mod:mcqueencifolia_planks_log_recipe")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("speciment_mod:mcqueencifolia_wood_recipe")));
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(SpecimentModModBlocks.MCQUEENCIFOLIA_PLANKS.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("speciment_mod:mcqueencifolia_button_recipe")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("speciment_mod:mcqueencifolia_door_recipe")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("speciment_mod:mcqueencifolia_fence_gate_recipe")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("speciment_mod:mcqueencifolia_fence_recipe")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("speciment_mod:mcqueencifolia_pressure_plate_recipe")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("speciment_mod:mcqueencifolia_slab_recipe")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("speciment_mod:mcqueencifolia_stairs_recipe")));
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("speciment_mod:mcqueencifolia_stick_recipe")));
		}
		if (entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains(new ItemStack(SpecimentModModBlocks.MCQUEENCIFOLIA_WOOD.get())) : false) {
			if (entity instanceof ServerPlayer _serverPlayer)
				_serverPlayer.awardRecipesByKey(Collections.singletonList(new ResourceLocation("speciment_mod:mcqueencifolia_planks_log_recipe")));
		}
	}
}
