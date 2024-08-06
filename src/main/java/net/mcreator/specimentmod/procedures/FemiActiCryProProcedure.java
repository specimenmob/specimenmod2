package net.mcreator.specimentmod.procedures;

import net.neoforged.bus.api.Event;

public class FemiActiCryProProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == SpecimentModModItems.FEMI_ACTIVATION_CRYSTAL.get()) {
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(3, new ItemStack(SpecimentModModItems.FEMI_SUPER_ARMOR_HELMET.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(SpecimentModModItems.FEMI_SUPER_ARMOR_HELMET.get()));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(2, new ItemStack(SpecimentModModItems.FEMI_SUPER_ARMOR_CHESTPLATE.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SpecimentModModItems.FEMI_SUPER_ARMOR_CHESTPLATE.get()));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(1, new ItemStack(SpecimentModModItems.FEMI_SUPER_ARMOR_LEGGINGS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SpecimentModModItems.FEMI_SUPER_ARMOR_LEGGINGS.get()));
				}
			}
			{
				Entity _entity = entity;
				if (_entity instanceof Player _player) {
					_player.getInventory().armor.set(0, new ItemStack(SpecimentModModItems.FEMI_SUPER_ARMOR_BOOTS.get()));
					_player.getInventory().setChanged();
				} else if (_entity instanceof LivingEntity _living) {
					_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SpecimentModModItems.FEMI_SUPER_ARMOR_BOOTS.get()));
				}
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(SpecimentModModItems.FEMI_ACTIVATION_CRYSTAL.get(), 200);
		}
	}
}
