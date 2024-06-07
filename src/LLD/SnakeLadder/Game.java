package LLD.SnakeLadder;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Game {
    private final List<Player> players;
    private final Board board;

    public Game(int size, int numPlayers) {
        this.board = new Board(size);
        this.players = new ArrayList<>();
        for (int i = 1; i <= numPlayers; i++) {
            players.add(new Player(i));
        }
    }

    public void addSnake(int start, int end) {
        board.setSnake(start, end);
    }

    public void addLadder(int start, int end) {
        board.setLadder(start, end);
    }

    public void start() {
        Random random = new Random();
        while (true) {
            for (Player player : players) {
                int diceRoll = random.nextInt(6) + 1; // Roll a 6-sided dice
                System.out.println("Player " + player.getId() + " rolled a " + diceRoll);
                board.movePlayer(player, diceRoll);
                if (board.checkWin(player)) {
                    System.out.println("Player " + player.getId() + " wins!");
                    return;
                }
            }
        }
    }
}