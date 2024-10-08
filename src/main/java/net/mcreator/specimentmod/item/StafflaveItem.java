
package net.mcreator.specimentmod.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.specimentmod.procedures.StafflaveEvenementAuClicDroitDansLairProcedure;

public class StafflaveItem extends Item {
	public StafflaveItem() {
		super(new Item.Properties().durability(400).rarity(Rarity.EPIC));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		StafflaveEvenementAuClicDroitDansLairProcedure.execute(entity);
		return ar;
	}
}
