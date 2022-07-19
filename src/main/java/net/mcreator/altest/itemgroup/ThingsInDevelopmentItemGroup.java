
package net.mcreator.altest.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.altest.block.InDevelopmentBlockBlock;
import net.mcreator.altest.AltestModElements;

@AltestModElements.ModElement.Tag
public class ThingsInDevelopmentItemGroup extends AltestModElements.ModElement {
	public ThingsInDevelopmentItemGroup(AltestModElements instance) {
		super(instance, 753);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabthings_in_development") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(InDevelopmentBlockBlock.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
