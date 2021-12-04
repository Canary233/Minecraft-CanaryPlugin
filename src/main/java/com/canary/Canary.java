package com.canary;

import org.bukkit.plugin.java.JavaPlugin;

public final class Canary extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginManager().registerEvents(new CreeperNotBoom(),this);
        getServer().getPluginManager().registerEvents((new JoinMessage()),this);
        getLogger().info("§b插件已开启");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        getLogger().info("插件已关闭");
    }
}
