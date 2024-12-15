package TicTacToe.Piece;

public class OtypePiece implements Piece {
    PieceType pieceType;

    OtypePiece(PieceType pieceType){
        this.pieceType = pieceType;
    }
    @Override
    public PieceType findPieceType() {
        return PieceType.O;
    }
}
