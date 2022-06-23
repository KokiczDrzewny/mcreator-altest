
package net.mcreator.altest.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.entity.LivingEntity;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.altest.procedures.HeartStealerSwordLivingEntityIsHitWithToolProcedure;
import net.mcreator.altest.AltestModElements;

import java.util.stream.Stream;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.AbstractMap;

@AltestModElements.ModElement.Tag
public class HeartStealerSwordItem extends AltestModElements.ModElement {
	@ObjectHolder("altest:heart_stealer_sword")
	public static final Item block = null;

	public HeartStealerSwordItem(AltestModElements instance) {
		super(instance, 806);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 1528;
			}

			public float getEfficiency() {
				return 3f;
			}

			public float getAttackDamage() {
				return 7f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 13;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(HeartItem.block));
			}
		}, 3, -1.1999999999999997f, new Item.Properties().group(ItemGroup.COMBAT)) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("Can be enchanted with a special enchantment called \"Life Steal\""));
			}

			@Override
			public boolean hitEntity(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
				boolean retval = super.hitEntity(itemstack, entity, sourceentity);
				double x = entity.getPosX();
				double y = entity.getPosY();
				double z = entity.getPosZ();
				World world = entity.world;

				HeartStealerSwordLivingEntityIsHitWithToolProcedure.executeProcedure(
						Stream.of(new AbstractMap.SimpleEntry<>("sourceentity", sourceentity), new AbstractMap.SimpleEntry<>("itemstack", itemstack))
								.collect(HashMap::new, (_m, _e) -> _m.put(_e.getKey(), _e.getValue()), Map::putAll));
				return retval;
			}
		}.setRegistryName("heart_stealer_sword"));
	}
}
