package net.mcreator.specimentmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.specimentmod.block.model.BlocdarkkailonDisplayModel;
import net.mcreator.specimentmod.block.display.BlocdarkkailonDisplayItem;

public class BlocdarkkailonDisplayItemRenderer extends GeoItemRenderer<BlocdarkkailonDisplayItem> {
	public BlocdarkkailonDisplayItemRenderer() {
		super(new BlocdarkkailonDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkkailonDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
