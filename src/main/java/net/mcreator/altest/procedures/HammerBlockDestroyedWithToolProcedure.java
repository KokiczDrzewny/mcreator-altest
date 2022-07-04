package net.mcreator.altest.procedures;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.block.Block;

import net.mcreator.altest.AltestMod;

import java.util.Map;

public class HammerBlockDestroyedWithToolProcedure {

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				AltestMod.LOGGER.warn("Failed to load dependency world for procedure HammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				AltestMod.LOGGER.warn("Failed to load dependency x for procedure HammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				AltestMod.LOGGER.warn("Failed to load dependency y for procedure HammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				AltestMod.LOGGER.warn("Failed to load dependency z for procedure HammerBlockDestroyedWithTool!");
			return;
		}
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				AltestMod.LOGGER.warn("Failed to load dependency entity for procedure HammerBlockDestroyedWithTool!");
			return;
		}
		IWorld world = (IWorld) dependencies.get("world");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		Entity entity = (Entity) dependencies.get("entity");
		if (entity.rotationYaw > 315 && entity.rotationYaw < 360 || entity.rotationYaw > 0 && entity.rotationYaw < 45) {
			if (world.getBlockState(new BlockPos(x, y, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z)), (World) world, new BlockPos(x, y, z));
					world.destroyBlock(new BlockPos(x, y, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y + 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y + 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z)), (World) world, new BlockPos(x, y + 1, z));
					world.destroyBlock(new BlockPos(x, y + 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y - 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y - 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z)), (World) world, new BlockPos(x, y - 1, z));
					world.destroyBlock(new BlockPos(x, y - 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x - 1, y - 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x - 1, y - 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y - 1, z)), (World) world, new BlockPos(x - 1, y - 1, z));
					world.destroyBlock(new BlockPos(x - 1, y - 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x - 1, y + 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x - 1, y - 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y + 1, z)), (World) world, new BlockPos(x - 1, y - 1, z));
					world.destroyBlock(new BlockPos(x - 1, y + 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x + 1, y - 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x + 1, y - 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y - 1, z)), (World) world, new BlockPos(x + 1, y - 1, z));
					world.destroyBlock(new BlockPos(x + 1, y - 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x + 1, y + 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x + 1, y + 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y + 1, z)), (World) world, new BlockPos(x + 1, y + 1, z));
					world.destroyBlock(new BlockPos(x + 1, y + 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x + 1, y, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x + 1, y, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z)), (World) world, new BlockPos(x + 1, y, z));
					world.destroyBlock(new BlockPos(x + 1, y, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x - 1, y, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x - 1, y, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z)), (World) world, new BlockPos(x - 1, y, z));
					world.destroyBlock(new BlockPos(x - 1, y, z), false);
				}
			}
		}
		if (entity.rotationYaw > 135 && entity.rotationYaw < 225) {
			if (world.getBlockState(new BlockPos(x, y, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z)), (World) world, new BlockPos(x, y, z));
					world.destroyBlock(new BlockPos(x, y, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y + 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y + 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z)), (World) world, new BlockPos(x, y + 1, z));
					world.destroyBlock(new BlockPos(x, y + 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y - 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y - 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z)), (World) world, new BlockPos(x, y - 1, z));
					world.destroyBlock(new BlockPos(x, y - 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x - 1, y - 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x - 1, y - 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y - 1, z)), (World) world, new BlockPos(x - 1, y - 1, z));
					world.destroyBlock(new BlockPos(x - 1, y - 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x - 1, y + 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x - 1, y - 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y + 1, z)), (World) world, new BlockPos(x - 1, y - 1, z));
					world.destroyBlock(new BlockPos(x - 1, y + 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x + 1, y - 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x + 1, y - 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y - 1, z)), (World) world, new BlockPos(x + 1, y - 1, z));
					world.destroyBlock(new BlockPos(x + 1, y - 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x + 1, y + 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x + 1, y + 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y + 1, z)), (World) world, new BlockPos(x + 1, y + 1, z));
					world.destroyBlock(new BlockPos(x + 1, y + 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x + 1, y, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x + 1, y, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x + 1, y, z)), (World) world, new BlockPos(x + 1, y, z));
					world.destroyBlock(new BlockPos(x + 1, y, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x - 1, y, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x - 1, y, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x - 1, y, z)), (World) world, new BlockPos(x - 1, y, z));
					world.destroyBlock(new BlockPos(x - 1, y, z), false);
				}
			}
		}
		if (entity.rotationYaw > 225 && entity.rotationYaw < 315) {
			if (world.getBlockState(new BlockPos(x, y, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z)), (World) world, new BlockPos(x, y, z));
					world.destroyBlock(new BlockPos(x, y, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y + 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y + 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z)), (World) world, new BlockPos(x, y + 1, z));
					world.destroyBlock(new BlockPos(x, y + 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y - 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y - 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z)), (World) world, new BlockPos(x, y - 1, z));
					world.destroyBlock(new BlockPos(x, y - 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y - 1, z - 1)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y - 1, z - 1)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z - 1)), (World) world, new BlockPos(x, y - 1, z - 1));
					world.destroyBlock(new BlockPos(x, y - 1, z - 1), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y + 1, z - 1)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y + 1, z - 1)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z - 1)), (World) world, new BlockPos(x, y + 1, z - 1));
					world.destroyBlock(new BlockPos(x, y + 1, z - 1), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y - 1, z + 1)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y - 1, z + 1)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z + 1)), (World) world, new BlockPos(x, y - 1, z + 1));
					world.destroyBlock(new BlockPos(x, y - 1, z + 1), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y + 1, z + 1)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y + 1, z + 1)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z + 1)), (World) world, new BlockPos(x, y + 1, z + 1));
					world.destroyBlock(new BlockPos(x, y + 1, z + 1), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y, z + 1)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y, z + 1)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z + 1)), (World) world, new BlockPos(x, y, z + 1));
					world.destroyBlock(new BlockPos(x, y, z + 1), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y, z - 1)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y, z - 1)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z - 1)), (World) world, new BlockPos(x, y, z - 1));
					world.destroyBlock(new BlockPos(x, y, z - 1), false);
				}
			}
		}
		if (entity.rotationYaw > 45 && entity.rotationYaw < 135) {
			if (world.getBlockState(new BlockPos(x, y, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z)), (World) world, new BlockPos(x, y, z));
					world.destroyBlock(new BlockPos(x, y, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y + 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y + 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z)), (World) world, new BlockPos(x, y + 1, z));
					world.destroyBlock(new BlockPos(x, y + 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y - 1, z)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y - 1, z)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z)), (World) world, new BlockPos(x, y - 1, z));
					world.destroyBlock(new BlockPos(x, y - 1, z), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y - 1, z - 1)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y - 1, z - 1)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z - 1)), (World) world, new BlockPos(x, y - 1, z - 1));
					world.destroyBlock(new BlockPos(x, y - 1, z - 1), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y + 1, z - 1)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y + 1, z - 1)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z - 1)), (World) world, new BlockPos(x, y + 1, z - 1));
					world.destroyBlock(new BlockPos(x, y + 1, z - 1), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y - 1, z + 1)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y - 1, z + 1)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y - 1, z + 1)), (World) world, new BlockPos(x, y - 1, z + 1));
					world.destroyBlock(new BlockPos(x, y - 1, z + 1), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y + 1, z + 1)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y + 1, z + 1)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y + 1, z + 1)), (World) world, new BlockPos(x, y + 1, z + 1));
					world.destroyBlock(new BlockPos(x, y + 1, z + 1), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y, z + 1)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y, z + 1)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z + 1)), (World) world, new BlockPos(x, y, z + 1));
					world.destroyBlock(new BlockPos(x, y, z + 1), false);
				}
			}
			if (world.getBlockState(new BlockPos(x, y, z - 1)).getHarvestLevel() > -1
					&& world.getBlockState(new BlockPos(x, y, z - 1)).getHarvestLevel() < 4) {
				if (world instanceof World) {
					Block.spawnDrops(world.getBlockState(new BlockPos(x, y, z - 1)), (World) world, new BlockPos(x, y, z - 1));
					world.destroyBlock(new BlockPos(x, y, z - 1), false);
				}
			}
		}
	}
}
