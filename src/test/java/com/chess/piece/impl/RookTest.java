package com.chess.piece.impl;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.exception.IllegalPositionException;
import com.chess.util.ChessUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.stream.Collectors;

public class RookTest {
    private ChessBoard chessBoard = new ChessBoard(8);
    private Rook rook = new Rook(chessBoard);

    @Test(expected = IllegalPositionException.class)
    public void testFindPossibleMovesThrowExceptionIfRowIsOutOfIndex() throws IllegalPositionException {
        String currentPosition = "A" + (chessBoard.getBoardSize() +1);
        rook.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString(currentPosition));
    }

    @Test
    public void testFindPossibleMovesForA4() throws IllegalPositionException {
        Set<Position> possibleMoves = rook.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("A4"));
        Set<String> expectedMoves = Set.of("A1", "A2" ,"A3", "A5", "A6", "A7" , "A8", "B4", "C4", "D4" ,"E4","F4","G4","H4");
        Assert.assertEquals(possibleMoves.size(), 14);
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));

    }

    @Test
    public void testFindPossibleMovesForH8() throws IllegalPositionException {
        Set<Position> possibleMoves = rook.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("H8"));
        Set<String> expectedMoves = Set.of("A8", "B8" ,"C8", "D8", "E8", "F8" , "G8", "H1", "H2", "H3" ,"H4","H5","H6","H7");
        Assert.assertEquals(possibleMoves.size(), 14);
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));

    }

    @Test
    public void testFindPossibleMovesForA4WithIncreasedChessBoardSize() throws IllegalPositionException {

        chessBoard = new ChessBoard(10);
        rook = new Rook(chessBoard);
        Set<Position> possibleMoves = rook.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("A4"));
        Set<String> expectedMoves = Set.of("A1", "A2" ,"A3", "A5", "A6", "A7" , "A8","A9","A10", "B4", "C4", "D4" ,"E4","F4","G4","H4","I4","J4");
        Assert.assertEquals(possibleMoves.size(), 18);
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));

    }
}
