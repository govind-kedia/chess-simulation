package com.chess.piece.impl;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.exception.IllegalPositionException;
import com.chess.util.ChessUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.stream.Collectors;

public class PawnTest {
    private ChessBoard chessBoard = new ChessBoard(8);
    private Pawn pawn = new Pawn(chessBoard);

    @Test
    public void testFindPossibleMovesForB2() throws IllegalPositionException {
        Set<Position> possibleMoves = pawn.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("B2"));
        Set<String> expectedMoves = Set.of("B1", "B3");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }


    @Test
    public void testFindPossibleMovesForB1() throws IllegalPositionException {
        Set<Position> possibleMoves = pawn.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("B1"));
        Set<String> expectedMoves = Set.of("B2");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }


    @Test
    public void testFindPossibleMovesForA8() throws IllegalPositionException {
        Set<Position> possibleMoves = pawn.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("A8"));
        Set<String> expectedMoves = Set.of("A7");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }
}
