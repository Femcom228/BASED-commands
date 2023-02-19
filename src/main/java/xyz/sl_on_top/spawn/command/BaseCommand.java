package xyz.sl_on_top.spawn.command;

import org.bukkit.command.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import xyz.sl_on_top.spawn.Operator;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseCommand implements CommandExecutor, TabCompleter {
    public BaseCommand(String command) {
        PluginCommand pluginCommand = Operator.getInstance().getCommand(command);
        if (pluginCommand != null) {
            pluginCommand.setExecutor(this);
            pluginCommand.setTabCompleter(this);
        }
    }

    public abstract void execute(CommandSender sender, String label, String[] args);


    public List<String> complete(CommandSender sender, String[] args) {
        return null;
    }

    private List<String> filter(List<String> list, String[] args) {
        if (list == null) {
            return null;
        }
        String last = args[args.length - 1];
        List<String> result = new ArrayList<>();

        for (String arg: list) {
            if (arg.toLowerCase().startsWith(last.toLowerCase())) {
                result.add(arg);
            }
        }
        return result;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        execute(sender, label, args);
        return false;
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        return filter(complete(sender, args), args);

    }
}