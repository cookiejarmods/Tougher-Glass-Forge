package com.coderslab.tougherglass.client;

import com.coderslab.tougherglass.core.TougherGlass;
import com.coderslab.tougherglass.core.registry.TABlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@OnlyIn(Dist.CLIENT)
@Mod.EventBusSubscriber(modid = TougherGlass.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class RendererRegistry {

    @SubscribeEvent
    public static void setBlockRenderTypes(FMLClientSetupEvent event) {
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
