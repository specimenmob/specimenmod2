package net.mcreator.specimentmod.block.model;

public class BlocdarkshyroBlockModel extends GeoModel<BlocdarkshyroTileEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlocdarkshyroTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "animations/blocboss2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlocdarkshyroTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "geo/blocboss2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlocdarkshyroTileEntity animatable) {
		return new ResourceLocation("speciment_mod", "textures/block/blocdarkshyro.png");
	}
}