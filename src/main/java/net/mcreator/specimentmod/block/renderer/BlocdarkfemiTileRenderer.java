package net.mcreator.specimentmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.specimentmod.block.model.BlocdarkfemiBlockModel;
import net.mcreator.specimentmod.block.entity.BlocdarkfemiTileEntity;

public class BlocdarkfemiTileRenderer extends GeoBlockRenderer<BlocdarkfemiTileEntity> {
	public BlocdarkfemiTileRenderer() {
		super(new BlocdarkfemiBlockModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkfemiTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
