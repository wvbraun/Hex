package games.hex.gameMechanics;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import games.hex.board.SimpleGameBoard;
import games.hex.gameMechanics.GameRunner;
import games.hex.gameMechanics.PlayerColor;
import games.hex.gameMechanics.StandardRules;
import games.hex.players.SimpleRandomPlayer;

public class GameRunnerTest {

    GameRunner runner;
    SimpleGameBoard board;
    SimpleRandomPlayer random;
    SimpleRandomPlayer random2;
    StandardRules rules;

    @Before
    public void setup(){
        runner = new GameRunner(4, "edu.indiana.cs.c212.players.SimpleRandom", 
        		"edu.indiana.cs.c212.players.SimpleRandom", 
        		"edu.indiana.cs.c212.gameMechanics.StandardRules",
        		PlayerColor.RED, PlayerColor.BLUE);
    }

    @Test
    public void testGameRunner() {
        assertNotNull(runner);
    }

    @Test
    public void testGetBoard() {

        assertNotNull(runner.getBoard());
        assertEquals(4, runner.getBoard().getSize());
    }

}
