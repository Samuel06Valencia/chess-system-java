package boardgame; //Pacote correspondente a camada de tabuleiro do projeto.

public class Position {
	//Atributos
	private int row;
	private int column;
	
	//Construtores
	public Position() {
		super();
	}
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	//Getters and Setters - Conceito Encapsulamento
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getColumn() {
		return column;
	}
	public void setColumn(int column) {
		this.column = column;
	}
	
	//Métodos:
	public void setValues(int row, int column) {
		this.row = row;
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
}
