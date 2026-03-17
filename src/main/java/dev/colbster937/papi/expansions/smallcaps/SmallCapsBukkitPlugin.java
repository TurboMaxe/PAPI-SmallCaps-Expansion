package dev.colbster937.papi.expansions.smallcaps;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Char2Caps extends JavaPlugin {

    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("Enabled SmallCaps!");
        new SmallCapsPAPIExpansion().register();
    }
}
