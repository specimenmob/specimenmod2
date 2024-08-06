package net.mcreator.specimentmod.client.renderer;

import com.mojang.math.Axis;

public class ProjectventRenderer extends EntityRenderer<ProjectventEntity> {

	private static final ResourceLocation texture = new ResourceLocation("speciment_mod:textures/entities/vent.png");

	private final Modelprojectvent model;

	public ProjectventRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modelprojectvent(context.bakeLayer(Modelprojectvent.LAYER_LOCATION));
	}

	@Override
	public void render(ProjectventEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		poseStack.mulPose(Axis.YP.rotationDegrees(Mth.lerp(partialTicks, entityIn.yRotO, entityIn.getYRot()) - 90));
		poseStack.mulPose(Axis.ZP.rotationDegrees(90 + Mth.lerp(partialTicks, entityIn.xRotO, entityIn.getXRot())));
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 1);
		poseStack.popPose();

		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(ProjectventEntity entity) {
		return texture;
	}

}
