
package net.mcreator.altest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.block.Blocks;

import net.mcreator.altest.AltestModElements;

@AltestModElements.ModElement.Tag
public class ObsidianSwordItem extends AltestModElements.ModElement {
	@ObjectHolder("altest:obsidian_sword")
	public static final Item block = null;

	public ObsidianSwordItem(AltestModElements instance) {
		super(instance, 74);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1680;
			}

			public float getEfficiency() {
				return 14f;
			}

			public float getAttackDamage() {
				return 21f;
			}

			public int getHarvestLevel() {
				return 8;
			}

			public int getEnchantability() {
				return 55;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.OBSIDIAN));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("obsidian_sword"));
	}
}
