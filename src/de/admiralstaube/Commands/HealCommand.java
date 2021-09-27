package de.admiralstaube.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class HealCommand implements CommandExecutor {
    public HealCommand (TestPlugin plugin) {}

    public boolean onCommand(CommandSender cs, Command cmd, String label, String[] args) {

        if(cs instanceof Player) {
            Player player = (Player) cs;
            player.setHealth(20);
            player.sendMessage("§6GamingRunde>>§r Sie wurden geheilt.");
        } else
            cs.sendMessage("§6GamingRunde>> §rDiesen Befehl können sie nur als Spieler ausführen!");

        return false;
    }


}
