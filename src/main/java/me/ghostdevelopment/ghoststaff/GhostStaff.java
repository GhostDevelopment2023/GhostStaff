package me.ghostdevelopment.ghoststaff;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class GhostStaff extends JavaPlugin {

    @Override
    public void onEnable() {

        Metrics metrics = new Metrics(this, 20502);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
