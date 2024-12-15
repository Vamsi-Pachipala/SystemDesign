package TicTacToe.Game;

import TicTacToe.Piece.PieceType;

public class Player {



    String name;
    private int id;
    private static int idCounter = 1;

    public PieceType pieceType;

    public Player(String name , PieceType pieceType) {
        this.name = name;
        this.id = idCounter++;
        this.pieceType = pieceType;
    }

    public String getName() {
        return name;
    }
}
