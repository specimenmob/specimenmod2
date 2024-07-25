
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.specimentmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.specimentmod.block.ShyrosaBlock;
import net.mcreator.specimentmod.block.ShyroniteOreBlock;
import net.mcreator.specimentmod.block.ShyroniteBlockBlock;
import net.mcreator.specimentmod.block.ShyrociaWoodBlock;
import net.mcreator.specimentmod.block.ShyrociaStairsBlock;
import net.mcreator.specimentmod.block.ShyrociaSlabBlock;
import net.mcreator.specimentmod.block.ShyrociaPressurePlateBlock;
import net.mcreator.specimentmod.block.ShyrociaPlanksBlock;
import net.mcreator.specimentmod.block.ShyrociaLogBlock;
import net.mcreator.specimentmod.block.ShyrociaLeavesBlock;
import net.mcreator.specimentmod.block.ShyrociaFenceGateBlock;
import net.mcreator.specimentmod.block.ShyrociaFenceBlock;
import net.mcreator.specimentmod.block.ShyrociaDoorBlock;
import net.mcreator.specimentmod.block.ShyrociaButtonBlock;
import net.mcreator.specimentmod.block.ShyroSkylandPortalBlock;
import net.mcreator.specimentmod.block.MinoxOreBlock;
import net.mcreator.specimentmod.block.MinoxBlockBlock;
import net.mcreator.specimentmod.block.MinoriaWoodBlock;
import net.mcreator.specimentmod.block.MinoriaStairsBlock;
import net.mcreator.specimentmod.block.MinoriaSlabBlock;
import net.mcreator.specimentmod.block.MinoriaPressurePlateBlock;
import net.mcreator.specimentmod.block.MinoriaPlanksBlock;
import net.mcreator.specimentmod.block.MinoriaLogBlock;
import net.mcreator.specimentmod.block.MinoriaLeavesBlock;
import net.mcreator.specimentmod.block.MinoriaFenceGateBlock;
import net.mcreator.specimentmod.block.MinoriaFenceBlock;
import net.mcreator.specimentmod.block.MinoriaDoorBlock;
import net.mcreator.specimentmod.block.MinoriaButtonBlock;
import net.mcreator.specimentmod.block.MinoliaBlock;
import net.mcreator.specimentmod.block.MinoMysteriaPortalBlock;
import net.mcreator.specimentmod.block.MinitelBlock;
import net.mcreator.specimentmod.block.McqueeniumOreBlock;
import net.mcreator.specimentmod.block.McqueeniumBlockBlock;
import net.mcreator.specimentmod.block.McqueenelleBlock;
import net.mcreator.specimentmod.block.McqueencifoliaWoodBlock;
import net.mcreator.specimentmod.block.McqueencifoliaStairsBlock;
import net.mcreator.specimentmod.block.McqueencifoliaSlabBlock;
import net.mcreator.specimentmod.block.McqueencifoliaPressurePlateBlock;
import net.mcreator.specimentmod.block.McqueencifoliaPlanksBlock;
import net.mcreator.specimentmod.block.McqueencifoliaLogBlock;
import net.mcreator.specimentmod.block.McqueencifoliaLeavesBlock;
import net.mcreator.specimentmod.block.McqueencifoliaFenceGateBlock;
import net.mcreator.specimentmod.block.McqueencifoliaFenceBlock;
import net.mcreator.specimentmod.block.McqueencifoliaDoorBlock;
import net.mcreator.specimentmod.block.McqueencifoliaButtonBlock;
import net.mcreator.specimentmod.block.McQueenManorPortalBlock;
import net.mcreator.specimentmod.block.LafinPortalBlock;
import net.mcreator.specimentmod.block.KailoniteOreBlock;
import net.mcreator.specimentmod.block.KailoniteBlockBlock;
import net.mcreator.specimentmod.block.KailonisetumBlock;
import net.mcreator.specimentmod.block.KailoneaWoodBlock;
import net.mcreator.specimentmod.block.KailoneaStairsBlock;
import net.mcreator.specimentmod.block.KailoneaSlabBlock;
import net.mcreator.specimentmod.block.KailoneaPressurePlateBlock;
import net.mcreator.specimentmod.block.KailoneaPlanksBlock;
import net.mcreator.specimentmod.block.KailoneaLogBlock;
import net.mcreator.specimentmod.block.KailoneaLeavesBlock;
import net.mcreator.specimentmod.block.KailoneaFenceGateBlock;
import net.mcreator.specimentmod.block.KailoneaFenceBlock;
import net.mcreator.specimentmod.block.KailoneaDoorBlock;
import net.mcreator.specimentmod.block.KailoneaButtonBlock;
import net.mcreator.specimentmod.block.KailonKaleidoscopePortalBlock;
import net.mcreator.specimentmod.block.FemiumOreBlock;
import net.mcreator.specimentmod.block.FemiumBlockBlock;
import net.mcreator.specimentmod.block.FemirokoWoodBlock;
import net.mcreator.specimentmod.block.FemirokoStairsBlock;
import net.mcreator.specimentmod.block.FemirokoSlabBlock;
import net.mcreator.specimentmod.block.FemirokoPressurePlateBlock;
import net.mcreator.specimentmod.block.FemirokoPlanksBlock;
import net.mcreator.specimentmod.block.FemirokoLogBlock;
import net.mcreator.specimentmod.block.FemirokoLeavesBlock;
import net.mcreator.specimentmod.block.FemirokoFenceGateBlock;
import net.mcreator.specimentmod.block.FemirokoFenceBlock;
import net.mcreator.specimentmod.block.FemirokoDoorBlock;
import net.mcreator.specimentmod.block.FemirokoButtonBlock;
import net.mcreator.specimentmod.block.FemilisBlock;
import net.mcreator.specimentmod.block.CatalyseurUltimeBlock;
import net.mcreator.specimentmod.SpecimentModMod;

