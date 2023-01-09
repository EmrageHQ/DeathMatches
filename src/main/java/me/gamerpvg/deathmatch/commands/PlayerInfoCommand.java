package me.gamerpvg.deathmatch.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class PlayerInfoCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        player.sendMessage(ChatColor.GOLD + ChatColor.BOLD.toString() + ChatColor.UNDERLINE + ChatColor.ITALIC + "Name: " + ChatColor.GREEN + player.getDisplayName());
        player.sendMessage(ChatColor.GOLD + ChatColor.BOLD.toString() + ChatColor.UNDERLINE + ChatColor.ITALIC + "Level: " + ChatColor.GREEN + player.getLevel());
        player.sendMessage(ChatColor.GOLD + ChatColor.BOLD.toString() + ChatColor.UNDERLINE + ChatColor.ITALIC + "Leben: " + ChatColor.GREEN + player.getHealth() / 2);
        player.sendMessage(ChatColor.GOLD + ChatColor.BOLD.toString() + ChatColor.UNDERLINE + ChatColor.ITALIC + "Spielerzeit: " + ChatColor.GREEN + player.getPlayerTime());
        player.sendMessage(ChatColor.GOLD + ChatColor.BOLD.toString() + ChatColor.UNDERLINE + ChatColor.ITALIC + "Gamemode: " + ChatColor.GREEN + player.getGameMode());
        player.sendMessage(ChatColor.GOLD + ChatColor.BOLD.toString() + ChatColor.UNDERLINE + ChatColor.ITALIC + "Ping: " + ChatColor.GREEN + player.getPing());
        player.sendMessage(ChatColor.GOLD + ChatColor.BOLD.toString() + ChatColor.UNDERLINE + ChatColor.ITALIC + "Item: " + ChatColor.GREEN + player.getItemInHand());




        return false;
    }
}
