package dev.felnull.industrialscience.normalclass.Tileentity.TileBlock;

import dev.felnull.industrialscience.IndustrialScienceMod;
import net.minecraft.block.Block;

public class ChestTileBlock extends Block {
    public ChestTileBlock(Properties properties, String name) {
        super(properties);
        setRegistryName(IndustrialScienceMod.MOD_ID, name);
    }
}
