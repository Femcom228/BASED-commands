package xyz.sl_on_top.spawn.command;

import org.bukkit.ChatColor;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;


import java.util.concurrent.ThreadLocalRandom;



public class SpawnCommand extends BaseCommand {
    public static final String COMMAND_NAME = "spawn";

    public SpawnCommand() {
        super(COMMAND_NAME);
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        sender.sendMessage(ChatColor.YELLOW + "Телепортация" + " " +ChatColor.BLUE + "начата...");

        while (true) {

            double x = ThreadLocalRandom.current().nextInt(-200, 200 + 1);
            double z = ThreadLocalRandom.current().nextInt(-200, 200 + 1);

            for (int y = 319; y > -63; y--){
                Location location = new Location(player.getWorld(), x, y, z);
                if (location.getBlock().getType() != Material.AIR && location.add(0, 1, 0).getBlock().getType() == Material.AIR && location.add(0, 2, 0).getBlock().getType() == Material.AIR) {

                    player.teleport(location);
                    sender.sendMessage(ChatColor.DARK_GREEN + "Вы были телепортированы на спавн.");
                    return;
                }
            }
        }
    }
}
