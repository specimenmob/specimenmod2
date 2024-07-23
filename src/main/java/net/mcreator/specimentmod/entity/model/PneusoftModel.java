package net.mcreator.specimentmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.entity.PneusoftEntity;

public class PneusoftModel extends GeoModel<PneusoftEntity> {
	@Override
	public ResourceLocation getAnimationResource(PneusoftEntity entity) {
		return new ResourceLocation("speciment_mod", "animations/soft.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PneusoftEntity entity) {
		return new ResourceLocation("speciment_mod", "geo/soft.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PneusoftEntity entity) {
		return new ResourceLocation("speciment_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
