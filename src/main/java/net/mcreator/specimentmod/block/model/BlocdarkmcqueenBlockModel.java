package net.mcreator.specimentmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.block.entity.BlocdarkmcqueenTileEntity;

public class BlocdarkmcqueenBlockModel extends GeoModel<BlocdarkmcqueenTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlocdarkmcqueenTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "animations/blocboss2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlocdarkmcqueenTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "geo/blocboss2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlocdarkmcqueenTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "textures/block/blocdarkmcqueen.png");
	}
}
