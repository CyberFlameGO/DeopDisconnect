package net.cyberflame.deopdisconnect;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import net.cyberflame.deopdisconnect.listeners.PlayerQuitListener;

public class Main extends JavaPlugin {
    
    @Override
    public void onEnable () {
        this.saveDefaultConfig();
        
        Bukkit.getServer().getPluginManager().registerEvents(new PlayerQuitListener(), this);

    }
}
