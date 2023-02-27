package com.teixtarcio;

import com.listeners.teixListeners;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class teixtarcioPlugin extends JavaPlugin{

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("O plugin foi habilitado.");
        this.getServer().getPluginManager().registerEvents(new teixListeners(), this);
        }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("O plugin foi desabilitado.");
        }

}
