package me.gamerpvg.deathmatch.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class StartDeathMatchCommand implements CommandExecutor {
    int test = 20;
    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        Player player = (Player) sender;
        if (player.getHealth() == test) {
            player.sendActionBar(ChatColor.BLUE + ChatColor.ITALIC.toString() + "Waiting for more players...");

        } else {
            player.sendActionBar(ChatColor.RED + "ERROR!!!");
        }
        return false;
    }
}
