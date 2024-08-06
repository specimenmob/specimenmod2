
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.specimentmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.specimentmod.SpecimentModMod;

public class SpecimentModModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SpecimentModMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MINO = REGISTRY.register("mino",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.speciment_mod.mino")).icon(() -> new ItemStack(SpecimentModModItems.CATALYST_OF_MINO_MYSTERIA.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpecimentModModItems.CATALYST_OF_MINO_MYSTERIA.get());
				tabData.accept(SpecimentModModItems.MINOX.get());
				tabData.accept(SpecimentModModBlocks.MINOX_ORE.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINOX_BLOCK.get().asItem());
				tabData.accept(SpecimentModModItems.MINOX_PICKAXE.get());
				tabData.accept(SpecimentModModItems.MINOX_AXE.get());
				tabData.accept(SpecimentModModItems.MINOX_SWORD.get());
				tabData.accept(SpecimentModModItems.MINOX_SHOVEL.get());
				tabData.accept(SpecimentModModItems.MINOX_HOE.get());
				tabData.accept(SpecimentModModItems.MINOX_ARMOR_HELMET.get());
				tabData.accept(SpecimentModModItems.MINOX_ARMOR_CHESTPLATE.get());
				tabData.accept(SpecimentModModItems.MINOX_ARMOR_LEGGINGS.get());
				tabData.accept(SpecimentModModItems.MINOX_ARMOR_BOOTS.get());
				tabData.accept(SpecimentModModBlocks.MINORIA_WOOD.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINORIA_LOG.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINORIA_LEAVES.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINORIA_PLANKS.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINORIA_STAIRS.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINORIA_SLAB.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINORIA_DOOR.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINORIA_FENCE.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINORIA_FENCE_GATE.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINORIA_PRESSURE_PLATE.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINORIA_BUTTON.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINOLIA.get().asItem());
				tabData.accept(SpecimentModModItems.POUDREDEMINOLIA.get());
				tabData.accept(SpecimentModModItems.PIERREDEMINOMYSTERIA.get());
				tabData.accept(SpecimentModModItems.MINOX_SUPER_ARMOR_HELMET.get());
				tabData.accept(SpecimentModModItems.MINOX_SUPER_ARMOR_CHESTPLATE.get());
				tabData.accept(SpecimentModModItems.MINOX_SUPER_ARMOR_LEGGINGS.get());
				tabData.accept(SpecimentModModItems.MINOX_SUPER_ARMOR_BOOTS.get());
				tabData.accept(SpecimentModModItems.MINOX_ACTIVATION_CRYSTAL.get());
				tabData.accept(SpecimentModModBlocks.MINO_SANDSTONE.get().asItem());
				tabData.accept(SpecimentModModBlocks.MINO_SAND.get().asItem());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SHYRO = REGISTRY.register("shyro",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.speciment_mod.shyro")).icon(() -> new ItemStack(SpecimentModModItems.CATALYST_OF_SHYRO_SKYLAND.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpecimentModModItems.CATALYST_OF_SHYRO_SKYLAND.get());
				tabData.accept(SpecimentModModItems.SHYRONITE.get());
				tabData.accept(SpecimentModModBlocks.SHYRONITE_ORE.get().asItem());
				tabData.accept(SpecimentModModBlocks.SHYRONITE_BLOCK.get().asItem());
				tabData.accept(SpecimentModModItems.SHYRONITE_SWORD.get());
				tabData.accept(SpecimentModModItems.SHYRONITE_PICKAXE.get());
				tabData.accept(SpecimentModModItems.SHYRONITE_AXE.get());
				tabData.accept(SpecimentModModItems.SHYRONITE_SHOVEL.get());
				tabData.accept(SpecimentModModItems.SHYRONITE_HOE.get());
				tabData.accept(SpecimentModModItems.SHYRONITE_ARMOR_HELMET.get());
				tabData.accept(SpecimentModModItems.SHYRONITE_ARMOR_CHESTPLATE.get());
				tabData.accept(SpecimentModModItems.SHYRONITE_ARMOR_LEGGINGS.get());
				tabData.accept(SpecimentModModItems.SHYRONITE_ARMOR_BOOTS.get());
				tabData.accept(SpecimentModModBlocks.SHYROCIA_WOOD.get().asItem());
				tabData.accept(SpecimentModModBlocks.SHYROCIA_LOG.get().asItem());
				tabData.accept(SpecimentModModBlocks.SHYROCIA_LEAVES.get().asItem());
				tabData.accept(SpecimentModModBlocks.SHYROCIA_PLANKS.get().asItem());
				tabData.accept(SpecimentModModBlocks.SHYROCIA_STAIRS.get().asItem());
				tabData.accept(SpecimentModModBlocks.SHYROCIA_SLAB.get().asItem());
				tabData.accept(SpecimentModModBlocks.SHYROCIA_DOOR.get().asItem());
				tabData.accept(SpecimentModModBlocks.SHYROCIA_FENCE.get().asItem());
				tabData.accept(SpecimentModModBlocks.SHYROCIA_FENCE_GATE.get().asItem());
				tabData.accept(SpecimentModModBlocks.SHYROCIA_PRESSURE_PLATE.get().asItem());
				tabData.accept(SpecimentModModBlocks.SHYROCIA_BUTTON.get().asItem());
				tabData.accept(SpecimentModModBlocks.SHYROSA.get().asItem());
				tabData.accept(SpecimentModModItems.POUDREDESHYROSA.get());
				tabData.accept(SpecimentModModItems.PIERREDESHYROSKYLAND.get());
				tabData.accept(SpecimentModModItems.CHAROMANE_SPAWN_EGG.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MC_QUEEN = REGISTRY.register("mc_queen",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.speciment_mod.mc_queen")).icon(() -> new ItemStack(SpecimentModModItems.CATALYST_OF_MCQUEEN_MANOR.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpecimentModModItems.CATALYST_OF_MCQUEEN_MANOR.get());
				tabData.accept(SpecimentModModItems.MCQUEENIUM.get());
				tabData.accept(SpecimentModModBlocks.MCQUEENIUM_ORE.get().asItem());
				tabData.accept(SpecimentModModBlocks.MCQUEENIUM_BLOCK.get().asItem());
				tabData.accept(SpecimentModModItems.MCQUEENIUM_SWORD.get());
				tabData.accept(SpecimentModModItems.MCQUEENIUM_PICKAXE.get());
				tabData.accept(SpecimentModModItems.MCQUEENIUM_AXE.get());
				tabData.accept(SpecimentModModItems.MCQUEENIUM_SHOVEL.get());
				tabData.accept(SpecimentModModItems.MCQUEENIUM_HOE.get());
				tabData.accept(SpecimentModModItems.MCQUEENIUM_ARMOR_HELMET.get());
				tabData.accept(SpecimentModModItems.MCQUEENIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(SpecimentModModItems.MCQUEENIUM_ARMOR_LEGGINGS.get());
				tabData.accept(SpecimentModModItems.MCQUEENIUM_ARMOR_BOOTS.get());
				tabData.accept(SpecimentModModBlocks.MCQUEENCIFOLIA_WOOD.get().asItem());
				tabData.accept(SpecimentModModBlocks.MCQUEENCIFOLIA_LOG.get().asItem());
				tabData.accept(SpecimentModModBlocks.MCQUEENCIFOLIA_LEAVES.get().asItem());
				tabData.accept(SpecimentModModBlocks.MCQUEENCIFOLIA_PLANKS.get().asItem());
				tabData.accept(SpecimentModModBlocks.MCQUEENCIFOLIA_STAIRS.get().asItem());
				tabData.accept(SpecimentModModBlocks.MCQUEENCIFOLIA_SLAB.get().asItem());
				tabData.accept(SpecimentModModBlocks.MCQUEENCIFOLIA_DOOR.get().asItem());
				tabData.accept(SpecimentModModBlocks.MCQUEENCIFOLIA_FENCE.get().asItem());
				tabData.accept(SpecimentModModBlocks.MCQUEENCIFOLIA_FENCE_GATE.get().asItem());
				tabData.accept(SpecimentModModBlocks.MCQUEENCIFOLIA_PRESSURE_PLATE.get().asItem());
				tabData.accept(SpecimentModModBlocks.MCQUEENCIFOLIA_BUTTON.get().asItem());
				tabData.accept(SpecimentModModBlocks.MCQUEENELLE.get().asItem());
				tabData.accept(SpecimentModModItems.POUDREDE_MCQUEENIUM.get());
				tabData.accept(SpecimentModModItems.PIERREDUMACQUEENMANOR.get());
				tabData.accept(SpecimentModModItems.ROCKY_SPAWN_EGG.get());
				tabData.accept(SpecimentModModItems.STAFF.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> KAILON = REGISTRY.register("kailon",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.speciment_mod.kailon")).icon(() -> new ItemStack(SpecimentModModItems.CATALYST_OF_KAILON_KALEIDOSCOPE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpecimentModModItems.CATALYST_OF_KAILON_KALEIDOSCOPE.get());
				tabData.accept(SpecimentModModItems.KAILONITE.get());
				tabData.accept(SpecimentModModBlocks.KAILONITE_ORE.get().asItem());
				tabData.accept(SpecimentModModBlocks.KAILONITE_BLOCK.get().asItem());
				tabData.accept(SpecimentModModItems.KAILONITE_SWORD.get());
				tabData.accept(SpecimentModModItems.KAILONITE_PICKAXE.get());
				tabData.accept(SpecimentModModItems.KAILONITE_AXE.get());
				tabData.accept(SpecimentModModItems.KAILONITE_SHOVEL.get());
				tabData.accept(SpecimentModModItems.KAILONITE_HOE.get());
				tabData.accept(SpecimentModModItems.KAILONITE_ARMOR_HELMET.get());
				tabData.accept(SpecimentModModItems.KAILONITE_ARMOR_CHESTPLATE.get());
				tabData.accept(SpecimentModModItems.KAILONITE_ARMOR_LEGGINGS.get());
				tabData.accept(SpecimentModModItems.KAILONITE_ARMOR_BOOTS.get());
				tabData.accept(SpecimentModModBlocks.KAILONEA_WOOD.get().asItem());
				tabData.accept(SpecimentModModBlocks.KAILONEA_LOG.get().asItem());
				tabData.accept(SpecimentModModBlocks.KAILONEA_LEAVES.get().asItem());
				tabData.accept(SpecimentModModBlocks.KAILONEA_PLANKS.get().asItem());
				tabData.accept(SpecimentModModBlocks.KAILONEA_STAIRS.get().asItem());
				tabData.accept(SpecimentModModBlocks.KAILONEA_SLAB.get().asItem());
				tabData.accept(SpecimentModModBlocks.KAILONEA_DOOR.get().asItem());
				tabData.accept(SpecimentModModBlocks.KAILONEA_FENCE.get().asItem());
				tabData.accept(SpecimentModModBlocks.KAILONEA_FENCE_GATE.get().asItem());
				tabData.accept(SpecimentModModBlocks.KAILONEA_PRESSURE_PLATE.get().asItem());
				tabData.accept(SpecimentModModBlocks.KAILONEA_BUTTON.get().asItem());
				tabData.accept(SpecimentModModBlocks.KAILONISETUM.get().asItem());
				tabData.accept(SpecimentModModItems.POUDREDEKAILONISETUM.get());
				tabData.accept(SpecimentModModItems.PIERREDU_KAILON_KALEIDOSCOPE.get());
				tabData.accept(SpecimentModModItems.LERAPDELAF_1.get());
				tabData.accept(SpecimentModModItems.BIDONESSENCE.get());
				tabData.accept(SpecimentModModItems.F_1_SPAWN_EGG.get());
				tabData.accept(SpecimentModModItems.PNEUSOFT_SPAWN_EGG.get());
				tabData.accept(SpecimentModModItems.PNEUMEDIUM_SPAWN_EGG.get());
				tabData.accept(SpecimentModModItems.PNEUHARD_SPAWN_EGG.get());
				tabData.accept(SpecimentModModItems.PNEU_INTERMEDIAIRE_SPAWN_EGG.get());
				tabData.accept(SpecimentModModItems.PNEUWET_SPAWN_EGG.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SPECIMEN = REGISTRY.register("specimen",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.speciment_mod.specimen")).icon(() -> new ItemStack(SpecimentModModItems.CATALYSEURVIDE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpecimentModModItems.CATALYSEURVIDE.get());
				tabData.accept(SpecimentModModItems.LAFIN.get());
				tabData.accept(SpecimentModModItems.LESSPECIMEN.get());
				tabData.accept(SpecimentModModBlocks.CATALYSEUR_ULTIME.get().asItem());
				tabData.accept(SpecimentModModItems.ORDREDEMISSION.get());
			})

					.build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FEMI_MARS = REGISTRY.register("femi_mars",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.speciment_mod.femi_mars")).icon(() -> new ItemStack(SpecimentModModItems.CATALYST_OF_FEMI_FOREST.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SpecimentModModItems.CATALYST_OF_FEMI_FOREST.get());
				tabData.accept(SpecimentModModItems.FEMIUM.get());
				tabData.accept(SpecimentModModBlocks.FEMIUM_ORE.get().asItem());
				tabData.accept(SpecimentModModBlocks.FEMIUM_BLOCK.get().asItem());
				tabData.accept(SpecimentModModItems.FEMIUM_SWORD.get());
				tabData.accept(SpecimentModModItems.FEMIUM_PICKAXE.get());
				tabData.accept(SpecimentModModItems.FEMIUM_AXE.get());
				tabData.accept(SpecimentModModItems.FEMIUM_SHOVEL.get());
				tabData.accept(SpecimentModModItems.FEMIUM_HOE.get());
				tabData.accept(SpecimentModModItems.FEMIUM_ARMOR_HELMET.get());
				tabData.accept(SpecimentModModItems.FEMIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(SpecimentModModItems.FEMIUM_ARMOR_LEGGINGS.get());
				tabData.accept(SpecimentModModItems.FEMIUM_ARMOR_BOOTS.get());
				tabData.accept(SpecimentModModBlocks.FEMIROKO_WOOD.get().asItem());
				tabData.accept(SpecimentModModBlocks.FEMIROKO_LOG.get().asItem());
				tabData.accept(SpecimentModModBlocks.FEMIROKO_LEAVES.get().asItem());
				tabData.accept(SpecimentModModBlocks.FEMIROKO_PLANKS.get().asItem());
				tabData.accept(SpecimentModModBlocks.FEMIROKO_STAIRS.get().asItem());
				tabData.accept(SpecimentModModBlocks.FEMIROKO_SLAB.get().asItem());
				tabData.accept(SpecimentModModBlocks.FEMIROKO_DOOR.get().asItem());
				tabData.accept(SpecimentModModBlocks.FEMIROKO_FENCE.get().asItem());
				tabData.accept(SpecimentModModBlocks.FEMIROKO_FENCE_GATE.get().asItem());
				tabData.accept(SpecimentModModBlocks.FEMIROKO_PRESSURE_PLATE.get().asItem());
				tabData.accept(SpecimentModModBlocks.FEMIROKO_BUTTON.get().asItem());
				tabData.accept(SpecimentModModBlocks.FEMILIS.get().asItem());
				tabData.accept(SpecimentModModItems.POUDREDEFEMILIS.get());
				tabData.accept(SpecimentModModItems.PIERREDELAFEMIFOREST.get());
				tabData.accept(SpecimentModModItems.STEAKDE_MIMIRCRUE.get());
				tabData.accept(SpecimentModModItems.STEAKDE_MIMIR.get());
				tabData.accept(SpecimentModModItems.MIMIR_SPAWN_EGG.get());
				tabData.accept(SpecimentModModItems.ZOMBIE_FEMI_SPAWN_EGG.get());
				tabData.accept(SpecimentModModItems.STAFFFEU.get());
				tabData.accept(SpecimentModModItems.STAFFLAVE.get());
			})

					.build());
}
