package com.chicken.muchmoremodcompat.setup;

import com.chicken.muchmoremodcompat.MuchMoreModCompat;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = MuchMoreModCompat.MODID, value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ClientSetup {
    @SubscribeEvent
    public static void init(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(Registration.GLOW_BRAZIER.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(Registration.ICE_CHAIN.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(Registration.GOLD_CHAIN.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(Registration.GLOW_CHANDELIER.get(), RenderType.getCutoutMipped());

        RenderTypeLookup.setRenderLayer(Registration.GLOWSHROOM_BEAM.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(Registration.GLOWSHROOM_SEAT.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(Registration.GLOWSHROOM_SUPPORT.get(), RenderType.getTranslucent());
        RenderTypeLookup.setRenderLayer(Registration.GLOWSHROOM_PALISADE.get(), RenderType.getTranslucent());
    }
}
