package xyz.dmaax.hikariboilerplate;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.dmaax.hikariboilerplate.managers.ConfigManager;

public final class HikariBoilerplate extends JavaPlugin {

    private static HikariBoilerplate plugin;
    private ConfigManager configManager;
    private boolean isMySQL;

    @Override
    public void onEnable() {
        setupConfig();
        plugin = this;
        configManager = new ConfigManager();
        configManager.load();
        isMySQL = configManager.isSql();
    }

    @Override
    public void onDisable() {
        configManager.save();
    }

    public static HikariBoilerplate getInstance() {
        return plugin;
    }

    private void setupConfig() {
        saveDefaultConfig();
        getConfig().options().copyDefaults(true);
        saveConfig();
    }

}
