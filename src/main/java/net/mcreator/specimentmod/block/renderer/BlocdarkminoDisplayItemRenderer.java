package net.mcreator.specimentmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.specimentmod.block.model.BlocdarkminoDisplayModel;
import net.mcreator.specimentmod.block.display.BlocdarkminoDisplayItem;

public class BlocdarkminoDisplayItemRenderer extends GeoItemRenderer<BlocdarkminoDisplayItem> {
	public BlocdarkminoDisplayItemRenderer() {
		super(new BlocdarkminoDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkminoDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
