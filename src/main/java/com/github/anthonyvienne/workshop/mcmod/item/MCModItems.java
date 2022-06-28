package com.github.anthonyvienne.workshop.mcmod.item;

import com.github.anthonyvienne.workshop.mcmod.MCMod;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.ArrayList;

public class MCModItems {
    public static final ArrayList<Item> ITEMS = new ArrayList<Item>();
    public static final Item bi = new BasicItem("");

    public static void setItemName(Item item, String name)
    {
        item.setRegistryName(MCMod.MODID, name).setUnlocalizedName(MCMod.MODID + "." + name);
        ITEMS.add(item);
    }

    public static void setItemBlockName(Item item, Block block)
    {
        item.setRegistryName(block.getRegistryName());
        ITEMS.add(item);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    protected static void registerItemModels(ModelRegistryEvent e)
    {
        ITEMS.forEach(item -> registerModel(item, 0));
    }

    @SideOnly(Side.CLIENT)
    protected static void registerModel(Item item, int metadata)
    {
        ModelLoader.setCustomModelResourceLocation(item, metadata, new ModelResourceLocation(item.getRegistryName(), "inventory"));
    }

}
