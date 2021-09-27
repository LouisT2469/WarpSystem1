package de.admiralstaube.main;

import de.admiralstaube.Commands.HealCommand;
import de.admiralstaube.util.Config;
import org.bukkit.plugin.java.JavaPlugin;

final class WarpSystem extends JavaPlugin {
    private static Config cfg;
    @Override
    public void onEnable() {
        getCommand("heal").setExecutor(new HealCommand(this));
        cfg = new Config("warps.yml" , getDataFolder());
    }

    @Override
    public void onDisable() {
        //plugin ....
    }

    public static Config getCfg() {
        return cfg;
    }
}