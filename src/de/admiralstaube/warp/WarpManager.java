package de.admiralstaube.warp;

import org.bukkit.Location;

public class WarpManager {

    public static Location getWarp(String name) {
        WarpManager.getCfg().getConfiguration().getLocation(name);
    }
    public static void createWarp(String name , Location location) {
        WarpManager.getCfg().set(name , location);
        WarpManager.getCfg().save();
    }
    public static void deletWarp(String name) {
        WarpManager.getCfg().set(name , null);
        WarpManager.getCfg().save();

    }
}
