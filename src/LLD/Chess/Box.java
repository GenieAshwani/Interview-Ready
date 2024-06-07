package LLD.Chess;

class Box {
    private int row;
    private int col;
    private Piece piece;

    public Box(int row, int col) {
        this.row = row;
        this.col = col;
        this.piece = null; // Initialize with no piece
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    public boolean isEmpty() {
        return piece == null;
    }
}

