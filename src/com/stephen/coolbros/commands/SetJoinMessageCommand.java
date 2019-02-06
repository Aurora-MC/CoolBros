package com.stephen.coolbros.commands;

import com.stephen.coolbros.Colorize;
import com.stephen.coolbros.Main;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SetJoinMessageCommand implements CommandExecutor {

    private Main plugin;
    private Colorize colorize;

    public SetJoinMessageCommand(Main plugin) {
        this.plugin = plugin;
        this.colorize = new Colorize(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equals("setjoinmessage")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                String message = String.join(" ", args);
                this.plugin.getConfig().set(player.getName(), message);
                this.plugin.saveConfig();
                player.sendMessage( ChatColor.BOLD +""+ ChatColor.GOLD + "Set your join message to:");
                player.sendMessage(ChatColor.BOLD +"» "+ ChatColor.RESET + this.colorize.addColor(message).replace("{player}", player.getName()));
            }
        }
        return false;
    }
}
