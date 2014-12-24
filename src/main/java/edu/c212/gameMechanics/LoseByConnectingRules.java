package edu.c212.gameMechanics;

/**
 * @author Brandon Peavler   (peavlerb)
 */

import edu.c212.board.Board;
import edu.c212.players.Player;

/**
 * Weird way for a player to lose?
 * @author Brandon Peavler
 *
 */
public class LoseByConnectingRules extends StandardRules 
{
	private Player playerOne;
	private Player playerTwo;

	public LoseByConnectingRules(Board board, Player one, Player two) {
		super(board, one, two);
		playerOne = one;
		playerTwo = two;
	}
	
	/**
	 * Checks the wins for the red and blue players. If a win exists for either
	 * of them, the winning player is returned. If the game is not yet won, null
	 * is returned. A tie would be indicated by PlayerColor.BLANK
	 * 
	 * @return the PlayerColor of the winning player, null if neither player has
	 *         won
	 */
	public PlayerColor checkForWins()
	{
		PlayerColor playerOneColor = playerOne.getColor();
		PlayerColor playerTwoColor = playerTwo.getColor();
		PlayerColor color		   = null;
		
		if (super.checkForWins() == playerOneColor)
		{
			color = playerTwoColor;
		}
		else if (super.checkForWins() == playerTwoColor)
		{
			color = playerOneColor;
		}
		else if (super.checkForWins() == PlayerColor.BLANK)
		{
			color = PlayerColor.BLANK;
		}
		
		return color;
	}

}
