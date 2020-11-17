package net.darkunscripted.ModerationPlugin.events;

import net.darkunscripted.ModerationPlugin.data.BannedPlayers;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class Join implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent e){
        if(BannedPlayers.bannedplayers.containsKey(e.getPlayer())){
            if(BannedPlayers.banReason.containsKey(e.getPlayer())){
                e.getPlayer().kickPlayer("You are banned\nDuration: " + BannedPlayers.bannedplayers.get(e.getPlayer()) + "\nReason: " + BannedPlayers.banReason.get(e.getPlayer()));
            }else {
                e.getPlayer().kickPlayer("You are banned\nDuration: " + BannedPlayers.bannedplayers.get(e.getPlayer()));
            }
        }
    }

}
