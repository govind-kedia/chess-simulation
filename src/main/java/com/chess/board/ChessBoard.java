package com.chess.board;

/**
 * Chess Board class defining the size of boards.
 */
public class ChessBoard {
    private int boardSize;
    public ChessBoard (int boardSize){
        this.boardSize =  boardSize;
    }
    public int getBoardSize() {
        return boardSize;
    }
}
