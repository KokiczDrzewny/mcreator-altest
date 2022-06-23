
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
public class EnderiteSwordItem extends AltestModElements.ModElement {
	@ObjectHolder("altest:enderite_sword")
	public static final Item block = null;

	public EnderiteSwordItem(AltestModElements instance) {
		super(instance, 73);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 3072;
			}

			public float getEfficiency() {
				return 18f;
			}

			public float getAttackDamage() {
				return 34f;
			}

			public int getHarvestLevel() {
				return 12;
			}

			public int getEnchantability() {
				return 84;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(EnderiteIngotItem.block));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("enderite_sword"));
	}
}
