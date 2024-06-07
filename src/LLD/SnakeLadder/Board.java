package LLD.SnakeLadder;

import java.util.ArrayList;
import java.util.List;

class Board {
    private final int size;
    private final List<Integer> snakes;
    private final List<Integer> ladders;

    public Board(int size) {
        this.size = size;
        this.snakes = new ArrayList<>();
        this.ladders = new ArrayList<>();
    }

    public void setSnake(int start, int end) {
        snakes.add(start);
        snakes.add(end);
    }

    public void setLadder(int start, int end) {
        ladders.add(start);
        ladders.add(end);
    }

    public void movePlayer(Player player, int steps) {
        int newPosition = player.getPosition() + steps;
        if (newPosition > size) {
            System.out.println("Player " + player.getId() + " cannot move beyond the board.");
            return;
        }
        player.setPosition(newPosition);
        checkSnakeOrLadder(player);
    }

    private void checkSnakeOrLadder(Player player) {
        int position = player.getPosition();
        for (int i = 0; i < snakes.size(); i += 2) {
            if (position == snakes.get(i)) {
                player.setPosition(snakes.get(i + 1));
                System.out.println("Player " + player.getId() + " encountered a snake at position " + position + ". Moved to position " + snakes.get(i + 1));
                return;
            }
        }
        for (int i = 0; i < ladders.size(); i += 2) {
            if (position == ladders.get(i)) {
                player.setPosition(ladders.get(i + 1));
                System.out.println("Player " + player.getId() + " encountered a ladder at position " + position + ". Moved to position " + ladders.get(i + 1));
                return;
            }
        }
    }

    public boolean checkWin(Player player) {
        return player.getPosition() == size;
    }
}
