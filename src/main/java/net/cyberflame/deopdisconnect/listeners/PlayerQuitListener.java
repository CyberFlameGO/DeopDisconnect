package net.cyberflame.deopdisconnect.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import net.cyberflame.deopdisconnect.Main;

public class PlayerQuitListener implements Listener {
    @EventHandler
    public void onPlayerQuit (final PlayerQuitEvent event) {
        if(player.isOp()){
            player.setOp(false)
            }
    }
}
