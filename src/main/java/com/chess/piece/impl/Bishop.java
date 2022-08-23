package com.chess.piece.impl;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.Piece;

import java.util.HashSet;
import java.util.Set;
public class Bishop extends Piece {
    public Bishop(ChessBoard chessBoard){
        super(chessBoard);
    }

    @Override
    protected Set<Position> possibleMoves(Position currentPosition) {
        Set<Position> possibleMoves =  new HashSet<>();
        int currentColumnPosition = currentPosition.getColumn();
        int row = currentPosition.getRow();
        int boardSize = chessBoard.getBoardSize();

        for (int j = currentColumnPosition + 1, i = row + 1; j <= boardSize && i <= boardSize; j++, i++) {
            possibleMoves.add(new Position(j, i));
        }
        for (int j = currentColumnPosition - 1, i = row + 1; j > 0 && i <= boardSize; j--, i++) {
            possibleMoves.add(new Position(j, i));
        }
        for (int j = currentColumnPosition - 1, i = row - 1; j > 0 && i > 0; j--, i--) {
            possibleMoves.add(new Position(j, i));
        }
        for (int j = currentColumnPosition + 1, i = row - 1; j <= boardSize && i > 0; j++, i--) {
            possibleMoves.add(new Position(j, i));
        }
        return possibleMoves;
    }
}
