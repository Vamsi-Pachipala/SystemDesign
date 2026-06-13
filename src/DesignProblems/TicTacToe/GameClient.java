package DesignProblems.TicTacToe;

import DesignProblems.TicTacToe.Game.Game;
import DesignProblems.TicTacToe.Game.Player;
import DesignProblems.TicTacToe.Game.TicTacToeGame;
import DesignProblems.TicTacToe.Manager.GameManager;
import DesignProblems.TicTacToe.Manager.TicTacToeGameManager;
import DesignProblems.TicTacToe.Piece.PieceFactory;
import DesignProblems.TicTacToe.Piece.PieceType;

import java.util.Deque;
import java.util.LinkedList;

public class GameClient {
    public static void main(String[] args) {
        Deque<Player> deque = new LinkedList<>();
        Player p1 = new Player("Ramesh" , PieceType.X);
        Player p2 = new Player("Rajesh", PieceType.O);
        deque.add(p1);
        deque.add(p2);
        GameManager gameManager = new TicTacToeGameManager();
        PieceFactory pieceFactory = new PieceFactory();
        Game ticTocToe = new TicTacToeGame(deque , gameManager , pieceFactory);
        ticTocToe.start();
    }
}
