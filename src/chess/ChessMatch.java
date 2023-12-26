package chess; //pacote correspondente a camada de xadrez

import boardgame.Board;
import boardgame.Position;
import chess.pieces.King;
import chess.pieces.Rook;

public class ChessMatch {
	private Board board;
	
	public ChessMatch() {
		board = new Board(8,8); //A classe de xadrez,tem que saber a dimensão do tabuleiro.
		initialSetup();
	}
	public ChessPiece[][] getPieces() {
		//Vai retornar uma matriz de peças de xadrez,correspondente a partida.
		//quantidade de linhas e colunas do tabuleiro.
		ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()]; //instâncio uma nova matriz, para que o programa conheça apenas a camada de xadrez(chess).
		for (int i =0; i<board.getRows(); i++) {
			for(int  j =0; j<board.getColumns(); j++) {
				mat[i][j] = (ChessPiece) board.piece(i,j); //downcast e transformando o tipo do dado de Piece para ChessPiece.
			}
		}
		return mat; //Retorna a matriz.
	}
	
	private void initialSetup() {
		board.placePiece(new Rook(board, Color.WHITE), new Position(2,1));
		board.placePiece(new King(board, Color.BLACK), new Position(0,4));
		board.placePiece(new King(board, Color.WHITE), new Position(7,4));
	}
}
