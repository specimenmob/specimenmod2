package net.mcreator.specimentmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.block.entity.BlocdarkkailonTileEntity;

public class BlocdarkkailonBlockModel extends GeoModel<BlocdarkkailonTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlocdarkkailonTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "animations/blocboss2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlocdarkkailonTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "geo/blocboss2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlocdarkkailonTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "textures/block/blocdarkkailon.png");
	}
}
