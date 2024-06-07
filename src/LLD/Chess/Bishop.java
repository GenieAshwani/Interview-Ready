package LLD.Chess;

class Bishop extends Piece {
    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        // Implementation specific to Bishop movement
        // Check if the move is valid for a bishop
        return false; // Placeholder return
    }
}
