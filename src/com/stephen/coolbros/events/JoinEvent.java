package com.stephen.coolbros.events;

import com.stephen.coolbros.Colorize;
import com.stephen.coolbros.Main;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class JoinEvent implements Listener {

    private Main plugin;
    private Colorize colorize;

    /** Constructor */
    public JoinEvent(Main plugin){
        this.plugin = plugin;
        this.colorize = new Colorize(plugin);
    }

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        String message = this.plugin.getConfig().getString(player.getName());
        if (this.plugin.getConfig().isSet(player.getName())) {
            event.setJoinMessage(this.colorize.addColor(message).replace("{player}", player.getName()));
        }
    }

}
