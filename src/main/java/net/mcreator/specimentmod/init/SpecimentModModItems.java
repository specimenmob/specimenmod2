
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.specimentmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.common.DeferredSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.DoubleHighBlockItem;
import net.minecraft.world.item.BlockItem;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.specimentmod.item.SteakdeMimircrueItem;
import net.mcreator.specimentmod.item.SteakdeMimirItem;
import net.mcreator.specimentmod.item.StafflaveItem;
import net.mcreator.specimentmod.item.StafffeuItem;
import net.mcreator.specimentmod.item.StaffItem;
import net.mcreator.specimentmod.item.ShyroniteSwordItem;
import net.mcreator.specimentmod.item.ShyroniteShovelItem;
import net.mcreator.specimentmod.item.ShyronitePickaxeItem;
import net.mcreator.specimentmod.item.ShyroniteItem;
import net.mcreator.specimentmod.item.ShyroniteHoeItem;
import net.mcreator.specimentmod.item.ShyroniteAxeItem;
import net.mcreator.specimentmod.item.ShyroniteArmorItem;
import net.mcreator.specimentmod.item.ShyroSuperArmorItem;
import net.mcreator.specimentmod.item.ShyroActivationCrystalItem;
import net.mcreator.specimentmod.item.PoudredeshyrosaItem;
import net.mcreator.specimentmod.item.PoudredeminoliaItem;
import net.mcreator.specimentmod.item.PoudredekailonisetumItem;
import net.mcreator.specimentmod.item.PoudredefemilisItem;
import net.mcreator.specimentmod.item.PoudredeMcqueeniumItem;
import net.mcreator.specimentmod.item.PierredumacqueenmanorItem;
import net.mcreator.specimentmod.item.PierreduKailonKaleidoscopeItem;
import net.mcreator.specimentmod.item.PierredeshyroskylandItem;
import net.mcreator.specimentmod.item.PierredeminomysteriaItem;
import net.mcreator.specimentmod.item.PierredelafemiforestItem;
import net.mcreator.specimentmod.item.OrdredemissionItem;
import net.mcreator.specimentmod.item.MinoxSwordItem;
import net.mcreator.specimentmod.item.MinoxSuperArmorItem;
import net.mcreator.specimentmod.item.MinoxShovelItem;
import net.mcreator.specimentmod.item.MinoxPickaxeItem;
import net.mcreator.specimentmod.item.MinoxItem;
import net.mcreator.specimentmod.item.MinoxHoeItem;
import net.mcreator.specimentmod.item.MinoxAxeItem;
import net.mcreator.specimentmod.item.MinoxArmorItem;
import net.mcreator.specimentmod.item.MinoxActivationCrystalItem;
import net.mcreator.specimentmod.item.McqueeniumSwordItem;
import net.mcreator.specimentmod.item.McqueeniumShovelItem;
import net.mcreator.specimentmod.item.McqueeniumPickaxeItem;
import net.mcreator.specimentmod.item.McqueeniumItem;
import net.mcreator.specimentmod.item.McqueeniumHoeItem;
import net.mcreator.specimentmod.item.McqueeniumAxeItem;
import net.mcreator.specimentmod.item.McqueeniumArmorItem;
import net.mcreator.specimentmod.item.McqueenSuperArmorItem;
import net.mcreator.specimentmod.item.McqueenActivationCrystalItem;
import net.mcreator.specimentmod.item.LesspecimenItem;
import net.mcreator.specimentmod.item.Lerapdelaf1Item;
import net.mcreator.specimentmod.item.LafinItem;
import net.mcreator.specimentmod.item.KailoniteSwordItem;
import net.mcreator.specimentmod.item.KailoniteShovelItem;
import net.mcreator.specimentmod.item.KailonitePickaxeItem;
import net.mcreator.specimentmod.item.KailoniteItem;
import net.mcreator.specimentmod.item.KailoniteHoeItem;
import net.mcreator.specimentmod.item.KailoniteAxeItem;
import net.mcreator.specimentmod.item.KailoniteArmorItem;
import net.mcreator.specimentmod.item.KailonSuperArmorItem;
import net.mcreator.specimentmod.item.KailonActivationCrystalItem;
import net.mcreator.specimentmod.item.FemiumSwordItem;
import net.mcreator.specimentmod.item.FemiumShovelItem;
import net.mcreator.specimentmod.item.FemiumPickaxeItem;
import net.mcreator.specimentmod.item.FemiumItem;
import net.mcreator.specimentmod.item.FemiumHoeItem;
import net.mcreator.specimentmod.item.FemiumAxeItem;
import net.mcreator.specimentmod.item.FemiumArmorItem;
import net.mcreator.specimentmod.item.FemiSuperArmorItem;
import net.mcreator.specimentmod.item.FemiActivationCrystalItem;
import net.mcreator.specimentmod.item.CatalystOfShyroSkylandItem;
import net.mcreator.specimentmod.item.CatalystOfMinoMysteriaItem;
import net.mcreator.specimentmod.item.CatalystOfMcqueenManorItem;
import net.mcreator.specimentmod.item.CatalystOfKailonKaleidoscopeItem;
import net.mcreator.specimentmod.item.CatalystOfFemiForestItem;
import net.mcreator.specimentmod.item.CatalyseurvideItem;
import net.mcreator.specimentmod.item.BidonessenceItem;
import net.mcreator.specimentmod.item.BatondeventItem;
import net.mcreator.specimentmod.item.BatondesEauItem;
import net.mcreator.specimentmod.block.display.BlocdarkshyroDisplayItem;
import net.mcreator.specimentmod.block.display.BlocdarkminoDisplayItem;
import net.mcreator.specimentmod.block.display.BlocdarkmcqueenDisplayItem;
import net.mcreator.specimentmod.block.display.BlocdarkkailonDisplayItem;
import net.mcreator.specimentmod.block.display.BlocdarkfemiDisplayItem;
import net.mcreator.specimentmod.SpecimentModMod;

