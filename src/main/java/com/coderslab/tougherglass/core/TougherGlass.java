package com.coderslab.tougherglass.core;

import com.coderslab.tougherglass.core.registry.TABlocks;
import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("tougherglass")
@Mod.EventBusSubscriber(modid = "tougherglass", bus = Bus.MOD)
public class TougherGlass {
    public static final String MOD_ID = "tougherglass";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);

    public TougherGlass() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        modEventBus.addListener(this::doCommonStuff);
        modEventBus.addListener(this::doClientStuff);

        REGISTRY_HELPER.register(modEventBus);

        
        MinecraftForge.EVENT_BUS.register(this);
        
    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    }

    private void doCommonStuff(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_GLASS.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_WHITE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_ORANGE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_MAGENTA_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_LIGHT_BLUE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_YELLOW_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_LIME_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_PINK_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_GRAY_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_LIGHT_GRAY_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_CYAN_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_PURPLE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_BLUE_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_BROWN_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_GREEN_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_RED_STAINED_GLASS.get(), RenderType.translucent());
        ItemBlockRenderTypes.setRenderLayer(TABlocks.STRONGER_BLACK_STAINED_GLASS.get(), RenderType.translucent());

    }
}
