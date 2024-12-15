package TicTacToe.Piece;

public class PieceFactory {

    public Piece createPiece(PieceType pieceType) {
        return switch (pieceType) {
            case X -> new XtypePiece(pieceType);
            case O -> new OtypePiece(pieceType);
            default -> null; // Or throw an exception if invalid
        };
    }
}
