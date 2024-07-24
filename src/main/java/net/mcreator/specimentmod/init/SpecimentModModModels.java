
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.specimentmod.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.specimentmod.client.model.ModelBoule;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class SpecimentModModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelBoule.LAYER_LOCATION, ModelBoule::createBodyLayer);
	}
}
