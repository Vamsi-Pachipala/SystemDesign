package TicTacToe.Game;

import TicTacToe.Manager.GameManager;
import TicTacToe.Piece.Piece;
import TicTacToe.Piece.PieceFactory;
import TicTacToe.Piece.PieceType;

import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame implements Game {

   private final Deque<Player> players;
   private final Scanner scanner = new Scanner(System.in);
   private final GameManager gameManager;
   private final Piece[][] board;

    PieceFactory pieceFactory;
    public TicTacToeGame(Deque<Player> players , GameManager gameManager , PieceFactory pieceFactory) {
        this.players = players;
        board = new Piece[3][3];
        this.gameManager =  gameManager;
        this.pieceFactory = pieceFactory;
    }

    @Override
    public void start() {
        while (true){
            Piece winner = gameManager.findWinner(board);
            if(winner!=null){
                if(winner.findPieceType().equals(PieceType.T)){
                    System.out.println("Game is tie, please try again! good luck");
                    return;
                }
                System.out.println("Game is Over and winner is "+winner.findPieceType());
                scanner.close();
                return;
            }
            Player curTurnPlayer = players.pollFirst();
            gameManager.displayCurrentState(board);
            if(curTurnPlayer!=null) System.out.println("please enter your turn "+curTurnPlayer.getName());
            else {
                System.out.println("something went wrong to our System");
                return;
            }
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if(board[row][col] != null){
                System.out.println("wrong entry please choose empty cell ,good luck!");
                players.addFirst(curTurnPlayer);
                continue;
            }
            board[row][col] = pieceFactory.createPiece(curTurnPlayer.pieceType);
            players.addLast(curTurnPlayer);
        }
    }
}
