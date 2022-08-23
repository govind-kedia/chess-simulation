package com.chess.piece.impl;

import com.chess.ChessPieceFactory;
import com.chess.piece.Piece;
import com.chess.piece.exception.IllegalChessPieceException;
import org.junit.Assert;
import org.junit.Test;

public class ChessPieceFactoryTest {
    @Test
    public void testGetChessPieceForKing() throws IllegalChessPieceException {
        Piece piece = ChessPieceFactory.getChessPiece("king", 8);
        Assert.assertTrue(piece instanceof King);
    }

    @Test
    public void testGetChessPieceForRook() throws IllegalChessPieceException {
        Piece piece = ChessPieceFactory.getChessPiece("Rook", 8);
        Assert.assertTrue(piece instanceof Rook);
    }
    @Test
    public void testGetChessPieceForHorse() throws IllegalChessPieceException {
        Piece piece = ChessPieceFactory.getChessPiece("Horse", 8);
        Assert.assertTrue(piece instanceof Horse);
    }

    @Test
    public void testGetChessPieceForBishop() throws IllegalChessPieceException {
        Piece piece = ChessPieceFactory.getChessPiece("Bishop", 8);
        Assert.assertTrue(piece instanceof Bishop);
    }

    @Test
    public void testGetChessPieceForPawn() throws IllegalChessPieceException {
        Piece piece = ChessPieceFactory.getChessPiece("Pawn", 8);
        Assert.assertTrue(piece instanceof Pawn);
    }

    @Test(expected = IllegalChessPieceException.class)
    public void testGetChessPieceThrowsRuntimeException() throws IllegalChessPieceException {
        Piece piece = ChessPieceFactory.getChessPiece("UnKnown Piece", 8);
    }

}
