package xyz.sl_on_top.spawn;

import org.bukkit.plugin.java.JavaPlugin;
import xyz.sl_on_top.spawn.command.FreeCommand;
import xyz.sl_on_top.spawn.command.SiteCommand;
import xyz.sl_on_top.spawn.command.SpawnCommand;

public final class Operator extends JavaPlugin {
    private static Operator instance;

    public static Operator getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        new SpawnCommand();
        new FreeCommand();
        new SiteCommand();
    }
}
