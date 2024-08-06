package net.mcreator.specimentmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.specimentmod.block.model.BlocdarkkailonBlockModel;
import net.mcreator.specimentmod.block.entity.BlocdarkkailonTileEntity;

public class BlocdarkkailonTileRenderer extends GeoBlockRenderer<BlocdarkkailonTileEntity> {
	public BlocdarkkailonTileRenderer() {
		super(new BlocdarkkailonBlockModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkkailonTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
