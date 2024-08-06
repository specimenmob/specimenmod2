package net.mcreator.specimentmod.block.renderer;

public class BlocdarkfemiTileRenderer extends GeoBlockRenderer<BlocdarkfemiTileEntity> {
	public BlocdarkfemiTileRenderer() {
		super(new BlocdarkfemiBlockModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkfemiTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}