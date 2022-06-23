package net.mcreator.altest.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.block.Blocks;

import net.mcreator.altest.block.DustBlock;
import net.mcreator.altest.AltestMod;

import java.util.Map;

public class WoodenHammerBlockDestroyedWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AltestMod.LOGGER.warn("Failed to load dependency world for procedure WoodenHammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AltestMod.LOGGER.warn("Failed to load dependency x for procedure WoodenHammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AltestMod.LOGGER.warn("Failed to load dependency y for procedure WoodenHammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AltestMod.LOGGER.warn("Failed to load dependency z for procedure WoodenHammerBlockDestroyedWithTool!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.STONE) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.COBBLESTONE));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.COBBLESTONE) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.GRAVEL));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.GRAVEL) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(Blocks.SAND));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
		if ((world.getBlockState(new BlockPos(x, y, z))).getBlock() == Blocks.SAND) {
			world.destroyBlock(new BlockPos(x, y, z), false);
			if (world instanceof World && !world.isRemote()) {
				ItemEntity entityToSpawn = new ItemEntity((World) world, x, y, z, new ItemStack(DustBlock.block));
				entityToSpawn.setPickupDelay((int) 10);
				world.addEntity(entityToSpawn);
			}
		}
	}
}
