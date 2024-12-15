package TicTacToe.Piece;

public class XtypePiece implements Piece {

    PieceType pieceType;

    XtypePiece(PieceType pieceType){
        this.pieceType = pieceType;
    }
    @Override
    public PieceType findPieceType() {
        return PieceType.X;
    }
}
