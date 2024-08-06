package net.mcreator.specimentmod.block.renderer;

public class BlocdarkmcqueenTileRenderer extends GeoBlockRenderer<BlocdarkmcqueenTileEntity> {
	public BlocdarkmcqueenTileRenderer() {
		super(new BlocdarkmcqueenBlockModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkmcqueenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}