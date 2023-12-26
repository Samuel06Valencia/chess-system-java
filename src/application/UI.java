package application;

import chess.ChessPiece; //Pacote correspondente a cmada de xadrez.

public class UI {
	
 public static void printBoard(ChessPiece[][] pieces) {
	 for(int i =0; i<pieces.length; i++) {
		 System.out.print((8 - i) + " "); //Imprime a lista numérica.
		 for(int j=0; j< pieces.length; j++) {
			printPiece(pieces[i][j]); //Imprime as posições do tabuleiro.
		 }
		 System.out.println();
	 }
	 System.out.println("  a b c d e f g h"); //Imprime a tabela de posições em letras.
 }
 
 private static void printPiece(ChessPiece piece) {
	 if(piece == null) {
		System.out.print("-"); //Se a peça for nula,imprima um traço.
	 }
	 else {
		 System.out.print(piece);// se não, imprima a peça mesmo.
	 }
	 System.out.print(" ");
 }
}
