package net.mcreator.specimentmod.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class ShyrosuperhelmetProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(Enchantments.BINDING_CURSE, 1);
	}
}
