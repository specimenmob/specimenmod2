package net.mcreator.specimentmod.block.renderer;

public class BlocdarkshyroTileRenderer extends GeoBlockRenderer<BlocdarkshyroTileEntity> {
	public BlocdarkshyroTileRenderer() {
		super(new BlocdarkshyroBlockModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkshyroTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}