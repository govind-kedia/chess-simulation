package com.chess.piece.exception;

/**
 * Exception class to handle the wrong position.
 */
public class IllegalPositionException extends  Exception{

    public IllegalPositionException(String message){
        super(message);
    }
}
