package net.mcreator.specimentmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.specimentmod.block.model.BlocdarkshyroBlockModel;
import net.mcreator.specimentmod.block.entity.BlocdarkshyroTileEntity;

public class BlocdarkshyroTileRenderer extends GeoBlockRenderer<BlocdarkshyroTileEntity> {
	public BlocdarkshyroTileRenderer() {
		super(new BlocdarkshyroBlockModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkshyroTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
