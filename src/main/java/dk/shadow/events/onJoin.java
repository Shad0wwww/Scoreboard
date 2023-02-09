package dk.shadow.events;

import dk.shadow.utils.Board;
import dk.shadow.utils.BoardManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.ArrayList;
import java.util.List;

public class onJoin implements Listener {

    @EventHandler
    public void onJoin(PlayerJoinEvent event) {

        Board board = BoardManager.getBoard(event.getPlayer());
        Bukkit.broadcastMessage("board " + board);
        if (board != null) {
            board.setTitle("hearsay");
            board.setLine(1, "1");
        }


    }
}
