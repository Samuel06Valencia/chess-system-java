package boardgame;

public class Board {
	//Atributos:
	private int rows;
	private int columns;
	private Piece[][] pieces;
	
	//Construtores:
	public Board() {
		super();
	}

	public Board(int rows, int columns) {
		super();
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns]; //Vai ser instanciadas com a quantidade de linhas e colunas informadas.
	}

	//Getters and setters:
	
	//Não possui get e set de "pieces",pois não irá retornar a matriz inteira,pois à métodos na classe para retornar uma peça por vez,dado uma linha e uma coluna, ou então por uma posição. 
	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}
	
	//Métodos:
	public Piece piece(int row, int column) {
		return pieces[row][column]; //retorna uma peça,dada uma linha(row) e uma coluna(column).
	}
	public Piece piece(Position position) {
		return pieces[position.getRow()][position.getColumn()]; //Sobrecarga, retorna a peça pela posição(position).
	}
	//O método PlacePiece vai ser responsável por colocar na posição, recebendo como parâmetros uma peça e uma posição.
	public void placePiece(Piece piece, Position position) {
		pieces[position.getRow()][position.getColumn()] = piece;
		piece.position = position;
	}
}
