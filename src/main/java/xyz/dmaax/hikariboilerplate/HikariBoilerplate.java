package xyz.dmaax.hikariboilerplate;

import org.bukkit.plugin.java.JavaPlugin;

public final class HikariBoilerplate extends JavaPlugin {

    private static HikariBoilerplate plugin;

    @Override
    public void onEnable() {
        plugin = this;
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static HikariBoilerplate getInstance() {
        return plugin;
    }

}
