
package net.mcreator.altest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.altest.AltestModElements;

@AltestModElements.ModElement.Tag
public class TopazSwordItem extends AltestModElements.ModElement {
	@ObjectHolder("altest:topaz_sword")
	public static final Item block = null;

	public TopazSwordItem(AltestModElements instance) {
		super(instance, 69);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1444;
			}

			public float getEfficiency() {
				return 13f;
			}

			public float getAttackDamage() {
				return 19f;
			}

			public int getHarvestLevel() {
				return 7;
			}

			public int getEnchantability() {
				return 49;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(TopazItem.block));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("topaz_sword"));
	}
}
