package net.mcreator.specimentmod.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import net.mcreator.specimentmod.init.SpecimentModModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class MinoxActivationCrystalEvenementAuClicDroitDansLairProcedure {
	@SubscribeEvent
	public static void onRightClickItem(PlayerInteractEvent.RightClickItem event) {
		if (event.getHand() != event.getEntity().getUsedItemHand())
			return;
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SpecimentModModItems.MINOX_ACTIVATION_CRYSTAL.get()) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("speciment_mod:minox_activation_armor")), SoundSource.VOICE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("speciment_mod:minox_activation_armor")), SoundSource.VOICE, 1, 1, false);
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(3, new ItemStack(SpecimentModModItems.MINOX_SUPER_ARMOR_HELMET.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(SpecimentModModItems.MINOX_SUPER_ARMOR_HELMET.get()));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(2, new ItemStack(SpecimentModModItems.MINOX_SUPER_ARMOR_CHESTPLATE.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SpecimentModModItems.MINOX_SUPER_ARMOR_CHESTPLATE.get()));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(1, new ItemStack(SpecimentModModItems.MINOX_SUPER_ARMOR_LEGGINGS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SpecimentModModItems.MINOX_SUPER_ARMOR_LEGGINGS.get()));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(0, new ItemStack(SpecimentModModItems.MINOX_SUPER_ARMOR_BOOTS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SpecimentModModItems.MINOX_SUPER_ARMOR_BOOTS.get()));
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(SpecimentModModItems.MINOX_ACTIVATION_CRYSTAL.get(), 200);
		}
	}
}
