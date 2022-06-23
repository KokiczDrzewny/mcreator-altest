
package net.mcreator.altest.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.altest.item.DiamondPoweredCoalItem;

@Mod.EventBusSubscriber
public class DiamondPoweredCoalFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == DiamondPoweredCoalItem.block)
			event.setBurnTime(128000);
	}
}
