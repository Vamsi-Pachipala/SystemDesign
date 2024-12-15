package TicTacToe;

import TicTacToe.Game.Game;
import TicTacToe.Game.Player;
import TicTacToe.Game.TicTacToeGame;
import TicTacToe.Manager.GameManager;
import TicTacToe.Manager.TicTacToeGameManager;
import TicTacToe.Piece.PieceFactory;
import TicTacToe.Piece.PieceType;

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
