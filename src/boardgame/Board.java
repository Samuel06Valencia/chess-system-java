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
	
	//Não possui get e set de "pieces",pois há métodos na classe para retornar uma peça por vez,dado uma linha e uma coluna. 
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
	
	
	
}
