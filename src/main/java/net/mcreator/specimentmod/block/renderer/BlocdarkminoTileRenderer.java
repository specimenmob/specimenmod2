package net.mcreator.specimentmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.specimentmod.block.model.BlocdarkminoBlockModel;
import net.mcreator.specimentmod.block.entity.BlocdarkminoTileEntity;

public class BlocdarkminoTileRenderer extends GeoBlockRenderer<BlocdarkminoTileEntity> {
	public BlocdarkminoTileRenderer() {
		super(new BlocdarkminoBlockModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkminoTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
