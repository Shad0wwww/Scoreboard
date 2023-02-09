package dk.shadow;


import dk.shadow.events.onJoin;
import dk.shadow.utils.BoardManager;
import org.bukkit.plugin.java.JavaPlugin;



public class ScoreBoard extends JavaPlugin {

    private static ScoreBoard plugin;





    public void onEnable() {
        plugin = this;
        getServer().getPluginManager().registerEvents(new BoardManager(), this);
        getServer().getPluginManager().registerEvents(new onJoin(), this);
    }



    public void onDisable() {
    }

    public static ScoreBoard getInstance() {
        return plugin;
    }

}