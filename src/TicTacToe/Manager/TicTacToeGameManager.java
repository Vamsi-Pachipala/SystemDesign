package TicTacToe.Manager;

import TicTacToe.Piece.Piece;
import TicTacToe.Piece.TiePieceType;

public class TicTacToeGameManager implements GameManager {

    @Override
    public Piece findWinner(Piece[][] board) {
        int n = board.length;

        // Check rows
        for (Piece[] pieces : board) {
            Piece first = pieces[0];
            if (first != null) {
                boolean isRowComplete = true;
                for (int j = 1; j < n; j++) {
                    if (pieces[j] == null || !first.findPieceType().equals(pieces[j].findPieceType())) {
                        isRowComplete = false;
                        break;
                    }
                }
                if (isRowComplete) return first; // Row winner
            }
        }

        // Check columns
        for (int col = 0; col < n; col++) {
            Piece first = board[0][col];
            if (first != null) {
                boolean isColumnComplete = true;
                for (int row = 1; row < n; row++) {
                    if (board[row][col] == null || !first.findPieceType().equals(board[row][col].findPieceType())) {
                        isColumnComplete = false;
                        break;
                    }
                }
                if (isColumnComplete) return first; // Column winner
            }
        }

        // Check left-to-right diagonal
        Piece firstDiagonalLeft = board[0][0];
        if (firstDiagonalLeft != null) {
            boolean isLeftDiagonalComplete = true;
            for (int i = 1; i < n; i++) {
                if (board[i][i] == null || !firstDiagonalLeft.findPieceType().equals(board[i][i].findPieceType())) {
                    isLeftDiagonalComplete = false;
                    break;
                }
            }
            if (isLeftDiagonalComplete) return firstDiagonalLeft; // Left diagonal winner
        }

        // Check right-to-left diagonal
        Piece firstDiagonalRight = board[0][n - 1];
        if (firstDiagonalRight != null) {
            boolean isRightDiagonalComplete = true;
            for (int i = 1; i < n; i++) {
                if (board[i][n - 1 - i] == null || !firstDiagonalRight.findPieceType().equals(board[i][n - 1 - i].findPieceType())) {
                    isRightDiagonalComplete = false;
                    break;
                }
            }
            if (isRightDiagonalComplete) return firstDiagonalRight; // Right diagonal winner
        }

        // Check if all cells are filled for a tie
        boolean allFilled = true;
        for (Piece[] pieces : board) {
            for (Piece piece : pieces) {
                if (piece == null) {
                    allFilled = false;
                    break;
                }
            }
            if (!allFilled) break; // Break outer loop early if empty cell is found
        }

        if (allFilled) {
            return new TiePieceType(); // Custom Piece to represent a tie
        }

        // If no winner and not all cells are filled, return null (game still ongoing)
        return null;
    }


    @Override
    public void displayCurrentState(Piece[][] board) {
        int n = board.length;
        for (Piece[] pieces : board) {
            for (int j = 0; j < n; j++) {
                if (pieces[j] != null) System.out.print(pieces[j].findPieceType() + "  ");
                else System.out.print("--" + "  ");
            }
            System.out.println();
        }
    }
}
