package net.mcreator.specimentmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.entity.RockyEntity;

public class RockyModel extends GeoModel<RockyEntity> {
	@Override
	public ResourceLocation getAnimationResource(RockyEntity entity) {
		return new ResourceLocation("speciment_mod", "animations/rocky.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RockyEntity entity) {
		return new ResourceLocation("speciment_mod", "geo/rocky.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RockyEntity entity) {
		return new ResourceLocation("speciment_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
