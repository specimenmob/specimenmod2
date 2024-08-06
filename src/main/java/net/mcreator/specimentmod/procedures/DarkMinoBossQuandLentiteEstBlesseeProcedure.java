package net.mcreator.specimentmod.procedures;

import net.neoforged.bus.api.Event;

public class DarkMinoBossQuandLentiteEstBlesseeProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity ) {
if (
entity == null ) return ;
if (==0) {if ((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth():-1)<=250) {if (world instanceof ServerLevel _level) {
LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(x,y,z)));
entityToSpawn.setVisualOnly(true);
_level.addFreshEntity(entityToSpawn);
}if (world instanceof ServerLevel _level)
_level.sendParticles(ParticleTypes.SOUL_FIRE_FLAME, x, y, z, 1000, 5, 5, 3, 1);if (entity instanceof LivingEntity _entity) {
ItemStack _setstack = new ItemStack(SpecimentModModItems.MINOX_SWORD.get()).copy();
_setstack.setCount(1);
_entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
if (_entity instanceof Player _player) _player.getInventory().setChanged();
}{
Entity _entity = entity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(3, new ItemStack(SpecimentModModItems.MINOX_ARMOR_HELMET.get()));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.HEAD, new ItemStack(SpecimentModModItems.MINOX_ARMOR_HELMET.get()));
}
}{
Entity _entity = entity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(2, new ItemStack(SpecimentModModItems.MINOX_ARMOR_CHESTPLATE.get()));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.CHEST, new ItemStack(SpecimentModModItems.MINOX_ARMOR_CHESTPLATE.get()));
}
}{
Entity _entity = entity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(1, new ItemStack(SpecimentModModItems.MINOX_ARMOR_LEGGINGS.get()));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.LEGS, new ItemStack(SpecimentModModItems.MINOX_ARMOR_LEGGINGS.get()));
}
}{
Entity _entity = entity;
if (_entity instanceof Player _player) {
_player.getInventory().armor.set(0, new ItemStack(SpecimentModModItems.MINOX_ARMOR_BOOTS.get()));
_player.getInventory().setChanged();
} else if (_entity instanceof LivingEntity _living) {
_living.setItemSlot(EquipmentSlot.FEET, new ItemStack(SpecimentModModItems.MINOX_ARMOR_BOOTS.get()));
}
}}}
}
}
