
package net.mcreator.altest.block;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.altest.AltestModElements;

@AltestModElements.ModElement.Tag
public class CompressedDustBlock extends AltestModElements.ModElement {
	@ObjectHolder("altest:compressed_dust")
	public static final Block block = null;

	public CompressedDustBlock(AltestModElements instance) {
		super(instance, 200);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends FallingBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.SAND).hardnessAndResistance(0.7000000000000001f, 4f).setLightLevel(s -> 0));
			setRegistryName("compressed_dust");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}
	}
}
