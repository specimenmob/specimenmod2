package net.mcreator.specimentmod.block.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.specimentmod.block.entity.BlocdarkfemiTileEntity;

public class BlocdarkfemiBlockModel extends GeoModel<BlocdarkfemiTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlocdarkfemiTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "animations/blocboss2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlocdarkfemiTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "geo/blocboss2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlocdarkfemiTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "textures/block/blocdarkfemi.png");
	}
}
