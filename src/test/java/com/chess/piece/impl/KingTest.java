package com.chess.piece.impl;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.exception.IllegalPositionException;
import com.chess.util.ChessUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.stream.Collectors;

public class KingTest {

    private ChessBoard chessBoard = new ChessBoard(8);
    private King king = new King(chessBoard);

    @Test(expected = IllegalPositionException.class)
    public void testFindPossibleMovesThrowExceptionIfRowIsOutOfIndex() throws IllegalPositionException {
        String currentPosition = "A" + (chessBoard.getBoardSize() +1);
        king.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString(currentPosition));
    }

    @Test
    public void testFindPossibleMovesForD1() throws IllegalPositionException {
        Set<Position> possibleMoves = king.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("D1"));
        Set<String> expectedMoves = Set.of("C1","C2","D2", "E1","E2");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));

    }

    @Test
    public void testsFindPossibleMovesForD8() throws IllegalPositionException {
        Set<Position> possibleMoves = king.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("D8"));
        Set<String> expectedMoves=  Set.of("C7","C8", "D7","E7","E8");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testsFindPossibleMovesForA1() throws IllegalPositionException {
        Set<Position> possibleMoves = king.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("A1"));
        Set<String> expectedMoves=  Set.of("A2", "B1", "B2");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testsFindPossibleMovesForA8() throws IllegalPositionException {
        Set<Position> possibleMoves = king.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("A8"));
        Set<String> expectedMoves=  Set.of("A7", "B7", "B8");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testsFindPossibleMovesForH1() throws IllegalPositionException {
        Set<Position> possibleMoves = king.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("H1"));
        Set<String> expectedMoves=  Set.of("G1", "G2", "H2");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testsFindPossibleMovesForH8() throws IllegalPositionException {
        Set<Position> possibleMoves = king.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("H8"));
        Set<String> expectedMoves=  Set.of( "G7", "G8" , "H7");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testsFindPossibleMovesForC5() throws IllegalPositionException {
        Set<Position> possibleMoves = king.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("C5"));
        Set<String> expectedMoves=  Set.of("B4","B5", "B6","C4","C6" , "D4", "D5", "D6");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }




}
