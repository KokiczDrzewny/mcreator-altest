
package net.mcreator.altest.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.altest.item.GoldPoweredCoalItem;

@Mod.EventBusSubscriber
public class GoldPoweredCoalFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == GoldPoweredCoalItem.block)
			event.setBurnTime(64000);
	}
}
