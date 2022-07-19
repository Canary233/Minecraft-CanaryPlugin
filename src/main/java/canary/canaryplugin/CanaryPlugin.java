package canary.canaryplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class CanaryPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CreeperNotExplode(),this);
        getServer().getPluginManager().registerEvents(new JoinMessage(),this);
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
