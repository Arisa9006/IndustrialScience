package dev.felnull.industrialscience.normalclass.block;

import dev.felnull.industrialscience.normalclass.InsItemGroup;
import dev.felnull.industrialscience.provider.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks
{
    public static final ModBlock TEST_BLOCK = new ModBlock(Block.Properties.of(Material.METAL).strength(5f).sound(SoundType.METAL), "test_block", InsItemGroup.Ins_GROUP);
    public static final List<ModBlock> LIST = new ArrayList<>(Arrays.asList(TEST_BLOCK));

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        LIST.forEach(event.getRegistry()::register);
    }
    @SubscribeEvent
    public static void registerBlockItems(final RegistryEvent.Register<Item> event)
    {
        LIST.forEach(b -> event.getRegistry().register(new BlockItem(b, new Item.Properties().tab(b.getGroup())).setRegistryName(b.getRegistryName())));
    }
}