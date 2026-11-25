package Lab2Prob2;

public class King extends Piece {
    public King(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (samePosition(b)) {
            return false;
        }

        return rowDiff(b) <= 1 && colDiff(b) <= 1;
    }
}
