package com.chess.piece.enums;

/**
 * Enum defining all possible chess pieces.
 */
public enum ChessPiece {
    KING("King"),
    QUEEN("Queen"),
    ROOK("Rook"),
    HORSE("Horse"),
    BISHOP("Bishop"),
    PAWN("Pawn");
    private final String name;
    ChessPiece(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public static ChessPiece fromName(String name){
        for (ChessPiece piece : ChessPiece.values()) {
            if (piece.name.equalsIgnoreCase(name)) {
                return piece;
            }
        }
        return null;
        }
    }
