
package net.mcreator.specimentmod.item;

import net.neoforged.neoforge.registries.RegisterEvent;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Holder;
import net.minecraft.Util;

import net.mcreator.specimentmod.procedures.FemisuperleggingsProcedure;
import net.mcreator.specimentmod.procedures.FemisuperhelmetProcedure;
import net.mcreator.specimentmod.procedures.FemisuperchestplateProcedure;
import net.mcreator.specimentmod.procedures.FemisuperbootsProcedure;
import net.mcreator.specimentmod.init.SpecimentModModItems;

import java.util.List;
import java.util.EnumMap;

import com.google.common.collect.Iterables;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public abstract class FemiSuperArmorItem extends ArmorItem {
	public static Holder<ArmorMaterial> ARMOR_MATERIAL = null;

	@SubscribeEvent
	public static void registerArmorMaterial(RegisterEvent event) {
		event.register(Registries.ARMOR_MATERIAL, registerHelper -> {
			ArmorMaterial armorMaterial = new ArmorMaterial(Util.make(new EnumMap<>(ArmorItem.Type.class), map -> {
				map.put(ArmorItem.Type.BOOTS, 6);
				map.put(ArmorItem.Type.LEGGINGS, 12);
				map.put(ArmorItem.Type.CHESTPLATE, 16);
				map.put(ArmorItem.Type.HELMET, 6);
				map.put(ArmorItem.Type.BODY, 16);
			}), 30, DeferredHolder.create(Registries.SOUND_EVENT, new ResourceLocation("item.armor.equip_netherite")), () -> Ingredient.of(new ItemStack(SpecimentModModItems.MINOX.get())),
					List.of(new ArmorMaterial.Layer(new ResourceLocation("speciment_mod:femium"))), 6f, 0.2f);
			registerHelper.register(new ResourceLocation("speciment_mod:femi_super_armor"), armorMaterial);
			ARMOR_MATERIAL = BuiltInRegistries.ARMOR_MATERIAL.wrapAsHolder(armorMaterial);
		});
	}

	public FemiSuperArmorItem(ArmorItem.Type type, Item.Properties properties) {
		super(ARMOR_MATERIAL, type, properties);
	}

	public static class Helmet extends FemiSuperArmorItem {
		public Helmet() {
			super(ArmorItem.Type.HELMET, new Item.Properties().durability(ArmorItem.Type.HELMET.getDurability(15)).fireResistant());
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				FemisuperhelmetProcedure.execute(itemstack);
			}
		}
	}

	public static class Chestplate extends FemiSuperArmorItem {
		public Chestplate() {
			super(ArmorItem.Type.CHESTPLATE, new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(15)).fireResistant());
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				FemisuperchestplateProcedure.execute(itemstack);
			}
		}
	}

	public static class Leggings extends FemiSuperArmorItem {
		public Leggings() {
			super(ArmorItem.Type.LEGGINGS, new Item.Properties().durability(ArmorItem.Type.LEGGINGS.getDurability(15)).fireResistant());
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				FemisuperleggingsProcedure.execute(itemstack);
			}
		}
	}

	public static class Boots extends FemiSuperArmorItem {
		public Boots() {
			super(ArmorItem.Type.BOOTS, new Item.Properties().durability(ArmorItem.Type.BOOTS.getDurability(15)).fireResistant());
		}

		@Override
		public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
			super.inventoryTick(itemstack, world, entity, slot, selected);
			if (entity instanceof Player player && Iterables.contains(player.getArmorSlots(), itemstack)) {
				FemisuperbootsProcedure.execute(itemstack);
			}
		}
	}
}
