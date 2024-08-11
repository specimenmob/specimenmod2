package net.mcreator.specimentmod.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.entity.TourbillonEntity;

public class TourbillonModel extends GeoModel<TourbillonEntity> {
	@Override
	public ResourceLocation getAnimationResource(TourbillonEntity entity) {
		return new ResourceLocation("speciment_mod", "animations/breeze_wind_-_converted_-_converted.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TourbillonEntity entity) {
		return new ResourceLocation("speciment_mod", "geo/breeze_wind_-_converted_-_converted.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TourbillonEntity entity) {
		return new ResourceLocation("speciment_mod", "textures/entities/" + entity.getTexture() + ".png");
	}

}
