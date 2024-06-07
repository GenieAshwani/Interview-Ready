package LLD.Chess;

class Rook extends Piece {
    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        // Implementation specific to Rook movement
        // Check if the move is valid for a rook
        return false; // Placeholder return
    }
}