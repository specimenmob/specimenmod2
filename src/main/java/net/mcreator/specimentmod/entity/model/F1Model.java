package net.mcreator.specimentmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.entity.F1Entity;

public class F1Model extends GeoModel<F1Entity> {
	@Override
	public ResourceLocation getAnimationResource(F1Entity entity) {
		return new ResourceLocation("speciment_mod", "animations/f1mob.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(F1Entity entity) {
		return new ResourceLocation("speciment_mod", "geo/f1mob.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(F1Entity entity) {
		return new ResourceLocation("speciment_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
