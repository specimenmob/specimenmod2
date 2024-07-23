
package net.mcreator.specimentmod.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class McqueeniumItem extends Item {
	public McqueeniumItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
