package com.chess.piece.impl;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.Piece;

import java.util.HashSet;
import java.util.Set;

public class Horse extends Piece {

    public Horse(ChessBoard chessBoard){
        super(chessBoard);
    }

    @Override
    protected Set<Position> possibleMoves(Position currentPosition) {
        Set<Position> possibleMoves = new HashSet<>();
        addUpwardsMoves(possibleMoves, currentPosition);
        addDownwardsMove(possibleMoves, currentPosition);
        return possibleMoves;
    }

    private void addUpwardsMoves(Set<Position> possibleMoves, Position currentPosition){
        int twiceIncrementColumn =  currentPosition.getColumn() + 2;
        int twiceDecrementColumn =   currentPosition.getColumn() -2;
        int onceIncrementedRow  =  currentPosition.getRow() + 1;
        if(twiceIncrementColumn < chessBoard.getBoardSize() && onceIncrementedRow < chessBoard.getBoardSize()){
            possibleMoves.add(new Position(twiceIncrementColumn,onceIncrementedRow));
        }
        if(twiceDecrementColumn > 0 && onceIncrementedRow < chessBoard.getBoardSize()){
            possibleMoves.add(new Position(twiceDecrementColumn,onceIncrementedRow));
        }

        int onceIncrementColumn =  currentPosition.getColumn() + 1;
        int onceDecrementColumn =  currentPosition.getColumn() - 1;
        int twiceIncrementedRow  =  currentPosition.getRow() + 2;
        if(onceIncrementColumn < chessBoard.getBoardSize() && twiceIncrementedRow < chessBoard.getBoardSize()){
            possibleMoves.add(new Position(onceIncrementColumn,twiceIncrementedRow));
        }

        if(onceDecrementColumn > 0  && twiceIncrementedRow < chessBoard.getBoardSize()){
            possibleMoves.add(new Position(onceDecrementColumn,twiceIncrementedRow));
        }
    }
    private void addDownwardsMove(Set<Position> possibleMoves, Position currentPosition){
        int twiceIncrementColumn =  currentPosition.getColumn() + 2;
        int twiceDecrementColumn =   currentPosition.getColumn() -2;
        int onceDecrementRow  =  currentPosition.getRow() - 1;
        if(twiceIncrementColumn < chessBoard.getBoardSize() && onceDecrementRow > 0){
            possibleMoves.add(new Position(twiceIncrementColumn,onceDecrementRow));
        }
        if(twiceDecrementColumn > 0 && onceDecrementRow > 0){
            possibleMoves.add(new Position(twiceDecrementColumn,onceDecrementRow));
        }

        int onceIncrementColumn =  currentPosition.getColumn() + 1;
        int onceDecrementColumn =  currentPosition.getColumn() - 1;
        int twiceDecrementRow  =  currentPosition.getRow() - 2;
        if(onceIncrementColumn < chessBoard.getBoardSize() && twiceDecrementRow > 0){
            possibleMoves.add(new Position(onceIncrementColumn,twiceDecrementRow));
        }

        if(onceDecrementColumn > 0  && twiceDecrementRow > 0){
            possibleMoves.add(new Position(onceDecrementColumn,twiceDecrementRow));
        }
    }
}
