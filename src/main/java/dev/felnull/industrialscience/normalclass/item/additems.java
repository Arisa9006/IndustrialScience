package dev.felnull.industrialscience.normalclass.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Items;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static dev.felnull.industrialscience.IndustrialScienceMod.MOD_ID;

public class additems extends Items {

    private static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS,MOD_ID);
    public static final RegistryObject<Item> TEST_ITEM=ITEMS.register("test_item",()->new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
    public static final RegistryObject<Item> CHROME_PICKAXE=ITEMS.register("chrome_pickaxe",()->new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS).addToolType(ToolType.PICKAXE,4)));


    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }


}
