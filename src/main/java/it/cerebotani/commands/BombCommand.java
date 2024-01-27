package it.cerebotani.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class BombCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        sender.sendMessage("Hai ordinato un bombardamento!");

        if (sender instanceof Player) {
            Player p = (Player) sender;

            ItemStack diamondAxe = new ItemStack(Material.DIAMOND_AXE);

            p.getInventory().addItem(diamondAxe);

            p.kickPlayer("vattene");

        }

        return true;
    }
}
