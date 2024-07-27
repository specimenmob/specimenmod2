
package net.mcreator.specimentmod.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.specimentmod.entity.ZombieFemiEntity;
import net.mcreator.specimentmod.client.model.Modelzombiecustom;

public class ZombieFemiRenderer extends MobRenderer<ZombieFemiEntity, Modelzombiecustom<ZombieFemiEntity>> {
	public ZombieFemiRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelzombiecustom(context.bakeLayer(Modelzombiecustom.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ZombieFemiEntity entity) {
		return new ResourceLocation("speciment_mod:textures/entities/zombie.png");
	}
}
