
package net.mcreator.specimentmod.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class KailonActivationCrystalItem extends Item {
	public KailonActivationCrystalItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		KailonActiCryProProcedure.execute();
		return ar;
	}
}