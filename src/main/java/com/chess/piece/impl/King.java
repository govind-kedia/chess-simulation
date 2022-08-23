package com.chess.piece.impl;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.Piece;

import java.util.HashSet;
import java.util.Set;

public class King extends Piece {

    public King(ChessBoard chessBoard){
        super(chessBoard);
    }

    @Override
    protected Set<Position> possibleMoves(Position currentPosition) {
        Set<Position> possibleMoves =  new HashSet<>();
        int currentRow =  currentPosition.getRow();
        int currentColumn =  currentPosition.getColumn();
        for( int column = currentColumn -1 ; column <= currentColumn + 1 ; column++){
            addPossibleMoves(possibleMoves, column, currentRow );
        }
        return possibleMoves;
    }
    private void addPossibleMoves(Set<Position> possibleMoves, int column, int currentRow){
        if(column > 0 && column <= chessBoard.getBoardSize()) {
            possibleMoves.add(new Position(column, currentRow));
            if(currentRow + 1 < chessBoard.getBoardSize()){
                possibleMoves.add(new Position(column, currentRow +1));
            }
            if(currentRow - 1 > 0){
                possibleMoves.add(new Position(column, currentRow -1));
            }
        }
    }
}
