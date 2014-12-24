package edu.c212.players;

import edu.c212.gameMechanics.PlayerColor;

/**
 * Abstract class for AI Players.
 * @author Brandon Peavler
 *
 */
public abstract class AbstractHexPlayer extends AbstractPlayer 
{
	private boolean isPlayerOne;
	
	public AbstractHexPlayer(PlayerColor c, boolean isPlayerOne) {
		super(c);
		this.isPlayerOne = isPlayerOne;
	}
	
	protected boolean getIsPlayerOne()
	{
		return isPlayerOne;
	}

}
