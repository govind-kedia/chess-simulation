package com.chess.piece.impl;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.Piece;

import java.util.HashSet;
import java.util.Set;

public class Pawn extends Piece {
    public Pawn(ChessBoard chessBoard){
        super(chessBoard);
    }

    @Override
    protected Set<Position> possibleMoves(Position currentPosition) {
        Set<Position> possibleMoves =  new HashSet<>();
        int currentRow =  currentPosition.getRow();
        int currentColumn =  currentPosition.getColumn();
        for(int row = currentRow -1 ; row <= currentRow +1 ; row++){
            addPossibleMoves(possibleMoves,currentColumn,row);
        }
        return possibleMoves;
    }
    private void addPossibleMoves(Set<Position> possibleMoves, int column, int currentRow){
        if(currentRow > 0 && currentRow <= chessBoard.getBoardSize()) {
            possibleMoves.add(new Position(column,currentRow));
        }
    }
}
