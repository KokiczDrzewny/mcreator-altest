
package net.mcreator.altest;

import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.brewing.IBrewingRecipe;
import net.minecraftforge.common.brewing.BrewingRecipeRegistry;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;

import net.mcreator.altest.item.WaterInBowlItem;

@AltestModElements.ModElement.Tag
public class BowlOfWaterRecipeBrewingRecipe extends AltestModElements.ModElement {
	public BowlOfWaterRecipeBrewingRecipe(AltestModElements instance) {
		super(instance, 607);
	}

	@Override
	public void init(FMLCommonSetupEvent event) {
		BrewingRecipeRegistry.addRecipe(new CustomBrewingRecipe());
	}

	public static class CustomBrewingRecipe implements IBrewingRecipe {
		@Override
		public boolean isInput(ItemStack input) {
			return input.getItem() == Items.BOWL;
		}

		@Override
		public boolean isIngredient(ItemStack ingredient) {
			return ingredient.getItem() == Items.POTION;
		}

		@Override
		public ItemStack getOutput(ItemStack input, ItemStack ingredient) {
			if (isInput(input) && isIngredient(ingredient)) {
				return new ItemStack(WaterInBowlItem.block);
			}
			return ItemStack.EMPTY;
		}
	}
}
