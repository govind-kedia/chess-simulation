package com.chess.util;

import com.chess.board.ChessBoard;
import com.chess.board.Position;
import com.chess.piece.exception.IllegalPositionException;
import org.junit.Assert;
import org.junit.Test;

public class ChessUtilTest {

    @Test
    public void testGetCurrentRowForPositionA1(){
        int currrentRow = ChessUtil.getRowPosition("A1");
        Assert.assertEquals(1, currrentRow);
    }

    @Test
    public void testGetCurrentRowForPositionA8(){
        int currrentRow = ChessUtil.getRowPosition("A8");
        Assert.assertEquals(8, currrentRow);
    }

    @Test
    public void testGetCurrentColumnForPositionA1(){
        int currentColumn = ChessUtil.getColumnPosition("A1");
        Assert.assertEquals(1,currentColumn);
    }

    @Test
    public void testGetCurrentColumnForPositionH1(){
        int currentColumn = ChessUtil.getColumnPosition("H1");
        Assert.assertEquals(8,currentColumn);
    }

    @Test
    public void testGetAlphaNumericPositionForPosition11(){
        String alphaNumericPosition = ChessUtil.getAlphaNumericPosition(new Position(1, 1));
        Assert.assertEquals("A1", alphaNumericPosition);
    }

    @Test
    public void testGetAlphaNumericPositionForPosition18(){
        String alphaNumericPosition = ChessUtil.getAlphaNumericPosition(new Position(8, 1));
        Assert.assertEquals("H1", alphaNumericPosition);
    }
    @Test
    public void testGetAlphaNumericPositionForPosition81(){
        String alphaNumericPosition = ChessUtil.getAlphaNumericPosition(new Position(1, 8));
        Assert.assertEquals("A8", alphaNumericPosition);
    }
}
