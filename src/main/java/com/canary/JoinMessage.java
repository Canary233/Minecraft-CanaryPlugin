package com.canary;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class JoinMessage implements Listener {
    @EventHandler
    public void onJoin(PlayerJoinEvent join){
        Player p = join.getPlayer();
        join.setJoinMessage(ChatColor.translateAlternateColorCodes('§',"§7[§a+§7]§f"+p.getName()));
    }
    @EventHandler
    public void onQuit(PlayerQuitEvent quit){
        Player p = quit.getPlayer();
        quit.setQuitMessage(ChatColor.translateAlternateColorCodes('§',"§7[§c-§7]§f"+p.getName()));
    }
}
