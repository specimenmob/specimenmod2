package net.mcreator.specimentmod.client.renderer;

import com.mojang.math.Axis;

public class LavacastRenderer extends EntityRenderer<LavacastEntity> {

	private static final ResourceLocation texture = new ResourceLocation("speciment_mod:textures/entities/boule.png");

	private final ModelBoule model;

	public LavacastRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new ModelBoule(context.bakeLayer(ModelBoule.LAYER_LOCATION));
	}

	@Override
	public void render(LavacastEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(LavacastEntity entity) {
		return texture;
	}

}
