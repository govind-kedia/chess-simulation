package com.chess.piece.impl;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.exception.IllegalPositionException;
import com.chess.util.ChessUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.stream.Collectors;

public class HorseTest {
    private ChessBoard chessBoard = new ChessBoard(8);
    private Horse horse = new Horse(chessBoard);

    @Test(expected = IllegalPositionException.class)
    public void testFindPossibleMovesThrowExceptionIfRowIsOutOfIndex() throws IllegalPositionException {
        String currentPosition = "A" + (chessBoard.getBoardSize() + 1);
        horse.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString(currentPosition));
    }

    @Test
    public void testFindPossibleMovesForA1() throws IllegalPositionException {
        Set<Position> possibleMoves = horse.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("A1"));
        Set<String> expectedMoves = Set.of("C2", "B3");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testFindPossibleMovesForH1() throws IllegalPositionException {
        Set<Position> possibleMoves = horse.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("H1"));
        Set<String> expectedMoves = Set.of("F2", "G3");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testFindPossibleMovesForC1() throws IllegalPositionException {
        Set<Position> possibleMoves = horse.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("C1"));
        Set<String> expectedMoves = Set.of("A2", "B3", "E2", "D3");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testFindPossibleMovesForA8() throws IllegalPositionException {
        Set<Position> possibleMoves = horse.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("A8"));
        Set<String> expectedMoves = Set.of("C7", "B6");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testFindPossibleMovesForH8() throws IllegalPositionException {
        Set<Position> possibleMoves = horse.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("H8"));
        Set<String> expectedMoves = Set.of("F7", "G6");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testFindPossibleMovesForE3() throws IllegalPositionException {
        Set<Position> possibleMoves = horse.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("E3"));
        Set<String> expectedMoves = Set.of("F5", "G4", "G2", "F1", "D1", "C2", "C4", "D5");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }
}
