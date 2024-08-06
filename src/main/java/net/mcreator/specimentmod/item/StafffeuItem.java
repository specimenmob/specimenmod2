
package net.mcreator.specimentmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class StafffeuItem extends Item {
	public StafffeuItem() {
		super(new Item.Properties().durability(400).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		StafffeuEvenementAuClicDroitDansLairProcedure.execute();
		return ar;
	}
}