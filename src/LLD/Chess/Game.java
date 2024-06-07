package LLD.Chess;
import java.util.LinkedList;

class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
   // private LinkedList<Move> moveHistory;

    public Game(Player player1, Player player2) {
        this.board = new Board();
        this.player1 = player1;
        this.player2 = player2;
        this.currentPlayer = player1; // Player 1 starts the game
       // this.moveHistory = new LinkedList<>();
    }

    public Board getBoard() {
        return board;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void switchTurn() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

   /* public boolean makeMove(Box start, Box end) {
        // Validate and execute the move
        // If the move is valid, add it to the move history
        if (board.movePiece(currentPlayer, start, end)) {
            moveHistory.addLast(new Move(start, end));
            return true;
        }
        return false;
    }*/

  /*  public void undoMove() {
        // Remove the last move from the move history
        if (!moveHistory.isEmpty()) {
            Move lastMove = moveHistory.removeLast();
            // Undo the move by reverting the pieces' positions on the board
            board.undoMove(lastMove);
            // Switch the turn back to the player who made the last move
            switchTurn();
        }
    }*/

    // Additional methods for managing the game state can be added here
}
