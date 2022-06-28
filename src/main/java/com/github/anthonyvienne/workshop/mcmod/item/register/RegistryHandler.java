package com.github.anthonyvienne.workshop.mcmod.item.register;

import com.github.anthonyvienne.workshop.mcmod.item.MCModItems;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegistryHandler {
    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event)
    {
        MCModItems.ITEMS.forEach(item -> event.getRegistry().register(item));
    }
}
