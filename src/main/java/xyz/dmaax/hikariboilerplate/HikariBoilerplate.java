package xyz.dmaax.hikariboilerplate;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.dmaax.hikariboilerplate.managers.ConfigManager;

public final class HikariBoilerplate extends JavaPlugin {

    private static HikariBoilerplate plugin;
    private ConfigManager configManager;
    private boolean isMySQL;

    @Override
    public void onEnable() {
        plugin = this;
        configManager = new ConfigManager();
        configManager.load();
        isMySQL = configManager.isSql();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static HikariBoilerplate getInstance() {
        return plugin;
    }

}
