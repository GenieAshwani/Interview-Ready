package LLD.SnakeLadder;

class Player {
    private final int id;
    private int position;

    public Player(int id) {
        this.id = id;
        this.position = 1; // Start from cell 1
    }

    public int getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
