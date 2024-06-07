package LLD.SnakeLadder;

import java.util.Random;

class Dice {
    public int roll() {
        Random random = new Random();
        return random.nextInt(6) + 1; // Roll a 6-sided dice
    }
}