package net.mcreator.specimentmod.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionHand;

import net.mcreator.specimentmod.network.SpecimentModModVariables;
import net.mcreator.specimentmod.init.SpecimentModModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class StuffdedepartProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(SpecimentModModVariables.PLAYER_VARIABLES).kit == 0) {
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(SpecimentModModItems.ORDREDEMISSION.get()).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			if (entity instanceof LivingEntity _entity) {
				ItemStack _setstack = new ItemStack(Blocks.JUKEBOX).copy();
				_setstack.setCount(1);
				_entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
				if (_entity instanceof Player _player)
					_player.getInventory().setChanged();
			}
			{
				SpecimentModModVariables.PlayerVariables _vars = entity.getData(SpecimentModModVariables.PLAYER_VARIABLES);
				_vars.kit = 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
