package net.mcreator.specimentmod.block.renderer;

public class BlocdarkkailonDisplayItemRenderer extends GeoItemRenderer<BlocdarkkailonDisplayItem> {
	public BlocdarkkailonDisplayItemRenderer() {
		super(new BlocdarkkailonDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkkailonDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}