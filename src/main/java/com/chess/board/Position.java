package com.chess.board;

import com.chess.util.ChessUtil;

import java.util.Objects;

/**
 * Position class defining the position of chess piece.
 */
public final class Position {
    private final int row;
    private final int column;

    public Position(int column, int row){
        this.row =  row;
        this.column = column;
    }
    public int getRow() {
        return row;
    }
    public int getColumn() {
        return column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return row == position.row &&
                column == position.column;
    }

    @Override
    public int hashCode() {
        return Objects.hash(row, column);
    }

    @Override
    public String toString() {
        return ChessUtil.getAlphaNumericPosition(this);
    }
}