public class SpecimentModModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(BuiltInRegistries.ITEM, SpecimentModMod.MODID);
	public static final DeferredHolder<Item, Item> FEMIUM = REGISTRY.register("femium", FemiumItem::new);
	public static final DeferredHolder<Item, Item> FEMIUM_ORE = block(SpecimentModModBlocks.FEMIUM_ORE);
	public static final DeferredHolder<Item, Item> FEMIUM_BLOCK = block(SpecimentModModBlocks.FEMIUM_BLOCK);
	public static final DeferredHolder<Item, Item> FEMIUM_PICKAXE = REGISTRY.register("femium_pickaxe", FemiumPickaxeItem::new);
	public static final DeferredHolder<Item, Item> FEMIUM_AXE = REGISTRY.register("femium_axe", FemiumAxeItem::new);
	public static final DeferredHolder<Item, Item> FEMIUM_SWORD = REGISTRY.register("femium_sword", FemiumSwordItem::new);
	public static final DeferredHolder<Item, Item> FEMIUM_SHOVEL = REGISTRY.register("femium_shovel", FemiumShovelItem::new);
	public static final DeferredHolder<Item, Item> FEMIUM_HOE = REGISTRY.register("femium_hoe", FemiumHoeItem::new);
	public static final DeferredHolder<Item, Item> FEMIUM_ARMOR_HELMET = REGISTRY.register("femium_armor_helmet", FemiumArmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> FEMIUM_ARMOR_CHESTPLATE = REGISTRY.register("femium_armor_chestplate", FemiumArmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> FEMIUM_ARMOR_LEGGINGS = REGISTRY.register("femium_armor_leggings", FemiumArmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> FEMIUM_ARMOR_BOOTS = REGISTRY.register("femium_armor_boots", FemiumArmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> LERAPDELAF_1 = REGISTRY.register("lerapdelaf_1", Lerapdelaf1Item::new);
	public static final DeferredHolder<Item, Item> KAILONITE = REGISTRY.register("kailonite", KailoniteItem::new);
	public static final DeferredHolder<Item, Item> KAILONITE_ORE = block(SpecimentModModBlocks.KAILONITE_ORE);
	public static final DeferredHolder<Item, Item> KAILONITE_BLOCK = block(SpecimentModModBlocks.KAILONITE_BLOCK);
	public static final DeferredHolder<Item, Item> KAILONITE_PICKAXE = REGISTRY.register("kailonite_pickaxe", KailonitePickaxeItem::new);
	public static final DeferredHolder<Item, Item> KAILONITE_AXE = REGISTRY.register("kailonite_axe", KailoniteAxeItem::new);
	public static final DeferredHolder<Item, Item> KAILONITE_SWORD = REGISTRY.register("kailonite_sword", KailoniteSwordItem::new);
	public static final DeferredHolder<Item, Item> KAILONITE_SHOVEL = REGISTRY.register("kailonite_shovel", KailoniteShovelItem::new);
	public static final DeferredHolder<Item, Item> KAILONITE_HOE = REGISTRY.register("kailonite_hoe", KailoniteHoeItem::new);
	public static final DeferredHolder<Item, Item> KAILONITE_ARMOR_HELMET = REGISTRY.register("kailonite_armor_helmet", KailoniteArmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> KAILONITE_ARMOR_CHESTPLATE = REGISTRY.register("kailonite_armor_chestplate", KailoniteArmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> KAILONITE_ARMOR_LEGGINGS = REGISTRY.register("kailonite_armor_leggings", KailoniteArmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> KAILONITE_ARMOR_BOOTS = REGISTRY.register("kailonite_armor_boots", KailoniteArmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> FEMILIS = block(SpecimentModModBlocks.FEMILIS);
	public static final DeferredHolder<Item, Item> CATALYSEURVIDE = REGISTRY.register("catalyseurvide", CatalyseurvideItem::new);
	public static final DeferredHolder<Item, Item> POUDREDEFEMILIS = REGISTRY.register("poudredefemilis", PoudredefemilisItem::new);
	public static final DeferredHolder<Item, Item> PIERREDELAFEMIFOREST = REGISTRY.register("pierredelafemiforest", PierredelafemiforestItem::new);
	public static final DeferredHolder<Item, Item> SHYRONITE = REGISTRY.register("shyronite", ShyroniteItem::new);
	public static final DeferredHolder<Item, Item> SHYRONITE_ORE = block(SpecimentModModBlocks.SHYRONITE_ORE);
	public static final DeferredHolder<Item, Item> SHYRONITE_BLOCK = block(SpecimentModModBlocks.SHYRONITE_BLOCK);
	public static final DeferredHolder<Item, Item> SHYRONITE_PICKAXE = REGISTRY.register("shyronite_pickaxe", ShyronitePickaxeItem::new);
	public static final DeferredHolder<Item, Item> SHYRONITE_AXE = REGISTRY.register("shyronite_axe", ShyroniteAxeItem::new);
	public static final DeferredHolder<Item, Item> SHYRONITE_SWORD = REGISTRY.register("shyronite_sword", ShyroniteSwordItem::new);
	public static final DeferredHolder<Item, Item> SHYRONITE_SHOVEL = REGISTRY.register("shyronite_shovel", ShyroniteShovelItem::new);
	public static final DeferredHolder<Item, Item> SHYRONITE_HOE = REGISTRY.register("shyronite_hoe", ShyroniteHoeItem::new);
	public static final DeferredHolder<Item, Item> SHYRONITE_ARMOR_HELMET = REGISTRY.register("shyronite_armor_helmet", ShyroniteArmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> SHYRONITE_ARMOR_CHESTPLATE = REGISTRY.register("shyronite_armor_chestplate", ShyroniteArmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> SHYRONITE_ARMOR_LEGGINGS = REGISTRY.register("shyronite_armor_leggings", ShyroniteArmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> SHYRONITE_ARMOR_BOOTS = REGISTRY.register("shyronite_armor_boots", ShyroniteArmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> STEAKDE_MIMIRCRUE = REGISTRY.register("steakde_mimircrue", SteakdeMimircrueItem::new);
	public static final DeferredHolder<Item, Item> STEAKDE_MIMIR = REGISTRY.register("steakde_mimir", SteakdeMimirItem::new);
	public static final DeferredHolder<Item, Item> MIMIR_SPAWN_EGG = REGISTRY.register("mimir_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.MIMIR, -16751104, -65536, new Item.Properties()));
	public static final DeferredHolder<Item, Item> MCQUEENIUM = REGISTRY.register("mcqueenium", McqueeniumItem::new);
	public static final DeferredHolder<Item, Item> MCQUEENIUM_ORE = block(SpecimentModModBlocks.MCQUEENIUM_ORE);
	public static final DeferredHolder<Item, Item> MCQUEENIUM_BLOCK = block(SpecimentModModBlocks.MCQUEENIUM_BLOCK);
	public static final DeferredHolder<Item, Item> MCQUEENIUM_PICKAXE = REGISTRY.register("mcqueenium_pickaxe", McqueeniumPickaxeItem::new);
	public static final DeferredHolder<Item, Item> MCQUEENIUM_AXE = REGISTRY.register("mcqueenium_axe", McqueeniumAxeItem::new);
	public static final DeferredHolder<Item, Item> MCQUEENIUM_SWORD = REGISTRY.register("mcqueenium_sword", McqueeniumSwordItem::new);
	public static final DeferredHolder<Item, Item> MCQUEENIUM_SHOVEL = REGISTRY.register("mcqueenium_shovel", McqueeniumShovelItem::new);
	public static final DeferredHolder<Item, Item> MCQUEENIUM_HOE = REGISTRY.register("mcqueenium_hoe", McqueeniumHoeItem::new);
	public static final DeferredHolder<Item, Item> MCQUEENIUM_ARMOR_HELMET = REGISTRY.register("mcqueenium_armor_helmet", McqueeniumArmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> MCQUEENIUM_ARMOR_CHESTPLATE = REGISTRY.register("mcqueenium_armor_chestplate", McqueeniumArmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> MCQUEENIUM_ARMOR_LEGGINGS = REGISTRY.register("mcqueenium_armor_leggings", McqueeniumArmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> MCQUEENIUM_ARMOR_BOOTS = REGISTRY.register("mcqueenium_armor_boots", McqueeniumArmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> MINOX = REGISTRY.register("minox", MinoxItem::new);
	public static final DeferredHolder<Item, Item> MINOX_ORE = block(SpecimentModModBlocks.MINOX_ORE);
	public static final DeferredHolder<Item, Item> MINOX_BLOCK = block(SpecimentModModBlocks.MINOX_BLOCK);
	public static final DeferredHolder<Item, Item> MINOX_PICKAXE = REGISTRY.register("minox_pickaxe", MinoxPickaxeItem::new);
	public static final DeferredHolder<Item, Item> MINOX_AXE = REGISTRY.register("minox_axe", MinoxAxeItem::new);
	public static final DeferredHolder<Item, Item> MINOX_SWORD = REGISTRY.register("minox_sword", MinoxSwordItem::new);
	public static final DeferredHolder<Item, Item> MINOX_SHOVEL = REGISTRY.register("minox_shovel", MinoxShovelItem::new);
	public static final DeferredHolder<Item, Item> MINOX_HOE = REGISTRY.register("minox_hoe", MinoxHoeItem::new);
	public static final DeferredHolder<Item, Item> MINOX_ARMOR_HELMET = REGISTRY.register("minox_armor_helmet", MinoxArmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> MINOX_ARMOR_CHESTPLATE = REGISTRY.register("minox_armor_chestplate", MinoxArmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> MINOX_ARMOR_LEGGINGS = REGISTRY.register("minox_armor_leggings", MinoxArmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> MINOX_ARMOR_BOOTS = REGISTRY.register("minox_armor_boots", MinoxArmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> POUDREDEKAILONISETUM = REGISTRY.register("poudredekailonisetum", PoudredekailonisetumItem::new);
	public static final DeferredHolder<Item, Item> KAILONISETUM = block(SpecimentModModBlocks.KAILONISETUM);
	public static final DeferredHolder<Item, Item> POUDREDEMINOLIA = REGISTRY.register("poudredeminolia", PoudredeminoliaItem::new);
	public static final DeferredHolder<Item, Item> MINOLIA = block(SpecimentModModBlocks.MINOLIA);
	public static final DeferredHolder<Item, Item> PIERREDUMACQUEENMANOR = REGISTRY.register("pierredumacqueenmanor", PierredumacqueenmanorItem::new);
	public static final DeferredHolder<Item, Item> PIERREDEMINOMYSTERIA = REGISTRY.register("pierredeminomysteria", PierredeminomysteriaItem::new);
	public static final DeferredHolder<Item, Item> PIERREDU_KAILON_KALEIDOSCOPE = REGISTRY.register("pierredu_kailon_kaleidoscope", PierreduKailonKaleidoscopeItem::new);
	public static final DeferredHolder<Item, Item> PIERREDESHYROSKYLAND = REGISTRY.register("pierredeshyroskyland", PierredeshyroskylandItem::new);
	public static final DeferredHolder<Item, Item> BIDONESSENCE = REGISTRY.register("bidonessence", BidonessenceItem::new);
	public static final DeferredHolder<Item, Item> LESSPECIMEN = REGISTRY.register("lesspecimen", LesspecimenItem::new);
	public static final DeferredHolder<Item, Item> POUDREDE_MCQUEENIUM = REGISTRY.register("poudrede_mcqueenium", PoudredeMcqueeniumItem::new);
	public static final DeferredHolder<Item, Item> MCQUEENELLE = block(SpecimentModModBlocks.MCQUEENELLE);
	public static final DeferredHolder<Item, Item> SHYROSA = block(SpecimentModModBlocks.SHYROSA);
	public static final DeferredHolder<Item, Item> POUDREDESHYROSA = REGISTRY.register("poudredeshyrosa", PoudredeshyrosaItem::new);
	public static final DeferredHolder<Item, Item> LAFIN = REGISTRY.register("lafin", LafinItem::new);
	public static final DeferredHolder<Item, Item> ROCKY_SPAWN_EGG = REGISTRY.register("rocky_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.ROCKY, -6710887, -65281, new Item.Properties()));
	public static final DeferredHolder<Item, Item> PNEUSOFT_SPAWN_EGG = REGISTRY.register("pneusoft_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.PNEUSOFT, -16777216, -65536, new Item.Properties()));
	public static final DeferredHolder<Item, Item> PNEUMEDIUM_SPAWN_EGG = REGISTRY.register("pneumedium_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.PNEUMEDIUM, -16777216, -256, new Item.Properties()));
	public static final DeferredHolder<Item, Item> PNEUHARD_SPAWN_EGG = REGISTRY.register("pneuhard_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.PNEUHARD, -16777216, -1, new Item.Properties()));
	public static final DeferredHolder<Item, Item> PNEU_INTERMEDIAIRE_SPAWN_EGG = REGISTRY.register("pneu_intermediaire_spawn_egg",
			() -> new DeferredSpawnEggItem(SpecimentModModEntities.PNEU_INTERMEDIAIRE, -16777216, -13369600, new Item.Properties()));
	public static final DeferredHolder<Item, Item> PNEUWET_SPAWN_EGG = REGISTRY.register("pneuwet_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.PNEUWET, -16777216, -16750849, new Item.Properties()));
	public static final DeferredHolder<Item, Item> F_1_SPAWN_EGG = REGISTRY.register("f_1_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.F_1, -65536, -256, new Item.Properties()));
	public static final DeferredHolder<Item, Item> FEMIROKO_WOOD = block(SpecimentModModBlocks.FEMIROKO_WOOD);
	public static final DeferredHolder<Item, Item> FEMIROKO_LOG = block(SpecimentModModBlocks.FEMIROKO_LOG);
	public static final DeferredHolder<Item, Item> FEMIROKO_PLANKS = block(SpecimentModModBlocks.FEMIROKO_PLANKS);
	public static final DeferredHolder<Item, Item> FEMIROKO_LEAVES = block(SpecimentModModBlocks.FEMIROKO_LEAVES);
	public static final DeferredHolder<Item, Item> FEMIROKO_STAIRS = block(SpecimentModModBlocks.FEMIROKO_STAIRS);
	public static final DeferredHolder<Item, Item> FEMIROKO_SLAB = block(SpecimentModModBlocks.FEMIROKO_SLAB);
	public static final DeferredHolder<Item, Item> FEMIROKO_FENCE = block(SpecimentModModBlocks.FEMIROKO_FENCE);
	public static final DeferredHolder<Item, Item> FEMIROKO_FENCE_GATE = block(SpecimentModModBlocks.FEMIROKO_FENCE_GATE);
	public static final DeferredHolder<Item, Item> FEMIROKO_PRESSURE_PLATE = block(SpecimentModModBlocks.FEMIROKO_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> FEMIROKO_BUTTON = block(SpecimentModModBlocks.FEMIROKO_BUTTON);
	public static final DeferredHolder<Item, Item> KAILONEA_WOOD = block(SpecimentModModBlocks.KAILONEA_WOOD);
	public static final DeferredHolder<Item, Item> KAILONEA_LOG = block(SpecimentModModBlocks.KAILONEA_LOG);
	public static final DeferredHolder<Item, Item> KAILONEA_PLANKS = block(SpecimentModModBlocks.KAILONEA_PLANKS);
	public static final DeferredHolder<Item, Item> KAILONEA_LEAVES = block(SpecimentModModBlocks.KAILONEA_LEAVES);
	public static final DeferredHolder<Item, Item> KAILONEA_STAIRS = block(SpecimentModModBlocks.KAILONEA_STAIRS);
	public static final DeferredHolder<Item, Item> KAILONEA_SLAB = block(SpecimentModModBlocks.KAILONEA_SLAB);
	public static final DeferredHolder<Item, Item> KAILONEA_FENCE = block(SpecimentModModBlocks.KAILONEA_FENCE);
	public static final DeferredHolder<Item, Item> KAILONEA_FENCE_GATE = block(SpecimentModModBlocks.KAILONEA_FENCE_GATE);
	public static final DeferredHolder<Item, Item> KAILONEA_PRESSURE_PLATE = block(SpecimentModModBlocks.KAILONEA_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> KAILONEA_BUTTON = block(SpecimentModModBlocks.KAILONEA_BUTTON);
	public static final DeferredHolder<Item, Item> FEMIROKO_DOOR = doubleBlock(SpecimentModModBlocks.FEMIROKO_DOOR);
	public static final DeferredHolder<Item, Item> KAILONEA_DOOR = doubleBlock(SpecimentModModBlocks.KAILONEA_DOOR);
	public static final DeferredHolder<Item, Item> SHYROCIA_WOOD = block(SpecimentModModBlocks.SHYROCIA_WOOD);
	public static final DeferredHolder<Item, Item> SHYROCIA_LOG = block(SpecimentModModBlocks.SHYROCIA_LOG);
	public static final DeferredHolder<Item, Item> SHYROCIA_PLANKS = block(SpecimentModModBlocks.SHYROCIA_PLANKS);
	public static final DeferredHolder<Item, Item> SHYROCIA_LEAVES = block(SpecimentModModBlocks.SHYROCIA_LEAVES);
	public static final DeferredHolder<Item, Item> SHYROCIA_STAIRS = block(SpecimentModModBlocks.SHYROCIA_STAIRS);
	public static final DeferredHolder<Item, Item> SHYROCIA_SLAB = block(SpecimentModModBlocks.SHYROCIA_SLAB);
	public static final DeferredHolder<Item, Item> SHYROCIA_FENCE = block(SpecimentModModBlocks.SHYROCIA_FENCE);
	public static final DeferredHolder<Item, Item> SHYROCIA_FENCE_GATE = block(SpecimentModModBlocks.SHYROCIA_FENCE_GATE);
	public static final DeferredHolder<Item, Item> SHYROCIA_PRESSURE_PLATE = block(SpecimentModModBlocks.SHYROCIA_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> SHYROCIA_BUTTON = block(SpecimentModModBlocks.SHYROCIA_BUTTON);
	public static final DeferredHolder<Item, Item> MINORIA_WOOD = block(SpecimentModModBlocks.MINORIA_WOOD);
	public static final DeferredHolder<Item, Item> MINORIA_LOG = block(SpecimentModModBlocks.MINORIA_LOG);
	public static final DeferredHolder<Item, Item> MINORIA_PLANKS = block(SpecimentModModBlocks.MINORIA_PLANKS);
	public static final DeferredHolder<Item, Item> MINORIA_LEAVES = block(SpecimentModModBlocks.MINORIA_LEAVES);
	public static final DeferredHolder<Item, Item> MINORIA_STAIRS = block(SpecimentModModBlocks.MINORIA_STAIRS);
	public static final DeferredHolder<Item, Item> MINORIA_SLAB = block(SpecimentModModBlocks.MINORIA_SLAB);
	public static final DeferredHolder<Item, Item> MINORIA_FENCE = block(SpecimentModModBlocks.MINORIA_FENCE);
	public static final DeferredHolder<Item, Item> MINORIA_FENCE_GATE = block(SpecimentModModBlocks.MINORIA_FENCE_GATE);
	public static final DeferredHolder<Item, Item> MINORIA_PRESSURE_PLATE = block(SpecimentModModBlocks.MINORIA_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> MINORIA_BUTTON = block(SpecimentModModBlocks.MINORIA_BUTTON);
	public static final DeferredHolder<Item, Item> SHYROCIA_DOOR = doubleBlock(SpecimentModModBlocks.SHYROCIA_DOOR);
	public static final DeferredHolder<Item, Item> MINORIA_DOOR = doubleBlock(SpecimentModModBlocks.MINORIA_DOOR);
	public static final DeferredHolder<Item, Item> MCQUEENCIFOLIA_WOOD = block(SpecimentModModBlocks.MCQUEENCIFOLIA_WOOD);
	public static final DeferredHolder<Item, Item> MCQUEENCIFOLIA_LOG = block(SpecimentModModBlocks.MCQUEENCIFOLIA_LOG);
	public static final DeferredHolder<Item, Item> MCQUEENCIFOLIA_PLANKS = block(SpecimentModModBlocks.MCQUEENCIFOLIA_PLANKS);
	public static final DeferredHolder<Item, Item> MCQUEENCIFOLIA_LEAVES = block(SpecimentModModBlocks.MCQUEENCIFOLIA_LEAVES);
	public static final DeferredHolder<Item, Item> MCQUEENCIFOLIA_STAIRS = block(SpecimentModModBlocks.MCQUEENCIFOLIA_STAIRS);
	public static final DeferredHolder<Item, Item> MCQUEENCIFOLIA_SLAB = block(SpecimentModModBlocks.MCQUEENCIFOLIA_SLAB);
	public static final DeferredHolder<Item, Item> MCQUEENCIFOLIA_FENCE = block(SpecimentModModBlocks.MCQUEENCIFOLIA_FENCE);
	public static final DeferredHolder<Item, Item> MCQUEENCIFOLIA_FENCE_GATE = block(SpecimentModModBlocks.MCQUEENCIFOLIA_FENCE_GATE);
	public static final DeferredHolder<Item, Item> MCQUEENCIFOLIA_PRESSURE_PLATE = block(SpecimentModModBlocks.MCQUEENCIFOLIA_PRESSURE_PLATE);
	public static final DeferredHolder<Item, Item> MCQUEENCIFOLIA_BUTTON = block(SpecimentModModBlocks.MCQUEENCIFOLIA_BUTTON);
	public static final DeferredHolder<Item, Item> MCQUEENCIFOLIA_DOOR = doubleBlock(SpecimentModModBlocks.MCQUEENCIFOLIA_DOOR);
	public static final DeferredHolder<Item, Item> CATALYSEUR_ULTIME = block(SpecimentModModBlocks.CATALYSEUR_ULTIME);
	public static final DeferredHolder<Item, Item> ORDREDEMISSION = REGISTRY.register("ordredemission", OrdredemissionItem::new);
	public static final DeferredHolder<Item, Item> CHAROMANE_SPAWN_EGG = REGISTRY.register("charomane_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.CHAROMANE, -1, -16711681, new Item.Properties()));
	public static final DeferredHolder<Item, Item> MINOX_SUPER_ARMOR_HELMET = REGISTRY.register("minox_super_armor_helmet", MinoxSuperArmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> MINOX_SUPER_ARMOR_CHESTPLATE = REGISTRY.register("minox_super_armor_chestplate", MinoxSuperArmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> MINOX_SUPER_ARMOR_LEGGINGS = REGISTRY.register("minox_super_armor_leggings", MinoxSuperArmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> MINOX_SUPER_ARMOR_BOOTS = REGISTRY.register("minox_super_armor_boots", MinoxSuperArmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> MINOX_ACTIVATION_CRYSTAL = REGISTRY.register("minox_activation_crystal", MinoxActivationCrystalItem::new);
	public static final DeferredHolder<Item, Item> CATALYST_OF_FEMI_FOREST = REGISTRY.register("catalyst_of_femi_forest", CatalystOfFemiForestItem::new);
	public static final DeferredHolder<Item, Item> MINO_SAND = block(SpecimentModModBlocks.MINO_SAND);
	public static final DeferredHolder<Item, Item> MINO_SANDSTONE = block(SpecimentModModBlocks.MINO_SANDSTONE);
	public static final DeferredHolder<Item, Item> CATALYST_OF_KAILON_KALEIDOSCOPE = REGISTRY.register("catalyst_of_kailon_kaleidoscope", CatalystOfKailonKaleidoscopeItem::new);
	public static final DeferredHolder<Item, Item> CATALYST_OF_MINO_MYSTERIA = REGISTRY.register("catalyst_of_mino_mysteria", CatalystOfMinoMysteriaItem::new);
	public static final DeferredHolder<Item, Item> CATALYST_OF_MCQUEEN_MANOR = REGISTRY.register("catalyst_of_mcqueen_manor", CatalystOfMcqueenManorItem::new);
	public static final DeferredHolder<Item, Item> CATALYST_OF_SHYRO_SKYLAND = REGISTRY.register("catalyst_of_shyro_skyland", CatalystOfShyroSkylandItem::new);
	public static final DeferredHolder<Item, Item> ZOMBIE_FEMI_SPAWN_EGG = REGISTRY.register("zombie_femi_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.ZOMBIE_FEMI, -13408768, -26368, new Item.Properties()));
	public static final DeferredHolder<Item, Item> BLOCDARKFEMI = REGISTRY.register(SpecimentModModBlocks.BLOCDARKFEMI.getId().getPath(), () -> new BlocdarkfemiDisplayItem(SpecimentModModBlocks.BLOCDARKFEMI.get(), new Item.Properties()));
	public static final DeferredHolder<Item, Item> BLOCDARKKAILON = REGISTRY.register(SpecimentModModBlocks.BLOCDARKKAILON.getId().getPath(), () -> new BlocdarkkailonDisplayItem(SpecimentModModBlocks.BLOCDARKKAILON.get(), new Item.Properties()));
	public static final DeferredHolder<Item, Item> BLOCDARKMCQUEEN = REGISTRY.register(SpecimentModModBlocks.BLOCDARKMCQUEEN.getId().getPath(), () -> new BlocdarkmcqueenDisplayItem(SpecimentModModBlocks.BLOCDARKMCQUEEN.get(), new Item.Properties()));
	public static final DeferredHolder<Item, Item> BLOCDARKMINO = REGISTRY.register(SpecimentModModBlocks.BLOCDARKMINO.getId().getPath(), () -> new BlocdarkminoDisplayItem(SpecimentModModBlocks.BLOCDARKMINO.get(), new Item.Properties()));
	public static final DeferredHolder<Item, Item> BLOCDARKSHYRO = REGISTRY.register(SpecimentModModBlocks.BLOCDARKSHYRO.getId().getPath(), () -> new BlocdarkshyroDisplayItem(SpecimentModModBlocks.BLOCDARKSHYRO.get(), new Item.Properties()));
	public static final DeferredHolder<Item, Item> DARK_FEMI_BOSS_SPAWN_EGG = REGISTRY.register("dark_femi_boss_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.DARK_FEMI_BOSS, -13421773, -24064, new Item.Properties()));
	public static final DeferredHolder<Item, Item> DARK_MINO_BOSS_SPAWN_EGG = REGISTRY.register("dark_mino_boss_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.DARK_MINO_BOSS, -13421773, -12490271, new Item.Properties()));
	public static final DeferredHolder<Item, Item> DARK_KAILON_BOSS_SPAWN_EGG = REGISTRY.register("dark_kailon_boss_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.DARK_KAILON_BOSS, -13421773, -2949120, new Item.Properties()));
	public static final DeferredHolder<Item, Item> DARK_MCQUEEN_BOSS_SPAWN_EGG = REGISTRY.register("dark_mcqueen_boss_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.DARK_MCQUEEN_BOSS, -13421773, -5766913, new Item.Properties()));
	public static final DeferredHolder<Item, Item> DARK_SHYRO_BOSS_SPAWN_EGG = REGISTRY.register("dark_shyro_boss_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.DARK_SHYRO_BOSS, -13421773, -1, new Item.Properties()));
	public static final DeferredHolder<Item, Item> STAFFFEU = REGISTRY.register("stafffeu", StafffeuItem::new);
	public static final DeferredHolder<Item, Item> STAFF = REGISTRY.register("staff", StaffItem::new);
	public static final DeferredHolder<Item, Item> STAFFLAVE = REGISTRY.register("stafflave", StafflaveItem::new);
	public static final DeferredHolder<Item, Item> MCQUEEN_SUPER_ARMOR_HELMET = REGISTRY.register("mcqueen_super_armor_helmet", McqueenSuperArmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> MCQUEEN_SUPER_ARMOR_CHESTPLATE = REGISTRY.register("mcqueen_super_armor_chestplate", McqueenSuperArmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> MCQUEEN_SUPER_ARMOR_LEGGINGS = REGISTRY.register("mcqueen_super_armor_leggings", McqueenSuperArmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> MCQUEEN_SUPER_ARMOR_BOOTS = REGISTRY.register("mcqueen_super_armor_boots", McqueenSuperArmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> MCQUEEN_ACTIVATION_CRYSTAL = REGISTRY.register("mcqueen_activation_crystal", McqueenActivationCrystalItem::new);
	public static final DeferredHolder<Item, Item> FEMI_ACTIVATION_CRYSTAL = REGISTRY.register("femi_activation_crystal", FemiActivationCrystalItem::new);
	public static final DeferredHolder<Item, Item> FEMI_SUPER_ARMOR_HELMET = REGISTRY.register("femi_super_armor_helmet", FemiSuperArmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> FEMI_SUPER_ARMOR_CHESTPLATE = REGISTRY.register("femi_super_armor_chestplate", FemiSuperArmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> FEMI_SUPER_ARMOR_LEGGINGS = REGISTRY.register("femi_super_armor_leggings", FemiSuperArmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> FEMI_SUPER_ARMOR_BOOTS = REGISTRY.register("femi_super_armor_boots", FemiSuperArmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> KAILON_SUPER_ARMOR_HELMET = REGISTRY.register("kailon_super_armor_helmet", KailonSuperArmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> KAILON_SUPER_ARMOR_CHESTPLATE = REGISTRY.register("kailon_super_armor_chestplate", KailonSuperArmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> KAILON_SUPER_ARMOR_LEGGINGS = REGISTRY.register("kailon_super_armor_leggings", KailonSuperArmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> KAILON_SUPER_ARMOR_BOOTS = REGISTRY.register("kailon_super_armor_boots", KailonSuperArmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> SHYRO_SUPER_ARMOR_HELMET = REGISTRY.register("shyro_super_armor_helmet", ShyroSuperArmorItem.Helmet::new);
	public static final DeferredHolder<Item, Item> SHYRO_SUPER_ARMOR_CHESTPLATE = REGISTRY.register("shyro_super_armor_chestplate", ShyroSuperArmorItem.Chestplate::new);
	public static final DeferredHolder<Item, Item> SHYRO_SUPER_ARMOR_LEGGINGS = REGISTRY.register("shyro_super_armor_leggings", ShyroSuperArmorItem.Leggings::new);
	public static final DeferredHolder<Item, Item> SHYRO_SUPER_ARMOR_BOOTS = REGISTRY.register("shyro_super_armor_boots", ShyroSuperArmorItem.Boots::new);
	public static final DeferredHolder<Item, Item> KAILON_ACTIVATION_CRYSTAL = REGISTRY.register("kailon_activation_crystal", KailonActivationCrystalItem::new);
	public static final DeferredHolder<Item, Item> SHYRO_ACTIVATION_CRYSTAL = REGISTRY.register("shyro_activation_crystal", ShyroActivationCrystalItem::new);
	public static final DeferredHolder<Item, Item> BATONDEVENT = REGISTRY.register("batondevent", BatondeventItem::new);
	public static final DeferredHolder<Item, Item> BATONDES_EAU = REGISTRY.register("batondes_eau", BatondesEauItem::new);
	public static final DeferredHolder<Item, Item> TOURBILLON_SPAWN_EGG = REGISTRY.register("tourbillon_spawn_egg", () -> new DeferredSpawnEggItem(SpecimentModModEntities.TOURBILLON, -1, -1, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static DeferredHolder<Item, Item> block(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	private static DeferredHolder<Item, Item> doubleBlock(DeferredHolder<Block, Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new DoubleHighBlockItem(block.get(), new Item.Properties()));
	}
}
