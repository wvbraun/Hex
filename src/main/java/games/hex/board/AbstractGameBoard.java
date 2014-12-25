package games.hex.board;

/**
 * @author Brandon Peavler   (peavlerb)
 */

import java.util.Observable;

/**
 * The Abstract class for the Board.
 * @author Brandon Peavler
 *
 */
public abstract class AbstractGameBoard extends Observable implements Board {
	protected int size;

	/**
	 * Returns the number of Tiles along a side of the board.
	 * All boards should be square
	 * 
	 * @return int - the size of the board.
	 */
	public int getSize()
	{
		return size;
	}
}
