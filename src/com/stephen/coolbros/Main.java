package com.stephen.coolbros;

import com.stephen.coolbros.events.JoinEvent;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

    @Override
    public void onEnable(){
        this.getConfig().options().copyDefaults();
        saveDefaultConfig();

        Bukkit.getPluginManager().registerEvents(new JoinEvent(this), this);
    }

    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("setjoinmessage")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                String message = String.join(" ", args);
                this.getConfig().set(player.getName(), message);
                this.saveConfig();
                player.sendMessage( ChatColor.BOLD +""+ ChatColor.GOLD + "Set your join message to:");
                player.sendMessage(ChatColor.BOLD +"» "+ ChatColor.RESET + addColor().colorize(message).replace("{player}", player.getName()));
            }
        }

        return false;
    }

    public ColorText addColor(){
        return new ColorText(this);
    }
}
