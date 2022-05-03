package com.cryzzz.thealcoholicsmod.events;


import com.cryzzz.thealcoholicsmod.TheAlcoholicsMod;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.TextComponent;

import net.minecraft.world.entity.player.Player;

import net.minecraftforge.event.entity.player.PlayerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


import java.util.List;

@Mod.EventBusSubscriber(modid = TheAlcoholicsMod.MOD_ID)
public class ModEvents {

    @SubscribeEvent
    public static void sendModInfoMessage (PlayerEvent.PlayerLoggedInEvent event){
        Player player = event.getPlayer();
        String info = ChatFormatting.GREEN + "The Alcoholics Mod Version Alpha 1.3.2" +
                " \n   - 1.18.2 Update" +
                " \n   - Stay High ";
        player.sendMessage(new TextComponent(info), player.getUUID());

    }
}
