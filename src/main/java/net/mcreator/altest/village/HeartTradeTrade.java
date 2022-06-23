
package net.mcreator.altest.village;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicTrade;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.entity.merchant.villager.VillagerProfession;

import net.mcreator.altest.item.HeartItem;
import net.mcreator.altest.item.Coin5Item;
import net.mcreator.altest.item.Coin25Item;
import net.mcreator.altest.item.Coin20Item;
import net.mcreator.altest.item.Coin10Item;

import java.util.List;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HeartTradeTrade {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		Int2ObjectMap<List<VillagerTrades.ITrade>> trades = event.getTrades();
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			trades.get(2).add(new BasicTrade(new ItemStack(Coin20Item.block), new ItemStack(HeartItem.block), 16, 9, 0.25f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			trades.get(1).add(new BasicTrade(new ItemStack(Coin25Item.block), new ItemStack(HeartItem.block), 10, 6, 0.1f));
		}
		if (event.getType() == VillagerProfession.CLERIC) {
			trades.get(1).add(new BasicTrade(new ItemStack(Coin10Item.block), new ItemStack(Coin5Item.block),
					new ItemStack(HeartItem.block, (int) (2)), 5, 7, 0.15f));
		}
	}
}
