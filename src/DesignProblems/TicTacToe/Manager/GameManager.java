package DesignProblems.TicTacToe.Manager;

import DesignProblems.TicTacToe.Piece.Piece;

public interface GameManager {

    Piece findWinner(Piece[][] board);

    void displayCurrentState(Piece[][] board);
}
