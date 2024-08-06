package net.mcreator.specimentmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.block.display.BlocdarkmcqueenDisplayItem;

public class BlocdarkmcqueenDisplayModel extends GeoModel<BlocdarkmcqueenDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BlocdarkmcqueenDisplayItem animatable) {
		return new ResourceLocation("speciment_mod", "animations/blocboss2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlocdarkmcqueenDisplayItem animatable) {
		return new ResourceLocation("speciment_mod", "geo/blocboss2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlocdarkmcqueenDisplayItem entity) {
		return new ResourceLocation("speciment_mod", "textures/block/blocdarkmcqueen.png");
	}
}
