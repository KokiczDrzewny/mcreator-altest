
package net.mcreator.altest.fuel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.furnace.FurnaceFuelBurnTimeEvent;

import net.mcreator.altest.item.IronPoweredCoalItem;

@Mod.EventBusSubscriber
public class IronPoweredCoalFuelFuel {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		if (event.getItemStack().getItem() == IronPoweredCoalItem.block)
			event.setBurnTime(32000);
	}
}
