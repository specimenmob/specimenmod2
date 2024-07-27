
package net.mcreator.specimentmod.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class OrdredemissionItem extends RecordItem {
	public OrdredemissionItem() {
		super(0, () -> BuiltInRegistries.SOUND_EVENT.get(new ResourceLocation("speciment_mod:ordredemission")), new Item.Properties().stacksTo(1).rarity(Rarity.COMMON), 1860);
	}
}
