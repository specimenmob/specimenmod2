package net.mcreator.specimentmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.block.display.BlocdarkminoDisplayItem;

public class BlocdarkminoDisplayModel extends GeoModel<BlocdarkminoDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BlocdarkminoDisplayItem animatable) {
		return new ResourceLocation("speciment_mod", "animations/blocboss2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlocdarkminoDisplayItem animatable) {
		return new ResourceLocation("speciment_mod", "geo/blocboss2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlocdarkminoDisplayItem entity) {
		return new ResourceLocation("speciment_mod", "textures/block/blocdarkmino.png");
	}
}
