
package net.mcreator.altest.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.altest.item.BatteryItemItem;
import net.mcreator.altest.AltestModElements;

@AltestModElements.ModElement.Tag
public class EnergyItemGroup extends AltestModElements.ModElement {
	public EnergyItemGroup(AltestModElements instance) {
		super(instance, 675);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabenergy") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(BatteryItemItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}

	public static ItemGroup tab;
}
