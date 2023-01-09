package me.gamerpvg.deathmatch;

import me.gamerpvg.deathmatch.commands.HealCommand;
import me.gamerpvg.deathmatch.commands.HealthCommand;
import me.gamerpvg.deathmatch.commands.PlayerInfoCommand;
import me.gamerpvg.deathmatch.commands.StartDeathMatchCommand;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.plugin.java.JavaPlugin;

public final class DeathMatch extends JavaPlugin {
  private static DeathMatch instance;

    @Override
    public void onEnable() {
      Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin aktiviert!");


      this.getCommand("start").setExecutor(new StartDeathMatchCommand());
      this.getCommand("heal").setExecutor(new HealCommand());
      this.getCommand("health").setExecutor(new HealthCommand());
      this.getCommand("info").setExecutor(new PlayerInfoCommand());
      // Plugin startup logic

    }

    @Override
    public void onDisable() {
      Bukkit.getConsoleSender().sendMessage(ChatColor.GREEN + "Plugin deaktiviert!");
      // Plugin shutdown logic
    }
}
