package LLD.Chess;

class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Box start, Box end) {
        // Implementation specific to Pawn movement
        // Check if the move is valid for a pawn
        return false; // Placeholder return
    }
}
