package edu.c212;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import edu.c212.board.SimpleGameBoardTest;
import edu.c212.board.TileTest;
import edu.c212.gameMechanics.LoseByConnectingRulesTest;
import edu.c212.gameMechanics.MoveTest;
import edu.c212.gameMechanics.StandardRulesTest;


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
