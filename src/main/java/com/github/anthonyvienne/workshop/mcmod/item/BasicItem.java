package com.github.anthonyvienne.workshop.mcmod.item;

import com.github.anthonyvienne.workshop.mcmod.MCMod;
import net.minecraft.item.Item;

public class BasicItem extends Item {
    public BasicItem(String name)
    {
        MCModItems.setItemName(new Item(), name);
        setCreativeTab(MCMod.ct);
    }
}
