package TicTacToe.Piece;

public class TiePieceType implements Piece {
    @Override
    public PieceType findPieceType() {
        return PieceType.T;
    }
}
