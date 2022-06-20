package dev.felnull.industrialscience.normalclass;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class InsItemGroup extends ItemGroup {
    public static final ItemGroup Ins_GROUP = new InsItemGroup();
    public InsItemGroup()
    {
        super("Item Group Name");
    }
    @Override
    public ItemStack makeIcon()
    {
        return new ItemStack(Items.DIAMOND);
    }


}
