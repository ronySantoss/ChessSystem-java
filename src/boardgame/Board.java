package boardgame;

public class Board {

	private int rows;
	private int columns;
	private Piece [][]pieces;
	
	public Board(int rows, int colums) {
		this.rows = rows;
		this.columns = colums;
		pieces = new Piece[rows][columns];
	}

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
