
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.specimentmod.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.specimentmod.SpecimentModMod;

public class SpecimentModModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, SpecimentModMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> LERAPDELAF1 = REGISTRY.register("lerapdelaf1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("speciment_mod", "lerapdelaf1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TWITCH = REGISTRY.register("twitch", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("speciment_mod", "twitch")));
	public static final DeferredHolder<SoundEvent, SoundEvent> LECLERC = REGISTRY.register("leclerc", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("speciment_mod", "leclerc")));
	public static final DeferredHolder<SoundEvent, SoundEvent> BOXBOX = REGISTRY.register("boxbox", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("speciment_mod", "boxbox")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DEGATF1 = REGISTRY.register("degatf1", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("speciment_mod", "degatf1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MIMIR_DEATH = REGISTRY.register("mimir_death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("speciment_mod", "mimir_death")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SPECIMEN = REGISTRY.register("specimen", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("speciment_mod", "specimen")));
	public static final DeferredHolder<SoundEvent, SoundEvent> CHAROMANE = REGISTRY.register("charomane", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("speciment_mod", "charomane")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MINOX_ACTIVATION_ARMOR = REGISTRY.register("minox_activation_armor", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("speciment_mod", "minox_activation_armor")));
	public static final DeferredHolder<SoundEvent, SoundEvent> ORDREDEMISSION = REGISTRY.register("ordredemission", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("speciment_mod", "ordredemission")));
}
