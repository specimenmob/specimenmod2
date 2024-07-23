package net.mcreator.specimentmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.entity.PneuwetEntity;

public class PneuwetModel extends GeoModel<PneuwetEntity> {
	@Override
	public ResourceLocation getAnimationResource(PneuwetEntity entity) {
		return new ResourceLocation("speciment_mod", "animations/wet.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PneuwetEntity entity) {
		return new ResourceLocation("speciment_mod", "geo/wet.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PneuwetEntity entity) {
		return new ResourceLocation("speciment_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
