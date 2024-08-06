package net.mcreator.specimentmod.block.listener;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.block.entity.BlockEntityType;

import net.mcreator.specimentmod.init.SpecimentModModBlockEntities;
import net.mcreator.specimentmod.block.renderer.BlocdarkshyroTileRenderer;
import net.mcreator.specimentmod.block.renderer.BlocdarkminoTileRenderer;
import net.mcreator.specimentmod.block.renderer.BlocdarkmcqueenTileRenderer;
import net.mcreator.specimentmod.block.renderer.BlocdarkkailonTileRenderer;
import net.mcreator.specimentmod.block.renderer.BlocdarkfemiTileRenderer;
import net.mcreator.specimentmod.block.entity.BlocdarkshyroTileEntity;
import net.mcreator.specimentmod.block.entity.BlocdarkminoTileEntity;
import net.mcreator.specimentmod.block.entity.BlocdarkmcqueenTileEntity;
import net.mcreator.specimentmod.block.entity.BlocdarkkailonTileEntity;
import net.mcreator.specimentmod.block.entity.BlocdarkfemiTileEntity;
import net.mcreator.specimentmod.SpecimentModMod;

@EventBusSubscriber(modid = SpecimentModMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class ClientListener {
	@OnlyIn(Dist.CLIENT)
	@SubscribeEvent
	public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer((BlockEntityType<BlocdarkshyroTileEntity>) SpecimentModModBlockEntities.BLOCDARKSHYRO.get(), context -> new BlocdarkshyroTileRenderer());
		event.registerBlockEntityRenderer((BlockEntityType<BlocdarkkailonTileEntity>) SpecimentModModBlockEntities.BLOCDARKKAILON.get(), context -> new BlocdarkkailonTileRenderer());
		event.registerBlockEntityRenderer((BlockEntityType<BlocdarkminoTileEntity>) SpecimentModModBlockEntities.BLOCDARKMINO.get(), context -> new BlocdarkminoTileRenderer());
		event.registerBlockEntityRenderer((BlockEntityType<BlocdarkfemiTileEntity>) SpecimentModModBlockEntities.BLOCDARKFEMI.get(), context -> new BlocdarkfemiTileRenderer());
		event.registerBlockEntityRenderer((BlockEntityType<BlocdarkmcqueenTileEntity>) SpecimentModModBlockEntities.BLOCDARKMCQUEEN.get(), context -> new BlocdarkmcqueenTileRenderer());
	}
}
