package boardgame; //Pacote correspondente a camada de tabuleiro do projeto.

public class Piece {
	//Atributos
	protected Position position; //Ela é protected, pois não quero que fique visivel na camada de movimentação do xadrez
	private Board board; //Associação
	
	//Construtores:
	public Piece() {
		super();
	}

	//Passo somento o tabuleiro(board), pois a posição(position) da peça, incialmente será nula, pois a peça ainda não foi colocada no tabuleiro.
	public Piece( Board board) {
		super();
		this.board = board;
		position = null; //Opcional, por padrão o java coloca como nulo.
	}

	
	//Getters and Setters - Conceito Encapsulamento

	protected Board getBoard() { //protected, pois somente classes e subclasses dentro do mesmo pacote, poderão acessar o tabuleiro de uma peça
		return board; //Apenas visualização.
	}

	/* #Comentado,pois não posso permitir que o tabuleiro sofra alterações externas#
	public void setBoard(Board board) {
		this.board = board;
	}
	*/
	
}
