package com.chess.piece.impl;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.Piece;

import java.util.HashSet;
import java.util.Set;

public class Queen extends Piece {
    private Rook rook;
    private Bishop bishop;
    public Queen(ChessBoard chessBoard, Rook rook, Bishop bishop){
        super(chessBoard);
        this.rook = rook;
        this.bishop = bishop;
    }

    @Override
    protected Set<Position> possibleMoves(Position currentPosition){
        Set<Position> possibleMoves = new HashSet<>();
        Set<Position> rooksMoves = rook.possibleMoves(currentPosition);
        Set<Position> bishopMoves = bishop.possibleMoves(currentPosition);
        possibleMoves.addAll(rooksMoves);
        possibleMoves.addAll(bishopMoves);
        return possibleMoves;
    }
}
