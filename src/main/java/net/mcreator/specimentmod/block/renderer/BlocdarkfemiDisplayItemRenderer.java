package net.mcreator.specimentmod.block.renderer;

public class BlocdarkfemiDisplayItemRenderer extends GeoItemRenderer<BlocdarkfemiDisplayItem> {
	public BlocdarkfemiDisplayItemRenderer() {
		super(new BlocdarkfemiDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkfemiDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}