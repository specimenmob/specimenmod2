package net.mcreator.specimentmod.block.renderer;

import software.bernie.geckolib.renderer.GeoItemRenderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.specimentmod.block.model.BlocdarkfemiDisplayModel;
import net.mcreator.specimentmod.block.display.BlocdarkfemiDisplayItem;

public class BlocdarkfemiDisplayItemRenderer extends GeoItemRenderer<BlocdarkfemiDisplayItem> {
	public BlocdarkfemiDisplayItemRenderer() {
		super(new BlocdarkfemiDisplayModel());
	}

	@Override
	public RenderType getRenderType(BlocdarkfemiDisplayItem animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}
}
