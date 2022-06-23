package net.mcreator.altest.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;

import net.mcreator.altest.enchantment.HeartStealEnchantment;
import net.mcreator.altest.AltestMod;

import java.util.Map;

public class HeartStealerSwordLivingEntityIsHitWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("sourceentity") == null) {
			if (!dependencies.containsKey("sourceentity"))
				AltestMod.LOGGER.warn("Failed to load dependency sourceentity for procedure HeartStealerSwordLivingEntityIsHitWithTool!");
			return;
		}
		if (dependencies.get("itemstack") == null) {
			if (!dependencies.containsKey("itemstack"))
				AltestMod.LOGGER.warn("Failed to load dependency itemstack for procedure HeartStealerSwordLivingEntityIsHitWithTool!");
			return;
		}
		Entity sourceentity = (Entity) dependencies.get("sourceentity");
		ItemStack itemstack = (ItemStack) dependencies.get("itemstack");
		if (EnchantmentHelper.getEnchantmentLevel(HeartStealEnchantment.enchantment, itemstack) == 1) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 15, (int) 1));
		} else if (EnchantmentHelper.getEnchantmentLevel(HeartStealEnchantment.enchantment, itemstack) == 2) {
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.REGENERATION, (int) 15, (int) 2));
			if (sourceentity instanceof LivingEntity)
				((LivingEntity) sourceentity).addPotionEffect(new EffectInstance(Effects.SATURATION, (int) 10, (int) 1));
		}
	}
}
