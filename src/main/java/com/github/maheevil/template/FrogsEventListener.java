package com.github.maheevil.template;

import io.papermc.paper.event.entity.EntityMoveEvent;
import org.bukkit.Bukkit;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Mob;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class FrogsEventListener implements Listener {
    @EventHandler
    public void onEntityMove(EntityMoveEvent entityMoveEvent){
        if (entityMoveEvent.getEntityType().equals(EntityType.FROG)) {
            if (entityMoveEvent.getEntity().hasAI()) {
                entityMoveEvent.getEntity().setAI(false);
            }
        }
    }
}
