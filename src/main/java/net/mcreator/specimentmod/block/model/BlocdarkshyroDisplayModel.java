package net.mcreator.specimentmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.block.display.BlocdarkshyroDisplayItem;

public class BlocdarkshyroDisplayModel extends GeoModel<BlocdarkshyroDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BlocdarkshyroDisplayItem animatable) {
		return new ResourceLocation("speciment_mod", "animations/blocboss2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlocdarkshyroDisplayItem animatable) {
		return new ResourceLocation("speciment_mod", "geo/blocboss2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlocdarkshyroDisplayItem entity) {
		return new ResourceLocation("speciment_mod", "textures/block/blocdarkshyro.png");
	}
}
