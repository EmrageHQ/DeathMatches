package me.gamerpvg.deathmatch.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.jetbrains.annotations.NotNull;

public class HealCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        player.sendMessage(ChatColor.AQUA + "Du hattest vorher" + " " + ChatColor.RED + player.getHealth() / 2 + ChatColor.AQUA + " " + "Herzen!");
        player.sendMessage(ChatColor.AQUA + "Du hattest vorher" + " " + ChatColor.RED + player.getSaturation() / 2 + ChatColor.AQUA + " " + "Hungerbalken!!");
        player.setHealth(20);
        player.setSaturation(20);
        player.sendMessage(ChatColor.GOLD + "Du wurdest geheilt!");
        return false;
    }
}
