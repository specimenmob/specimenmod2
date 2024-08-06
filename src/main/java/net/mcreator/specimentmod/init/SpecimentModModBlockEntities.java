
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.specimentmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.specimentmod.block.entity.BlocdarkshyroTileEntity;
import net.mcreator.specimentmod.block.entity.BlocdarkminoTileEntity;
import net.mcreator.specimentmod.block.entity.BlocdarkmcqueenTileEntity;
import net.mcreator.specimentmod.block.entity.BlocdarkkailonTileEntity;
import net.mcreator.specimentmod.block.entity.BlocdarkfemiTileEntity;
import net.mcreator.specimentmod.SpecimentModMod;

public class SpecimentModModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(BuiltInRegistries.BLOCK_ENTITY_TYPE, SpecimentModMod.MODID);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BLOCDARKSHYRO = register("blocdarkshyro", SpecimentModModBlocks.BLOCDARKSHYRO, BlocdarkshyroTileEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BLOCDARKKAILON = register("blocdarkkailon", SpecimentModModBlocks.BLOCDARKKAILON, BlocdarkkailonTileEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BLOCDARKMINO = register("blocdarkmino", SpecimentModModBlocks.BLOCDARKMINO, BlocdarkminoTileEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BLOCDARKFEMI = register("blocdarkfemi", SpecimentModModBlocks.BLOCDARKFEMI, BlocdarkfemiTileEntity::new);
	public static final DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> BLOCDARKMCQUEEN = register("blocdarkmcqueen", SpecimentModModBlocks.BLOCDARKMCQUEEN, BlocdarkmcqueenTileEntity::new);

	private static DeferredHolder<BlockEntityType<?>, BlockEntityType<?>> register(String registryname, DeferredHolder<Block, Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
