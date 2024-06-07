package LLD.Chess;

abstract class Piece {
    private boolean isWhite;
    private boolean isKilled;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
        this.isKilled = false;
    }

    // Getter and setter for isWhite
    public boolean isWhite() {
        return isWhite;
    }

    public void setWhite(boolean white) {
        isWhite = white;
    }

    // Getter and setter for isKilled
    public boolean isKilled() {
        return isKilled;
    }

    public void setKilled(boolean killed) {
        isKilled = killed;
    }

    // Abstract method for checking if the piece can move to a given destination
    public abstract boolean canMove(Board board, Box start, Box end);
}

