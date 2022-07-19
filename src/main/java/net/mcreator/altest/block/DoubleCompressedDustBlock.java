
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
public class DoubleCompressedDustBlock extends AltestModElements.ModElement {
	@ObjectHolder("altest:double_compressed_dust")
	public static final Block block = null;

	public DoubleCompressedDustBlock(AltestModElements instance) {
		super(instance, 213);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}

	public static class CustomBlock extends FallingBlock {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.SAND).hardnessAndResistance(0.8999999999999999f, 6f).setLightLevel(s -> 0));
			setRegistryName("double_compressed_dust");
		}

		@Override
		public int getOpacity(BlockState state, IBlockReader worldIn, BlockPos pos) {
			return 15;
		}
	}
}
