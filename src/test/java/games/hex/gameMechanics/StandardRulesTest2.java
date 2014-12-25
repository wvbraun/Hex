package games.hex.gameMechanics;

import games.hex.board.Board;
import games.hex.board.SimpleGameBoard;
import games.hex.gameMechanics.PlayerColor;
import games.hex.gameMechanics.StandardRules;
import games.hex.players.Player;
import games.hex.players.SimpleRandomPlayer;

import org.junit.Before;
import org.junit.Test;

import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class StandardRulesTest2 {
    private StandardRules rules;

    @Before
    public void setUp() throws Exception {
        Board board = new SimpleGameBoard(4);
        rules = new StandardRules(board, new SimpleRandomPlayer(PlayerColor.RED), new SimpleRandomPlayer(PlayerColor.BLUE));
    }

    @Test(timeout = 1000)
    public void PlayerQueueOrder() {
        Queue<Player> players = rules.getPlayers();
        assertEquals("Red player should move first", players.peek().getColor(), PlayerColor.RED);
    }

    @Test(timeout = 1000)
    public void PlayerQueueOrder2() {
        Queue<Player> players = rules.getPlayers();
        players.poll();
        assertEquals("Blue player should move second", players.peek().getColor(), PlayerColor.BLUE);
    }

    @Test(timeout = 1000)
    public void RollingQueueNextTurn() {
        Queue<Player> players = rules.getPlayers();
        for (int i = 0; i < 1000; i++) {
            rules.nextTurn();
        }
        assertEquals("Queue should roll over for as many turns as needed", players.peek().getColor(), PlayerColor.RED);
    }

    @Test(timeout = 1000)
    public void NextTurn() {
        Queue<Player> players = rules.getPlayers();
        Player copy = rules.nextTurn();
        Player curPlayer = players.peek();
        assertEquals("NextTurn should return the player whose turn it will be", curPlayer, copy);
    }

    @Test(timeout = 1000)
    public void RollingNextTurn() {
        Queue<Player> players = rules.getPlayers();
        Player copy = rules.nextTurn();
        Player curPlayer = players.peek();
        assertEquals("NextTurn should return the player whose turn it will be", curPlayer, copy);
        copy = rules.nextTurn();
        curPlayer = players.peek();
        assertEquals("NextTurn should return the player whose turn it will be", curPlayer, copy);
        copy = rules.nextTurn();
        curPlayer = players.peek();
        assertEquals("NextTurn should return the player whose turn it will be", curPlayer, copy);
    }
}
