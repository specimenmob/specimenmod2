package net.mcreator.specimentmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.specimentmod.block.model.BlocdarkshyroDisplayModel;
import net.mcreator.specimentmod.block.display.BlocdarkshyroDisplayItem;

public class BlocdarkshyroDisplayItemRenderer extends GeoItemRenderer<BlocdarkshyroDisplayItem> {
	public BlocdarkshyroDisplayItemRenderer() {
		super(new BlocdarkshyroDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkshyroDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
