package com.chess.piece;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.exception.IllegalPositionException;

import java.util.*;

/**
 * Abstract class defining the methods required for chess piece implementation. Contains a concrete method with template pattern
 * implementation for finding the possible moves.
 *
 *
 *
 * 1. pieces should know their position.
 * 2. While creating piece, we will inject default positions
 * 2. pieces should have a property to find if they are black or white.
 */
public abstract class Piece {
    protected static final String WHITE = "White";
    protected static final String BLACK = "Black";

    protected ChessBoard chessBoard;
    protected String pieceColor;
    protected String currentPosition;

    public Piece(ChessBoard chessBoard, String pieceColor){
        this.chessBoard =  chessBoard;
        this.pieceColor =  pieceColor;
    }

    /**
     * Template method defining the steps to follow for each implementation.
     * @param currentPosition
     * @return
     * @throws IllegalPositionException
     */
    public Set<Position> findPossibleMoves(Position currentPosition) throws IllegalPositionException {
        validateCurrentPosition(currentPosition);
        Set<Position> positions = possibleMoves(currentPosition);
        positions.remove(currentPosition);
        return positions;
    }

    public String getPieceColor() {
        return pieceColor;
    }

    /**
     * Abstract method to be overridden by each subclass to find the possible moves/positions.
     * @param currentPosition the current position.
     * @return possible moves from the current position.
     */
    protected abstract Set<Position> possibleMoves(Position currentPosition);

    /**
     * Validates if current position is valid else throw the IllegalPosition exception.
     * @param currentPosition
     * @throws IllegalPositionException
     */
    public void validateCurrentPosition(Position currentPosition) throws IllegalPositionException {
        if(currentPosition.getColumn() > chessBoard.getBoardSize() || currentPosition.getRow() > chessBoard.getBoardSize()){
            throw new IllegalPositionException("Not valid position. ") ;
        }
    }
}
