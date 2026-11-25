package Lab2Prob2;

public class Rook extends Piece {
    public Rook(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (samePosition(b)) {
            return false;
        }

        return position.getRow() == b.getRow() || position.getCol() == b.getCol();
    }
}