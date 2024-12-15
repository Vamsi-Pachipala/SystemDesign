package TicTacToe.Manager;

import TicTacToe.Piece.Piece;

public interface GameManager {

    Piece findWinner(Piece[][] board);

    void displayCurrentState(Piece[][] board);
}
