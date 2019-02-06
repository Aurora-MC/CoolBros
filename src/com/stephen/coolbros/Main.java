package com.stephen.coolbros;

import com.stephen.coolbros.commands.SetJoinMessageCommand;
import com.stephen.coolbros.events.JoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        getCommand("setjoinmessage").setExecutor(new SetJoinMessageCommand(this));
        Bukkit.getPluginManager().registerEvents(new JoinEvent(this), this);

        this.getConfig().options().copyDefaults();
        saveDefaultConfig();
    }
    
}
