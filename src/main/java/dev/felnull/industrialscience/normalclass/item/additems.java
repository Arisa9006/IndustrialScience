package dev.felnull.industrialscience.normalclass.item;

import net.minecraft.item.*;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


import static dev.felnull.industrialscience.IndustrialScienceMod.MOD_ID;

public class additems extends Items {

    private static final DeferredRegister<Item> ITEMS=DeferredRegister.create(ForgeRegistries.ITEMS,MOD_ID);
    public static final RegistryObject<Item> TEST_ITEM=ITEMS.register("test_item",()->new Item(new Item.Properties().tab(ItemGroup.TAB_MISC)));
    //public static final RegistryObject<Item> CHROME_PICKAXE=ITEMS.register("chrome_pickaxe",()->new Item(new Item.Properties().tab(ItemGroup.TAB_TOOLS)));
    
    public static final Item CHROME_PICKAXE = registerItem("chrome_pickaxe", new PickaxeItem(ItemTier.DIAMOND, 1, -2.8F, (new Item.Properties()).tab(ItemGroup.TAB_TOOLS)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    private static Item registerItem(String p_221547_0_, Item p_221547_1_) {
        return registerItem(new ResourceLocation(p_221547_0_), p_221547_1_);
    }

    private static Item registerItem(ResourceLocation p_221544_0_, Item p_221544_1_) {
        if (p_221544_1_ instanceof BlockItem) {
            ((BlockItem)p_221544_1_).registerBlocks(Item.BY_BLOCK, p_221544_1_);
        }

        return Registry.register(Registry.ITEM, p_221544_0_, p_221544_1_);
    }

}
