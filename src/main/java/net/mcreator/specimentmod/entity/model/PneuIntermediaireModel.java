package net.mcreator.specimentmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.entity.PneuIntermediaireEntity;

public class PneuIntermediaireModel extends GeoModel<PneuIntermediaireEntity> {
	@Override
	public ResourceLocation getAnimationResource(PneuIntermediaireEntity entity) {
		return new ResourceLocation("speciment_mod", "animations/inter.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PneuIntermediaireEntity entity) {
		return new ResourceLocation("speciment_mod", "geo/inter.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PneuIntermediaireEntity entity) {
		return new ResourceLocation("speciment_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
