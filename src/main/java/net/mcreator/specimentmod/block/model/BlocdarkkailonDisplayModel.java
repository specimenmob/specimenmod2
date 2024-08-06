package net.mcreator.specimentmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.block.display.BlocdarkkailonDisplayItem;

public class BlocdarkkailonDisplayModel extends GeoModel<BlocdarkkailonDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BlocdarkkailonDisplayItem animatable) {
		return new ResourceLocation("speciment_mod", "animations/blocboss2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlocdarkkailonDisplayItem animatable) {
		return new ResourceLocation("speciment_mod", "geo/blocboss2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlocdarkkailonDisplayItem entity) {
		return new ResourceLocation("speciment_mod", "textures/block/blocdarkkailon.png");
	}
}
