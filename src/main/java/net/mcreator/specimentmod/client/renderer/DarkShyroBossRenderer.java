
package net.mcreator.specimentmod.client.renderer;

public class DarkShyroBossRenderer extends HumanoidMobRenderer<DarkShyroBossEntity, HumanoidModel<DarkShyroBossEntity>> {

	public DarkShyroBossRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(DarkShyroBossEntity entity) {
		return new ResourceLocation("speciment_mod:textures/entities/darkshyro.png");
	}

}
