package com.listeners;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.Sound;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class teixListeners implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        event.setJoinMessage(event.getPlayer().getName() + " entrou no servidor.");
    }

    @EventHandler
    public void onPlayerQuit(PlayerQuitEvent event) {
        event.setQuitMessage(event.getPlayer().getName() + " saiu do servidor.");
    }

    @EventHandler
    public void quebrarBloco(BlockBreakEvent event) {
        Block bloco = event.getBlock();
        Player player = event.getPlayer();
        World world = player.getWorld();

        if (bloco.getType() == Material.GRASS_BLOCK) {
            world.strikeLightningEffect(bloco.getLocation());
            player.playSound(player.getLocation(), Sound.ENTITY_CAT_BEG_FOR_FOOD, 5, 5);
            player.sendMessage(ChatColor.GREEN + "Isso definitivamente é um teste!");
        } else {
            world.createExplosion(bloco.getLocation(), 5.0f, false);
        }
    }

}
