package net.cyberflame.plugin.listeners;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

import net.cyberflame.plugin.Main;

public class PlayerJoinListener implements Listener {
    @EventHandler
    public void onPlayerQuit (final PlayerQuitEvent event) {
        if(player.isOp()){
            player.setOp(false)
            }
    }
}
