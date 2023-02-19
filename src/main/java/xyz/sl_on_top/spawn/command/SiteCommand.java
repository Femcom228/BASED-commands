package xyz.sl_on_top.spawn.command;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SiteCommand extends BaseCommand {
    public static final String COMMAND_NAME = "site";

    public SiteCommand() {
        super(COMMAND_NAME);
    }

    @Override
    public void execute(CommandSender sender, String label, String[] args) {

        sender.sendMessage(ChatColor.DARK_AQUA + "Сайт сервера:" + " " + ChatColor.WHITE + "https://mineice.ru");
    }
}