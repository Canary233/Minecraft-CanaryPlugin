package canary.canaryplugin;

import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;

public class CreeperNotExplode implements Listener {
    @EventHandler
    public static void EEE(EntityExplodeEvent event){
        if(event.getEntityType() == EntityType.CREEPER){
            event.setCancelled(true);
        }
    }
}
