
package net.mcreator.specimentmod.client.renderer;

public class DarkKailonBossRenderer extends HumanoidMobRenderer<DarkKailonBossEntity, HumanoidModel<DarkKailonBossEntity>> {

	public DarkKailonBossRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);

		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));

	}

	@Override
	public ResourceLocation getTextureLocation(DarkKailonBossEntity entity) {
		return new ResourceLocation("speciment_mod:textures/entities/darkkailon.png");
	}

}
