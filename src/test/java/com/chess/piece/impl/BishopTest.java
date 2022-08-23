package com.chess.piece.impl;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.exception.IllegalPositionException;
import com.chess.util.ChessUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.stream.Collectors;

public class BishopTest {

    private ChessBoard chessBoard = new ChessBoard(8);
    private Bishop bishop = new Bishop(chessBoard);

    @Test
    public void testFindPossibleMovesForA1() throws IllegalPositionException {
        Set<Position> possibleMoves = bishop.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("A1"));
        Set<String> expectedMoves = Set.of("B2", "C3","D4","E5","F6", "G7", "H8");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));

    }

    @Test
    public void testFindPossibleMovesForH1() throws IllegalPositionException {
        Set<Position> possibleMoves = bishop.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("H1"));
        Set<String> expectedMoves = Set.of("A8", "B7","C6","D5","E4", "F3", "G2");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));

    }

    @Test
    public void testFindPossibleMovesForA8() throws IllegalPositionException {
        Set<Position> possibleMoves = bishop.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("A8"));
        Set<String> expectedMoves = Set.of("B7","C6","D5","E4", "F3", "G2","H1");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));

    }

    @Test
    public void testFindPossibleMovesForH8() throws IllegalPositionException {
        Set<Position> possibleMoves = bishop.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("H8"));
        Set<String> expectedMoves = Set.of("A1", "B2", "C3","D4","E5","F6", "G7");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));

    }

    @Test
    public void testFindPossibleMovesForD4() throws IllegalPositionException {
        Set<Position> possibleMoves = bishop.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("D4"));
        Set<String> expectedMoves =  Set.of("A1","B2","C3", "E5","F6","G7","H8","A7","B6","C5","E3","F2","G1");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));

    }

    @Test
    public void testFindPossibleMovesForB7() throws IllegalPositionException {
        Set<Position> possibleMoves = bishop.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("B7"));
        Set<String> expectedMoves =  Set.of("A6","C8","A8","C6","D5","E4","F3","G2","H1");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testFindPossibleMovesForG7() throws IllegalPositionException {
        Set<Position> possibleMoves = bishop.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("G7"));
        Set<String> expectedMoves = Set.of("F8","H6", "A1", "B2", "C3","D4","E5","F6", "H8");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testFindPossibleMovesForB2() throws IllegalPositionException {
        Set<Position> possibleMoves = bishop.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("B2"));
        Set<String> expectedMoves = Set.of("C1","A3", "A1", "C3","D4","E5","F6","G7", "H8");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testFindPossibleMovesForG2() throws IllegalPositionException {
        Set<Position> possibleMoves = bishop.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("G2"));
        Set<String> expectedMoves =  Set.of("F1","H3","A8","B7","C6","D5","E4","F3","H1");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }

    @Test
    public void testFindPossibleMovesForD6() throws IllegalPositionException {
        Set<Position> possibleMoves = bishop.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("D6"));
        Set<String> expectedMoves = Set.of("A3","B4","C5","E7","F8","B8","C7","E5","F4","G3","H2");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));
    }


}
