package dev.felnull.industrialscience;

import dev.felnull.industrialscience.normalclass.item.additems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;


@Mod(IndustrialScienceMod.MOD_ID)
@Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
public class IndustrialScienceMod {
    public static final String MOD_ID ="industrialscience";

    public IndustrialScienceMod(){
        IEventBus modEventBus= FMLJavaModLoadingContext.get().getModEventBus();
        additems.register(modEventBus);




    }
    //ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON Config.SPEC,"IndustrialScience.config");




}
