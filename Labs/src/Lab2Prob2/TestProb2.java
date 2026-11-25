package Lab2Prob2;

public class TestProb2 {
    public static void main(String[] args) {
        Piece rook = new Rook(new Position(1, 1));
        Piece bishop = new Bishop(new Position(4, 4));
        Piece queen = new Queen(new Position(3, 3));
        Piece knight = new Knight(new Position(5, 5));
        Piece king = new King(new Position(6, 6));
        Piece pawn = new Pawn(new Position(2, 2));

        System.out.println(rook + " -> (1,8): " + rook.isLegalMove(new Position(1, 8)));
        System.out.println(rook + " -> (3,4): " + rook.isLegalMove(new Position(3, 4)));

        System.out.println(bishop + " -> (6,6): " + bishop.isLegalMove(new Position(6, 6)));
        System.out.println(bishop + " -> (6,5): " + bishop.isLegalMove(new Position(6, 5)));

        System.out.println(queen + " -> (3,7): " + queen.isLegalMove(new Position(3, 7)));
        System.out.println(queen + " -> (6,6): " + queen.isLegalMove(new Position(6, 6)));
        System.out.println(queen + " -> (5,6): " + queen.isLegalMove(new Position(5, 6)));

        System.out.println(knight + " -> (7,6): " + knight.isLegalMove(new Position(7, 6)));
        System.out.println(knight + " -> (6,6): " + knight.isLegalMove(new Position(6, 6)));

        System.out.println(king + " -> (7,7): " + king.isLegalMove(new Position(7, 7)));
        System.out.println(king + " -> (8,8): " + king.isLegalMove(new Position(8, 8)));

        System.out.println(pawn + " -> (3,2): " + pawn.isLegalMove(new Position(3, 2)));
        System.out.println(pawn + " -> (4,2): " + pawn.isLegalMove(new Position(4, 2)));
    }
}
