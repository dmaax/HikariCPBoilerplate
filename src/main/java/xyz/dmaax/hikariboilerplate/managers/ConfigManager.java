package xyz.dmaax.hikariboilerplate.managers;

import org.bukkit.configuration.file.FileConfiguration;
import xyz.dmaax.hikariboilerplate.HikariBoilerplate;

public class ConfigManager {

    private final HikariBoilerplate plugin = HikariBoilerplate.getInstance();
    private FileConfiguration config;

    public void save() {
        plugin.saveConfig();
    }

    public void load() {
        plugin.reloadConfig();
        config = plugin.getConfig();
    }

    public boolean isDebug() {
        return config.getBoolean("debug");
    }

    public String getLanguage() {
        String language = config.getString("language");
        if (language == null || language.equalsIgnoreCase("")) {
            language = "en";
        }
        return language;
    }

    public boolean isSql() {
        return config.getBoolean("sql.enabled");
    }

    public String getSqlHostname() {
        return config.getString("sql.mysql.hostname");
    }

    public int getSqlPort() {
        return config.getInt("sql.mysql.port");
    }

    public String getSqlDatabase() {
        return config.getString("sql.database");
    }

    public String getSqlUsername() {
        return config.getString("sql.mysql.username");
    }

    public String getSqlPassword() {
        return config.getString("sql.mysql.password");
    }

}
