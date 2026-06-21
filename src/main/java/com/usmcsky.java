package com;

import org.bukkit.Bukkit;
import org.bukkit.World;
import org.bukkit.entity.Phantom;
import org.bukkit.plugin.java.JavaPlugin;

public final class usmcsky extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getPluginManager().registerEvents(new CreeperGriefListener(), this);
        Bukkit.getPluginManager().registerEvents(new PhantomSpawnListener(), this);

        for (World world : Bukkit.getWorlds()) {
            world.getEntitiesByClass(Phantom.class).forEach(Phantom::remove);
        }
    }

    @Override
    public void onDisable() {
    }
}
