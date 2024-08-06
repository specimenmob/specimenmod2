package net.mcreator.specimentmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.specimentmod.block.model.BlocdarkmcqueenDisplayModel;
import net.mcreator.specimentmod.block.display.BlocdarkmcqueenDisplayItem;

public class BlocdarkmcqueenDisplayItemRenderer extends GeoItemRenderer<BlocdarkmcqueenDisplayItem> {
	public BlocdarkmcqueenDisplayItemRenderer() {
		super(new BlocdarkmcqueenDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkmcqueenDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
