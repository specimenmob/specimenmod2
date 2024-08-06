package net.mcreator.specimentmod.block.renderer;

public class BlocdarkkailonTileRenderer extends GeoBlockRenderer<BlocdarkkailonTileEntity> {
	public BlocdarkkailonTileRenderer() {
		super(new BlocdarkkailonBlockModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkkailonTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}