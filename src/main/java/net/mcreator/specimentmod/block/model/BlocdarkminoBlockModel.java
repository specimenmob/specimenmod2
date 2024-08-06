package net.mcreator.specimentmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.block.entity.BlocdarkminoTileEntity;

public class BlocdarkminoBlockModel extends GeoModel<BlocdarkminoTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlocdarkminoTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "animations/blocboss2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlocdarkminoTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "geo/blocboss2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlocdarkminoTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "textures/block/blocdarkmino.png");
	}
}
