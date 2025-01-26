package com.github.maheevil.template;

import org.bukkit.entity.Frog;
import org.bukkit.plugin.java.JavaPlugin;

public class FrogNoAi extends JavaPlugin {
    @Override
    public void onEnable(){
        getServer().getPluginManager().registerEvents(new FrogsEventListener(), this);
    }

    @Override
    public void onDisable() {

    }
}
