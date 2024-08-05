package net.mcreator.specimentmod.procedures;

import net.neoforged.neoforge.items.ItemHandlerHelper;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.specimentmod.network.SpecimentModModVariables;
import net.mcreator.specimentmod.init.SpecimentModModItems;

import javax.annotation.Nullable;

@EventBusSubscriber
public class StuffdedepartProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(SpecimentModModVariables.PLAYER_VARIABLES).kit == 0) {
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(Blocks.JUKEBOX).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			if (entity instanceof Player _player) {
				ItemStack _setstack = new ItemStack(SpecimentModModItems.ORDREDEMISSION.get()).copy();
				_setstack.setCount(1);
				ItemHandlerHelper.giveItemToPlayer(_player, _setstack);
			}
			{
				Entity _ent = entity;
				if (!_ent.level().isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level().getServer(), _ent),
							"give @a written_book[written_book_content={pages:['[[\"\",{\"text\":\"Rapport du 02 juillet 2024 :\",\"bold\":true,\"color\":\"red\"},\"\\\\n\\\\nNous avons d\u00E9couvert cinq fleurs \u00E9tranges poss\u00E9dant un pouvoir sp\u00E9cial. Nous allons mener d\\\\\\'autres recherches \u00E0 ce sujet.\"]]','[[\"\",{\"text\":\"Rapport du 10 juillet 2024 :\",\"bold\":true,\"color\":\"red\"},\"\\\\n\\\\n\",{\"text\":\"\u2022 \",\"color\":\"red\"},{\"text\":\"Transformation\",\"color\":\"red\",\"bold\":true},{\"text\":\" :\",\"color\":\"red\"},\" Lorsqu\\\\\\'elles sont cuites et combin\u00E9es avec de l\\\\\\'am\u00E9thyste, ces fleurs se transforment en pierres de t\u00E9l\u00E9portation vers d\\\\\\'autres dimensions.\"]]','[[\"\",{\"text\":\"Rapport du 15 juillet 2024 :\",\"color\":\"red\",\"bold\":true},\"\\\\n\\\\n\",{\"text\":\"\u2022 \",\"color\":\"red\"},{\"text\":\"Stabilisation\",\"color\":\"red\",\"bold\":true},{\"text\":\" :\",\"color\":\"red\"},\" Pour stabiliser ces pierres, nous avons utilis\u00E9 un catalyseur compos\u00E9 de :\\\\n1 B\u00E2ton de blaze\\\\n1 Obsidienne\\\\n1 Perle de l\\\\\\'Ender\"]]','[[\"\",{\"text\":\"Rapport du 27 juillet :\",\"bold\":true,\"color\":\"red\"},{\"text\":\"\\\\n\\\\n\",\"bold\":true},{\"text\":\"ATTENTION !!!\",\"bold\":true,\"color\":\"red\"},\"\\\\n\",{\"text\":\"\u2022 \",\"color\":\"red\"},{\"text\":\"Mise en Garde\",\"color\":\"red\",\"bold\":true},{\"text\":\" :\",\"color\":\"red\"},\"\\\\nLes dimensions sont des univers parall\u00E8les. Creuser et utiliser la t\u00E9l\u00E9portation peut vous bloquer dans la roche et causer la mort.\"]]'],title:\"Rapports de mission\",author:\"Specimen Agency\",generation:0}]");
				}
			}
			{
				SpecimentModModVariables.PlayerVariables _vars = entity.getData(SpecimentModModVariables.PLAYER_VARIABLES);
				_vars.kit = 1;
				_vars.syncPlayerVariables(entity);
			}
		}
	}
}
