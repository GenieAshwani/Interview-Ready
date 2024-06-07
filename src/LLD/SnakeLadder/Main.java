package LLD.SnakeLadder;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(100, 2); // Board size: 100, Number of players: 2
        game.addSnake(14, 7); // Sample snake
        game.addLadder(5, 20); // Sample ladder
        game.start();
    }
}
