package Lab2Prob2;

public class Bishop extends Piece {
    public Bishop(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (samePosition(b)) {
            return false;
        }

        return rowDiff(b) == colDiff(b);
    }
}
