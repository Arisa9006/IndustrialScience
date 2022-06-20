package dev.felnull.industrialscience.provider;

import dev.felnull.industrialscience.IndustrialScienceMod;
import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;

public class ModBlock extends Block
{
    private ItemGroup group;
    public ModBlock(Properties properties, String name, ItemGroup group)
    {
        super(properties);
        this.group = group;
        setRegistryName(IndustrialScienceMod.MOD_ID,name);
    }
    public ItemGroup getGroup()
    {
        return group;
    }
}