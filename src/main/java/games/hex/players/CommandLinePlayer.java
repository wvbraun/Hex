package games.hex.players;

import java.util.List;
import java.util.Scanner;

import games.hex.board.Board;
import games.hex.gameMechanics.Move;
import games.hex.gameMechanics.PlayerColor;
import games.hex.view.textual.CommandLineView;

/**
 * A command line Player.
 * @author Brandon Peavler
 *
 */
public class CommandLinePlayer extends AbstractPlayer 
{
	public CommandLinePlayer(PlayerColor color) {
		super(color);
		this.scanner = new Scanner(System.in);
	}

	private Scanner scanner;
	
	/**
	 * The getMove for a CommandLinePlayer prompts the user for a x and a y and
	 * make a Move with that x and y.
	 * 
	 * @param board
	 *            this Game Board
	 * @param legalMoves
	 *            an ArrayList of legal moves
	 * @return the Move created from the keyboard prompt
	 */
	@Override
	public Move getMove(Board board, List<Move> legalMoves) {
		System.out.print(CommandLineView.boardToString(board));
		System.out.print(this.getColor() + " to move: ");

		System.out.println("Input the x coordinate of your move: ");
		int x = scanner.nextInt();
		System.out.println("Input the y coordinate of your move: ");
		int y = scanner.nextInt();

		return new Move(x, y);
	}

	/**
	 * {@inheritDoc}
	 */
	public String getName() 
	{
		return "games.hex.players.CommandLinePlayer";
	}

}
