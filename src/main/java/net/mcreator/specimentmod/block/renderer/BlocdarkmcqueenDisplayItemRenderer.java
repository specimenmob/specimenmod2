package net.mcreator.specimentmod.block.renderer;

public class BlocdarkmcqueenDisplayItemRenderer extends GeoItemRenderer<BlocdarkmcqueenDisplayItem> {
	public BlocdarkmcqueenDisplayItemRenderer() {
		super(new BlocdarkmcqueenDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkmcqueenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}