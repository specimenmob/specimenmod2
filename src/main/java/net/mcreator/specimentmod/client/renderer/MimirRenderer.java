
package net.mcreator.specimentmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CowModel;

import net.mcreator.specimentmod.entity.MimirEntity;

public class MimirRenderer extends MobRenderer<MimirEntity, CowModel<MimirEntity>> {
	public MimirRenderer(EntityRendererProvider.Context context) {
		super(context, new CowModel(context.bakeLayer(ModelLayers.COW)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MimirEntity entity) {
		return new ResourceLocation("speciment_mod:textures/entities/cow.png");
	}
}
