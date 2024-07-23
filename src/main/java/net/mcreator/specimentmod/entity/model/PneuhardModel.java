package net.mcreator.specimentmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.entity.PneuhardEntity;

public class PneuhardModel extends GeoModel<PneuhardEntity> {
	@Override
	public ResourceLocation getAnimationResource(PneuhardEntity entity) {
		return new ResourceLocation("speciment_mod", "animations/hard.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PneuhardEntity entity) {
		return new ResourceLocation("speciment_mod", "geo/hard.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PneuhardEntity entity) {
		return new ResourceLocation("speciment_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
