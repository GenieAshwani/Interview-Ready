package LLD.Chess;

import java.util.ArrayList;
import java.util.List;

class Player {
    private String name;
    private boolean isWhite;
    private List<Piece> capturedPieces;

    public Player(String name, boolean isWhite) {
        this.name = name;
        this.isWhite = isWhite;
        this.capturedPieces = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public boolean isWhite() {
        return isWhite;
    }

    public List<Piece> getCapturedPieces() {
        return capturedPieces;
    }

    public void capturePiece(Piece piece) {
        capturedPieces.add(piece);
    }
}

