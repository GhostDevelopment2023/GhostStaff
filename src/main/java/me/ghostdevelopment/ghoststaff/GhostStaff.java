package me.ghostdevelopment.ghoststaff;

import lombok.Getter;
import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public final class GhostStaff extends JavaPlugin {

    @Getter
    private GhostStaff instance;

    @Override
    public void onEnable() {

        instance=this;

        Metrics metrics = new Metrics(this, 20502);

    }

    @Override
    public void onDisable() {
        instance=null;
    }
}
