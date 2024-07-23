
package net.mcreator.specimentmod.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class Lerapdelaf1Item extends RecordItem {
	public Lerapdelaf1Item() {
		super(0, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("speciment_mod:lerapdelaf1")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3160);
	}
}
