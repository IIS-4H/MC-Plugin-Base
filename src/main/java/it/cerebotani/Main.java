package it.cerebotani;

import it.cerebotani.commands.BombCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        Logger logger = this.getLogger();

        logger.info("ABILITATO PLUGIN ATTENTATI");

        this.getCommand("bomb").setExecutor(new BombCommand());
    }
}