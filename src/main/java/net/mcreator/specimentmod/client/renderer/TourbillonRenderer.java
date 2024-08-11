
package net.mcreator.specimentmod.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import net.mcreator.specimentmod.entity.model.TourbillonModel;
import net.mcreator.specimentmod.entity.layer.TourbillonLayer;
import net.mcreator.specimentmod.entity.TourbillonEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TourbillonRenderer extends GeoEntityRenderer<TourbillonEntity> {
	public TourbillonRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new TourbillonModel());
		this.shadowRadius = 0.5f;
		this.addRenderLayer(new TourbillonLayer(this));
	}

	@Override
	public RenderType getRenderType(TourbillonEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, TourbillonEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, float red, float green,
			float blue, float alpha) {
		float scale = 1f;
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	protected float getDeathMaxRotation(TourbillonEntity entityLivingBaseIn) {
		return 0.0F;
	}
}
