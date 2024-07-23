
package net.mcreator.specimentmod.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class LesspecimenItem extends RecordItem {
	public LesspecimenItem() {
		super(0, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("speciment_mod:specimen")), new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON), 520);
	}
}
