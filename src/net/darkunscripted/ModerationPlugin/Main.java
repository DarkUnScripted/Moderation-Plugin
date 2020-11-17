package net.darkunscripted.ModerationPlugin;

import net.darkunscripted.ModerationPlugin.commands.BanCommand;
import net.darkunscripted.ModerationPlugin.events.Join;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
        registerManagers();
        registerEvents();
    }

    @Override
    public void onDisable() {

    }

    public void registerCommands(){
        getCommand("ban").setExecutor(new BanCommand());
    }

    public void registerManagers(){

    }

    public void registerEvents(){
        Bukkit.getServer().getPluginManager().registerEvents(new Join(), this);
    }
}
