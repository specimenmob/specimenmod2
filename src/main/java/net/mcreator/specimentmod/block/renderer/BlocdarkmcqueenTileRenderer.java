package net.mcreator.specimentmod.block.renderer;

import software.bernie.geckolib.renderer.GeoBlockRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.specimentmod.block.model.BlocdarkmcqueenBlockModel;
import net.mcreator.specimentmod.block.entity.BlocdarkmcqueenTileEntity;

public class BlocdarkmcqueenTileRenderer extends GeoBlockRenderer<BlocdarkmcqueenTileEntity> {
	public BlocdarkmcqueenTileRenderer() {
		super(new BlocdarkmcqueenBlockModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkmcqueenTileEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
