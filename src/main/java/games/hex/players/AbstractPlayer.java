package games.hex.players;

import games.hex.gameMechanics.PlayerColor;

/**
 * Abstract class for a Hex Player.
 * @author Brandon Peavler
 *
 */
public abstract class AbstractPlayer implements Player {

	private PlayerColor color;

	public AbstractPlayer(PlayerColor c)
	{
		this.color = c;
	}

	/**
	 * Returns the player's PlayerColor
	 * 
	 * @return PlayerColor - the PlayerColor of the player.
	 */
	public PlayerColor getColor() 
	{
		return this.color;
	}
	
	/**
	 * 
	 * @return String - the name of the player.
	 */
	public abstract String getName();

}