package me.gamerpvg.deathmatch.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class HealthCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        player.sendMessage(ChatColor.DARK_RED + "♥" + " " + "=" + " " + ChatColor.GOLD + player.getHealth() / 2 + ChatColor.DARK_RED + " " + "Herzen");
        return false;
    }
}
