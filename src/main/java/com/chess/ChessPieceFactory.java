package com.chess;

import com.chess.board.ChessBoard;
import com.chess.piece.Piece;
import com.chess.piece.enums.ChessPiece;
import com.chess.piece.exception.IllegalChessPieceException;
import com.chess.piece.impl.*;

import java.text.MessageFormat;

public class ChessPieceFactory {

    private final static String UNKNOWN_CHESS_PIECE =  "Could not find chess piece with given input of {0}. ";

    public static Piece getChessPiece(String chessPieceName, int sizeOfBoard) throws IllegalChessPieceException {
        if(chessPieceName == null || chessPieceName.trim().length() == 0){
            throw new IllegalChessPieceException(MessageFormat.format(UNKNOWN_CHESS_PIECE,chessPieceName));
        }
        ChessPiece chessPiece = ChessPiece.fromName(chessPieceName);
        if(chessPiece != null) {
            ChessBoard chessBoard = new ChessBoard(sizeOfBoard);
            switch (chessPiece) {
                case KING:
                    return new King(chessBoard);
                case PAWN:
                    return new Pawn(chessBoard);
                case ROOK:
                    return new Rook(chessBoard);
                case HORSE:
                    return new Horse(chessBoard);
                case QUEEN:
                    return new Queen(chessBoard, new Rook(chessBoard), new Bishop(chessBoard));
                case BISHOP:
                    return new Bishop(chessBoard);
                default:
                    throw new IllegalChessPieceException(MessageFormat.format(UNKNOWN_CHESS_PIECE,chessPieceName));
            }
        }
        throw new IllegalChessPieceException(MessageFormat.format(UNKNOWN_CHESS_PIECE,chessPieceName));
    }
}
