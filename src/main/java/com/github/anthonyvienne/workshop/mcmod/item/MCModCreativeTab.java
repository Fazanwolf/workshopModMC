package com.github.anthonyvienne.workshop.mcmod.item;

import com.github.anthonyvienne.workshop.mcmod.MCMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class MCModCreativeTab extends CreativeTabs {
    public MCModCreativeTab()
    {
        super(MCMod.MODID + "_tab");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(MCModItems.bi);
    }
}
