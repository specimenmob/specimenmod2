package net.mcreator.specimentmod.block.renderer;

public class BlocdarkshyroDisplayItemRenderer extends GeoItemRenderer<BlocdarkshyroDisplayItem> {
	public BlocdarkshyroDisplayItemRenderer() {
		super(new BlocdarkshyroDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkshyroDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}