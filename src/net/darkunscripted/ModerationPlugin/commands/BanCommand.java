package net.darkunscripted.ModerationPlugin.commands;

import net.darkunscripted.ModerationPlugin.data.BannedPlayers;
import net.darkunscripted.ModerationPlugin.utils.Utils;
import net.minecraft.server.v1_12_R1.CommandExecute;
import org.bukkit.Bukkit;
import org.bukkit.OfflinePlayer;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;

public class BanCommand extends CommandExecute implements CommandExecutor, Listener {

    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        if(s instanceof Player){
          Player p = (Player) s;
          if(args.length < 2){
              p.sendMessage(Utils.chat("&b&lModeration &7>> &e&l/ban (name) (time)"));
          }else if(args.length == 2){
              OfflinePlayer banPlayer = null;
              for(OfflinePlayer player : Bukkit.getServer().getOfflinePlayers()){
                  if(player.getName().equalsIgnoreCase(args[0])){
                      banPlayer = player;
                  }
              }
              if(banPlayer == null){
                  p.sendMessage(Utils.chat("&b&lModeration &7>> &c&lPlayer not found!"));
              }else{
                  if(args[1].equalsIgnoreCase("null") || args[1].equalsIgnoreCase("perm")){
                      BannedPlayers.bannedplayers.put(banPlayer.getPlayer(), "Permanent");
                      return true;
                  }
              }
          }else if(args.length == 3){

          }else if(args.length > 3){

          }
        }else{

        }
        return false;
    }

}
