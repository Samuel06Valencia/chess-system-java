package chess; //Pacote correspondente a camada de xadrez.

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
	private Color color;
	
	public ChessPiece() {}

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	/* #Não implementa o set, pois a cor nã pode ser modificada!#
	 * public void setColor(Color color) {
	 * this.color = color;
	}*
	*/
	
	//Métodos:
	
	
}
