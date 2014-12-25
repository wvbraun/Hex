package games.hex;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import games.hex.board.SimpleGameBoardTest;
import games.hex.board.TileTest;
import games.hex.gameMechanics.LoseByConnectingRulesTest;
import games.hex.gameMechanics.MoveTest;
import games.hex.gameMechanics.StandardRulesTest;


@RunWith(Suite.class)
@SuiteClasses({ SimpleGameBoardTest.class, 
				MoveTest.class, 
				StandardRulesTest.class,
				LoseByConnectingRulesTest.class,
				TileTest.class,
				SimpleGameBoardTest.class
				})
public class AllTests {

}
