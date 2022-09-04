package boardgame;

public class Board {
    private int fileira;
    private int coluna;
    private Piece [][] pieces;

    public Board(int fileira, int coluna) {
        this.fileira = fileira;
        this.coluna = coluna;
        pieces = new Piece[fileira][coluna];
    }

    public int getFileira() {
        return fileira;
    }

    public void setFileira(int fileira) {
        this.fileira = fileira;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

    public Piece piece(int fileira, int coluna){
        return pieces [fileira][coluna];
    }

    public Piece piece(Position position){
        return pieces[position.getFileira()][position.getColuna()];
    }
}
