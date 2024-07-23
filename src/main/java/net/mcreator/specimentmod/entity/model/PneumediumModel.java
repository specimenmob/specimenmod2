package net.mcreator.specimentmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.entity.PneumediumEntity;

public class PneumediumModel extends GeoModel<PneumediumEntity> {
	@Override
	public ResourceLocation getAnimationResource(PneumediumEntity entity) {
		return new ResourceLocation("speciment_mod", "animations/medium.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PneumediumEntity entity) {
		return new ResourceLocation("speciment_mod", "geo/medium.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PneumediumEntity entity) {
		return new ResourceLocation("speciment_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
