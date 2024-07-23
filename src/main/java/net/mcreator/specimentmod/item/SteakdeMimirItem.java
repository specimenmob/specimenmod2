
package net.mcreator.specimentmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SteakdeMimirItem extends Item {
	public SteakdeMimirItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(12).saturationModifier(14f).build()));
	}
}
