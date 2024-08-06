package net.mcreator.specimentmod.block.renderer;

public class BlocdarkminoDisplayItemRenderer extends GeoItemRenderer<BlocdarkminoDisplayItem> {
	public BlocdarkminoDisplayItemRenderer() {
		super(new BlocdarkminoDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkminoDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}