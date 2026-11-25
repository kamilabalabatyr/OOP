package Lab2Prob2;

public abstract class Piece {
    protected Position position;

    public Piece(Position position) {
        this.position = position;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public abstract boolean isLegalMove(Position b);

    public void move(Position b) {
        if (isLegalMove(b)) {
            position = b;
        } else {
            System.out.println("Illegal move for " + getClass().getSimpleName());
        }
    }

    protected int rowDiff(Position b) {
        return Math.abs(position.getRow() - b.getRow());
    }

    protected int colDiff(Position b) {
        return Math.abs(position.getCol() - b.getCol());
    }

    protected boolean samePosition(Position b) {
        return position.getRow() == b.getRow() && position.getCol() == b.getCol();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + " at " + position;
    }
}
