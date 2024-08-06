
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.specimentmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.specimentmod.client.renderer.ZombieFemiRenderer;
import net.mcreator.specimentmod.client.renderer.RockyRenderer;
import net.mcreator.specimentmod.client.renderer.PneuwetRenderer;
import net.mcreator.specimentmod.client.renderer.PneusoftRenderer;
import net.mcreator.specimentmod.client.renderer.PneumediumRenderer;
import net.mcreator.specimentmod.client.renderer.PneuhardRenderer;
import net.mcreator.specimentmod.client.renderer.PneuIntermediaireRenderer;
import net.mcreator.specimentmod.client.renderer.MimirRenderer;
import net.mcreator.specimentmod.client.renderer.F1Renderer;
import net.mcreator.specimentmod.client.renderer.DarkFemiBossRenderer;
import net.mcreator.specimentmod.client.renderer.CharomaneRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class SpecimentModModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(SpecimentModModEntities.MIMIR.get(), MimirRenderer::new);
		event.registerEntityRenderer(SpecimentModModEntities.ROCKY.get(), RockyRenderer::new);
		event.registerEntityRenderer(SpecimentModModEntities.PNEUSOFT.get(), PneusoftRenderer::new);
		event.registerEntityRenderer(SpecimentModModEntities.PNEUMEDIUM.get(), PneumediumRenderer::new);
		event.registerEntityRenderer(SpecimentModModEntities.PNEUHARD.get(), PneuhardRenderer::new);
		event.registerEntityRenderer(SpecimentModModEntities.PNEU_INTERMEDIAIRE.get(), PneuIntermediaireRenderer::new);
		event.registerEntityRenderer(SpecimentModModEntities.PNEUWET.get(), PneuwetRenderer::new);
		event.registerEntityRenderer(SpecimentModModEntities.F_1.get(), F1Renderer::new);
		event.registerEntityRenderer(SpecimentModModEntities.CHAROMANE.get(), CharomaneRenderer::new);
		event.registerEntityRenderer(SpecimentModModEntities.ZOMBIE_FEMI.get(), ZombieFemiRenderer::new);
		event.registerEntityRenderer(SpecimentModModEntities.DARK_FEMI_BOSS.get(), DarkFemiBossRenderer::new);
	}
}
