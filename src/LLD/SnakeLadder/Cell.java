package LLD.SnakeLadder;

class Cell {
    private final int number;
    private final CellType type;

    public Cell(int number, CellType type) {
        this.number = number;
        this.type = type;
    }

    public CellType getType() {
        return type;
    }
}