public class SpecimentModModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(SpecimentModMod.MODID);
	public static final DeferredHolder<Block, Block> FEMIUM_ORE = REGISTRY.register("femium_ore", FemiumOreBlock::new);
	public static final DeferredHolder<Block, Block> FEMIUM_BLOCK = REGISTRY.register("femium_block", FemiumBlockBlock::new);
	public static final DeferredHolder<Block, Block> KAILONITE_ORE = REGISTRY.register("kailonite_ore", KailoniteOreBlock::new);
	public static final DeferredHolder<Block, Block> KAILONITE_BLOCK = REGISTRY.register("kailonite_block", KailoniteBlockBlock::new);
	public static final DeferredHolder<Block, Block> FEMILIS = REGISTRY.register("femilis", FemilisBlock::new);
	public static final DeferredHolder<Block, Block> KAILON_KALEIDOSCOPE_PORTAL = REGISTRY.register("kailon_kaleidoscope_portal", KailonKaleidoscopePortalBlock::new);
	public static final DeferredHolder<Block, Block> SHYRO_SKYLAND_PORTAL = REGISTRY.register("shyro_skyland_portal", ShyroSkylandPortalBlock::new);
	public static final DeferredHolder<Block, Block> SHYRONITE_ORE = REGISTRY.register("shyronite_ore", ShyroniteOreBlock::new);
	public static final DeferredHolder<Block, Block> SHYRONITE_BLOCK = REGISTRY.register("shyronite_block", ShyroniteBlockBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENIUM_ORE = REGISTRY.register("mcqueenium_ore", McqueeniumOreBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENIUM_BLOCK = REGISTRY.register("mcqueenium_block", McqueeniumBlockBlock::new);
	public static final DeferredHolder<Block, Block> MINOX_ORE = REGISTRY.register("minox_ore", MinoxOreBlock::new);
	public static final DeferredHolder<Block, Block> MINOX_BLOCK = REGISTRY.register("minox_block", MinoxBlockBlock::new);
	public static final DeferredHolder<Block, Block> MC_QUEEN_MANOR_PORTAL = REGISTRY.register("mc_queen_manor_portal", McQueenManorPortalBlock::new);
	public static final DeferredHolder<Block, Block> MINO_MYSTERIA_PORTAL = REGISTRY.register("mino_mysteria_portal", MinoMysteriaPortalBlock::new);
	public static final DeferredHolder<Block, Block> KAILONISETUM = REGISTRY.register("kailonisetum", KailonisetumBlock::new);
	public static final DeferredHolder<Block, Block> MINOLIA = REGISTRY.register("minolia", MinoliaBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENELLE = REGISTRY.register("mcqueenelle", McqueenelleBlock::new);
	public static final DeferredHolder<Block, Block> SHYROSA = REGISTRY.register("shyrosa", ShyrosaBlock::new);
	public static final DeferredHolder<Block, Block> LAFIN_PORTAL = REGISTRY.register("lafin_portal", LafinPortalBlock::new);
	public static final DeferredHolder<Block, Block> MINITEL = REGISTRY.register("minitel", MinitelBlock::new);
	public static final DeferredHolder<Block, Block> FEMIROKO_WOOD = REGISTRY.register("femiroko_wood", FemirokoWoodBlock::new);
	public static final DeferredHolder<Block, Block> FEMIROKO_LOG = REGISTRY.register("femiroko_log", FemirokoLogBlock::new);
	public static final DeferredHolder<Block, Block> FEMIROKO_PLANKS = REGISTRY.register("femiroko_planks", FemirokoPlanksBlock::new);
	public static final DeferredHolder<Block, Block> FEMIROKO_LEAVES = REGISTRY.register("femiroko_leaves", FemirokoLeavesBlock::new);
	public static final DeferredHolder<Block, Block> FEMIROKO_STAIRS = REGISTRY.register("femiroko_stairs", FemirokoStairsBlock::new);
	public static final DeferredHolder<Block, Block> FEMIROKO_SLAB = REGISTRY.register("femiroko_slab", FemirokoSlabBlock::new);
	public static final DeferredHolder<Block, Block> FEMIROKO_FENCE = REGISTRY.register("femiroko_fence", FemirokoFenceBlock::new);
	public static final DeferredHolder<Block, Block> FEMIROKO_FENCE_GATE = REGISTRY.register("femiroko_fence_gate", FemirokoFenceGateBlock::new);
	public static final DeferredHolder<Block, Block> FEMIROKO_PRESSURE_PLATE = REGISTRY.register("femiroko_pressure_plate", FemirokoPressurePlateBlock::new);
	public static final DeferredHolder<Block, Block> FEMIROKO_BUTTON = REGISTRY.register("femiroko_button", FemirokoButtonBlock::new);
	public static final DeferredHolder<Block, Block> KAILONEA_WOOD = REGISTRY.register("kailonea_wood", KailoneaWoodBlock::new);
	public static final DeferredHolder<Block, Block> KAILONEA_LOG = REGISTRY.register("kailonea_log", KailoneaLogBlock::new);
	public static final DeferredHolder<Block, Block> KAILONEA_PLANKS = REGISTRY.register("kailonea_planks", KailoneaPlanksBlock::new);
	public static final DeferredHolder<Block, Block> KAILONEA_LEAVES = REGISTRY.register("kailonea_leaves", KailoneaLeavesBlock::new);
	public static final DeferredHolder<Block, Block> KAILONEA_STAIRS = REGISTRY.register("kailonea_stairs", KailoneaStairsBlock::new);
	public static final DeferredHolder<Block, Block> KAILONEA_SLAB = REGISTRY.register("kailonea_slab", KailoneaSlabBlock::new);
	public static final DeferredHolder<Block, Block> KAILONEA_FENCE = REGISTRY.register("kailonea_fence", KailoneaFenceBlock::new);
	public static final DeferredHolder<Block, Block> KAILONEA_FENCE_GATE = REGISTRY.register("kailonea_fence_gate", KailoneaFenceGateBlock::new);
	public static final DeferredHolder<Block, Block> KAILONEA_PRESSURE_PLATE = REGISTRY.register("kailonea_pressure_plate", KailoneaPressurePlateBlock::new);
	public static final DeferredHolder<Block, Block> KAILONEA_BUTTON = REGISTRY.register("kailonea_button", KailoneaButtonBlock::new);
	public static final DeferredHolder<Block, Block> FEMIROKO_DOOR = REGISTRY.register("femiroko_door", FemirokoDoorBlock::new);
	public static final DeferredHolder<Block, Block> KAILONEA_DOOR = REGISTRY.register("kailonea_door", KailoneaDoorBlock::new);
	public static final DeferredHolder<Block, Block> SHYROCIA_WOOD = REGISTRY.register("shyrocia_wood", ShyrociaWoodBlock::new);
	public static final DeferredHolder<Block, Block> SHYROCIA_LOG = REGISTRY.register("shyrocia_log", ShyrociaLogBlock::new);
	public static final DeferredHolder<Block, Block> SHYROCIA_PLANKS = REGISTRY.register("shyrocia_planks", ShyrociaPlanksBlock::new);
	public static final DeferredHolder<Block, Block> SHYROCIA_LEAVES = REGISTRY.register("shyrocia_leaves", ShyrociaLeavesBlock::new);
	public static final DeferredHolder<Block, Block> SHYROCIA_STAIRS = REGISTRY.register("shyrocia_stairs", ShyrociaStairsBlock::new);
	public static final DeferredHolder<Block, Block> SHYROCIA_SLAB = REGISTRY.register("shyrocia_slab", ShyrociaSlabBlock::new);
	public static final DeferredHolder<Block, Block> SHYROCIA_FENCE = REGISTRY.register("shyrocia_fence", ShyrociaFenceBlock::new);
	public static final DeferredHolder<Block, Block> SHYROCIA_FENCE_GATE = REGISTRY.register("shyrocia_fence_gate", ShyrociaFenceGateBlock::new);
	public static final DeferredHolder<Block, Block> SHYROCIA_PRESSURE_PLATE = REGISTRY.register("shyrocia_pressure_plate", ShyrociaPressurePlateBlock::new);
	public static final DeferredHolder<Block, Block> SHYROCIA_BUTTON = REGISTRY.register("shyrocia_button", ShyrociaButtonBlock::new);
	public static final DeferredHolder<Block, Block> MINORIA_WOOD = REGISTRY.register("minoria_wood", MinoriaWoodBlock::new);
	public static final DeferredHolder<Block, Block> MINORIA_LOG = REGISTRY.register("minoria_log", MinoriaLogBlock::new);
	public static final DeferredHolder<Block, Block> MINORIA_PLANKS = REGISTRY.register("minoria_planks", MinoriaPlanksBlock::new);
	public static final DeferredHolder<Block, Block> MINORIA_LEAVES = REGISTRY.register("minoria_leaves", MinoriaLeavesBlock::new);
	public static final DeferredHolder<Block, Block> MINORIA_STAIRS = REGISTRY.register("minoria_stairs", MinoriaStairsBlock::new);
	public static final DeferredHolder<Block, Block> MINORIA_SLAB = REGISTRY.register("minoria_slab", MinoriaSlabBlock::new);
	public static final DeferredHolder<Block, Block> MINORIA_FENCE = REGISTRY.register("minoria_fence", MinoriaFenceBlock::new);
	public static final DeferredHolder<Block, Block> MINORIA_FENCE_GATE = REGISTRY.register("minoria_fence_gate", MinoriaFenceGateBlock::new);
	public static final DeferredHolder<Block, Block> MINORIA_PRESSURE_PLATE = REGISTRY.register("minoria_pressure_plate", MinoriaPressurePlateBlock::new);
	public static final DeferredHolder<Block, Block> MINORIA_BUTTON = REGISTRY.register("minoria_button", MinoriaButtonBlock::new);
	public static final DeferredHolder<Block, Block> SHYROCIA_DOOR = REGISTRY.register("shyrocia_door", ShyrociaDoorBlock::new);
	public static final DeferredHolder<Block, Block> MINORIA_DOOR = REGISTRY.register("minoria_door", MinoriaDoorBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENCIFOLIA_WOOD = REGISTRY.register("mcqueencifolia_wood", McqueencifoliaWoodBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENCIFOLIA_LOG = REGISTRY.register("mcqueencifolia_log", McqueencifoliaLogBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENCIFOLIA_PLANKS = REGISTRY.register("mcqueencifolia_planks", McqueencifoliaPlanksBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENCIFOLIA_LEAVES = REGISTRY.register("mcqueencifolia_leaves", McqueencifoliaLeavesBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENCIFOLIA_STAIRS = REGISTRY.register("mcqueencifolia_stairs", McqueencifoliaStairsBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENCIFOLIA_SLAB = REGISTRY.register("mcqueencifolia_slab", McqueencifoliaSlabBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENCIFOLIA_FENCE = REGISTRY.register("mcqueencifolia_fence", McqueencifoliaFenceBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENCIFOLIA_FENCE_GATE = REGISTRY.register("mcqueencifolia_fence_gate", McqueencifoliaFenceGateBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENCIFOLIA_PRESSURE_PLATE = REGISTRY.register("mcqueencifolia_pressure_plate", McqueencifoliaPressurePlateBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENCIFOLIA_BUTTON = REGISTRY.register("mcqueencifolia_button", McqueencifoliaButtonBlock::new);
	public static final DeferredHolder<Block, Block> MCQUEENCIFOLIA_DOOR = REGISTRY.register("mcqueencifolia_door", McqueencifoliaDoorBlock::new);
	public static final DeferredHolder<Block, Block> CATALYSEUR_ULTIME = REGISTRY.register("catalyseur_ultime", CatalyseurUltimeBlock::new);

	// Start of user code block custom blocks
	// End of user code block custom blocks
	@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class BlocksClientSideHandler {
		@SubscribeEvent
		public static void blockColorLoad(RegisterColorHandlersEvent.Block event) {
			FemirokoLeavesBlock.blockColorLoad(event);
			KailoneaLeavesBlock.blockColorLoad(event);
		}
	}
}
