
package net.mcreator.altest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.altest.AltestModElements;

@AltestModElements.ModElement.Tag
public class UltimatepickItem extends AltestModElements.ModElement {
	@ObjectHolder("altest:ultimatepick")
	public static final Item block = null;

	public UltimatepickItem(AltestModElements instance) {
		super(instance, 41);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new PickaxeItem(new IItemTier() {
			public int getMaxUses() {
				return 25565;
			}

			public float getEfficiency() {
				return 99f;
			}

			public float getAttackDamage() {
				return 97f;
			}

			public int getHarvestLevel() {
				return 99;
			}

			public int getEnchantability() {
				return 99;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.EMPTY;
			}
		}, 1, 95f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
		}.setRegistryName("ultimatepick"));
	}
}
