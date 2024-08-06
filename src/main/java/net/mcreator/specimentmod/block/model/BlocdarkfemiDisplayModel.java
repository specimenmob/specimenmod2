package net.mcreator.specimentmod.block.model;

public class BlocdarkfemiDisplayModel extends GeoModel<BlocdarkfemiDisplayItem> {
	@Override
	public ResourceLocation getAnimationResource(BlocdarkfemiDisplayItem animatable) {
		return new ResourceLocation("speciment_mod", "animations/blocboss2.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlocdarkfemiDisplayItem animatable) {
		return new ResourceLocation("speciment_mod", "geo/blocboss2.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlocdarkfemiDisplayItem entity) {
		return new ResourceLocation("speciment_mod", "textures/block/blocdarkfemi.png");
	}
}