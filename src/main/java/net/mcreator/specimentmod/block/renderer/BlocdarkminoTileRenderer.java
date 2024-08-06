package net.mcreator.specimentmod.block.renderer;

public class BlocdarkminoTileRenderer extends GeoBlockRenderer<BlocdarkminoTileEntity> {
	public BlocdarkminoTileRenderer() {
		super(new BlocdarkminoBlockModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkminoTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}