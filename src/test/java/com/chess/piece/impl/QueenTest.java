package com.chess.piece.impl;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.exception.IllegalPositionException;
import com.chess.util.ChessUtil;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.stream.Collectors;

public class QueenTest {
    private ChessBoard chessBoard = new ChessBoard(8);
    private Queen queen = new Queen(chessBoard,new Rook(chessBoard), new Bishop(chessBoard), "White");

    @Test
    public void testFindPossibleMovesForA1() throws IllegalPositionException {
        Set<Position> possibleMoves = queen.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("A1"));
        Set<String> expectedMoves = Set.of("H1", "G1", "F1", "E1", "D1", "C1", "B1", "B2", "C3", "D4", "E5", "F6",
                "G7", "H8", "A2", "A3", "A4", "A5", "A6", "A7", "A8");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));

    }

    @Test
    public void testFindPossibleMovesForD4() throws IllegalPositionException {
        Set<Position> possibleMoves = queen.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString("D4"));
        Set<String> expectedMoves = Set.of("G1", "G4", "E3", "E4", "E5", "G7", "C3", "A1", "C4", "C5", "A4", "A7", "H4",
                "F2", "D1", "D2", "F4", "D3", "F6", "H8", "B2", "D5", "D6", "B4", "D7", "D8", "B6");
        Set<String> convertedAlphaNumericMoves = possibleMoves
                .stream()
                .map(position -> ChessUtil.getAlphaNumericPosition(position))
                .collect(Collectors.toSet());
        Assert.assertTrue(expectedMoves.equals(convertedAlphaNumericMoves));

    }

    @Test
    public void testPieceColorIsWhile(){
        Assert.assertEquals("White",queen.getPieceColor());
    }
}
