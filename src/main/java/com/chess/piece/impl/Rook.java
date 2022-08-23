package com.chess.piece.impl;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.Piece;

import java.util.HashSet;
import java.util.Set;

public class Rook extends Piece {

    public Rook(ChessBoard chessBoard){
        super(chessBoard);
    }

    @Override
    public Set<Position> possibleMoves(Position currentPosition) {
        Set<Position> possibleMoves =  new HashSet<>();
        addHorizontalMoves(possibleMoves, currentPosition);
        addVerticalMoves(possibleMoves, currentPosition);
        return possibleMoves;
    }
    private void addHorizontalMoves(Set<Position> possibleMoves, Position currentPosition){
        for(int column = 0; column < chessBoard.getBoardSize() ; column++){
            possibleMoves.add(new Position(column+1 , currentPosition.getRow()));
        }
    }
    private void addVerticalMoves(Set<Position> possibleMoves, Position currentPosition){
        for(int row = 0; row < chessBoard.getBoardSize() ; row++){
            possibleMoves.add(new Position(currentPosition.getColumn(), row+1));
        }

    }
}
