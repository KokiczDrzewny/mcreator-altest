
package net.mcreator.altest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;

import net.mcreator.altest.AltestModElements;

@AltestModElements.ModElement.Tag
public class ZenItem extends AltestModElements.ModElement {
	@ObjectHolder("altest:zen")
	public static final Item block = null;

	public ZenItem(AltestModElements instance) {
		super(instance, 330);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}

	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, AltestModElements.sounds.get(new ResourceLocation("altest:zen")),
					new Item.Properties().group(ItemGroup.MISC).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("zen");
		}
	}
}
