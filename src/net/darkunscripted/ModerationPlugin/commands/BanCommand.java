package net.darkunscripted.ModerationPlugin.commands;

import net.minecraft.server.v1_12_R1.CommandExecute;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.event.Listener;

public class BanCommand extends CommandExecute implements CommandExecutor, Listener {

    public boolean onCommand(CommandSender s, Command cmd, String label, String[] args) {
        return false;
    }

}
