package net.mcreator.specimentmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.entity.PortalfemiEntity;

public class PortalfemiModel extends GeoModel<PortalfemiEntity> {
	@Override
	public ResourceLocation getAnimationResource(PortalfemiEntity entity) {
		return new ResourceLocation("speciment_mod", "animations/portailfemi.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PortalfemiEntity entity) {
		return new ResourceLocation("speciment_mod", "geo/portailfemi.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PortalfemiEntity entity) {
		return new ResourceLocation("speciment_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
