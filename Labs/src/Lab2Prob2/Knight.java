package Lab2Prob2;

public class Knight extends Piece {
    public Knight(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (samePosition(b)) {
            return false;
        }

        int r = rowDiff(b);
        int c = colDiff(b);

        return (r == 2 && c == 1) || (r == 1 && c == 2);
    }
}
