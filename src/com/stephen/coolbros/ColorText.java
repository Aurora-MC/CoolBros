package com.stephen.coolbros;

import org.bukkit.ChatColor;

public class ColorText {

    private Main plugin;

    /** Constructor */
    public ColorText(Main plugin){
        this.plugin = plugin;
    }

    public String colorize(String colormessage) {
        colormessage = colormessage.replace("&1", ChatColor.DARK_BLUE+"");
        colormessage = colormessage.replace("&2", ChatColor.DARK_GREEN+"");
        colormessage = colormessage.replace("&3", ChatColor.DARK_AQUA+"");
        colormessage = colormessage.replace("&4", ChatColor.DARK_RED+"");
        colormessage = colormessage.replace("&5", ChatColor.DARK_PURPLE+"");
        colormessage = colormessage.replace("&6", ChatColor.GOLD+"");
        colormessage = colormessage.replace("&7", ChatColor.GRAY+"");
        colormessage = colormessage.replace("&8", ChatColor.DARK_GRAY+"");
        colormessage = colormessage.replace("&9", ChatColor.BLUE+"");
        colormessage = colormessage.replace("&0", ChatColor.BLACK+"");
        colormessage = colormessage.replace("&a", ChatColor.GREEN+"");
        colormessage = colormessage.replace("&b", ChatColor.AQUA+"");
        colormessage = colormessage.replace("&c", ChatColor.RED+"");
        colormessage = colormessage.replace("&d", ChatColor.LIGHT_PURPLE+"");
        colormessage = colormessage.replace("&e", ChatColor.YELLOW+"");
        colormessage = colormessage.replace("&f", ChatColor.WHITE+"");
        colormessage = colormessage.replace("&k", ChatColor.MAGIC+"");
        colormessage = colormessage.replace("&l", ChatColor.BOLD+"");
        colormessage = colormessage.replace("&m", ChatColor.STRIKETHROUGH+"");
        colormessage = colormessage.replace("&n", ChatColor.UNDERLINE+"");
        colormessage = colormessage.replace("&o", ChatColor.ITALIC+"");
        colormessage = colormessage.replace("&r", ChatColor.RESET+"");
        return colormessage;
    }
}
