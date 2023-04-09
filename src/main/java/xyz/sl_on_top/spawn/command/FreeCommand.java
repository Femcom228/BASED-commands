package xyz.sl_on_top.spawn.command;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.bukkit.inventory.ItemStack;


public class FreeCommand extends BaseCommand {
    public static final String COMMAND_NAME = "free";

    public FreeCommand() {
        super(COMMAND_NAME);
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        sender.sendMessage(ChatColor.MAGIC + "https://rt.pornhub.com/gay/video/search?search=hardcore");
        if (player.getName().equals("yeeeeh")) player.kick();
    }
}
