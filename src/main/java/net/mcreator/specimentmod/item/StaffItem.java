
package net.mcreator.specimentmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class StaffItem extends Item {
	public StaffItem() {
		super(new Item.Properties().durability(400).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		StaffEvenementAuClicDroitDansLairProcedure.execute();
		return ar;
	}
}