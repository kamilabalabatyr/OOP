package Lab2Prob2;

public class Queen extends Piece {
    public Queen(Position position) {
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b) {
        if (samePosition(b)) {
            return false;
        }

        boolean rookMove = position.getRow() == b.getRow() || position.getCol() == b.getCol();
        boolean bishopMove = rowDiff(b) == colDiff(b);

        return rookMove || bishopMove;
    }
}
