
package net.mcreator.specimentmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class FemiumItem extends Item {
	public FemiumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
