package LLD.Chess;

class Board {
    private final int ROWS = 8;
    private final int COLS = 8;
    private final Box[][] boxes;

    public Board() {
        this.boxes = new Box[ROWS][COLS];
        initializeBoard();
    }

    private void initializeBoard() {
        // Set up white pieces
        boxes[0][0].setPiece(new Rook(true));
        boxes[0][1].setPiece(new Knight(true));
        boxes[0][2].setPiece(new Bishop(true));
        boxes[0][3].setPiece(new Queen(true));
        boxes[0][4].setPiece(new King(true));
        boxes[0][5].setPiece(new Bishop(true));
        boxes[0][6].setPiece(new Knight(true));
        boxes[0][7].setPiece(new Rook(true));
        for (int col = 0; col < COLS; col++) {
            boxes[1][col].setPiece(new Pawn(true));
        }

        // Set up black pieces
        boxes[7][0].setPiece(new Rook(false));
        boxes[7][1].setPiece(new Knight(false));
        boxes[7][2].setPiece(new Bishop(false));
        boxes[7][3].setPiece(new Queen(false));
        boxes[7][4].setPiece(new King(false));
        boxes[7][5].setPiece(new Bishop(false));
        boxes[7][6].setPiece(new Knight(false));
        boxes[7][7].setPiece(new Rook(false));
        for (int col = 0; col < COLS; col++) {
            boxes[6][col].setPiece(new Pawn(false));
        }

        // Initialize empty boxes
        for (int row = 2; row < 6; row++) {
            for (int col = 0; col < COLS; col++) {
                boxes[row][col] = new Box(row, col);
            }
        }
    }

    public Box getBox(int row, int col) {
        return boxes[row][col];
    }

    // Additional methods for managing the board state can be added here
}
