
package net.mcreator.altest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.altest.AltestModElements;

@AltestModElements.ModElement.Tag
public class DynamicItem extends AltestModElements.ModElement {
	@ObjectHolder("altest:dynamic")
	public static final Item block = null;

	public DynamicItem(AltestModElements instance) {
		super(instance, 334);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, AltestModElements.sounds.get(new ResourceLocation("altest:dynamic")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("dynamic");
		}
	}
}
