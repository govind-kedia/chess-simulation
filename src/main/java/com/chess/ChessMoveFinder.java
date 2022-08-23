package com.chess;

import com.chess.board.Position;
import com.chess.piece.Piece;
import com.chess.piece.exception.IllegalChessPieceException;
import com.chess.piece.exception.IllegalPositionException;
import com.chess.util.ChessUtil;

import java.util.Scanner;
import java.util.Set;

/**
 * Main class for receiving the user input and providing the user with the
 * list of possible positions for given piece wth current position.
 */
public class ChessMoveFinder {

    private static final String SAMPLE_INPUT_FORMAT_MESSAGE = "Please provide input in proper format. Example: Horse A1";

    public static void main(String[] args) {
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input - ");
            String userInput = scanner.nextLine().trim();
            if(userInput.equals("exit")){
                System.exit(0);
            }
            String [] userInputs = userInput.split(" ");

            try {
                if(userInputs.length != 2){
                    throw new RuntimeException("Wrong input format. " + SAMPLE_INPUT_FORMAT_MESSAGE);
                }
                Piece chessPiece = ChessPieceFactory.getChessPiece(userInputs[0], 8);
                Set<Position> possibleMoves = chessPiece.findPossibleMoves(ChessUtil.getPositionFromAlphaNumericString(userInputs[1].toUpperCase()));
                possibleMoves.stream().forEach(move -> System.out.print(move + " "));
                System.out.println();
            } catch (IllegalChessPieceException exception) {
                System.out.println(exception.getMessage() + SAMPLE_INPUT_FORMAT_MESSAGE);
            }catch (IllegalPositionException exception){
                System.out.println(exception.getMessage() + SAMPLE_INPUT_FORMAT_MESSAGE);
            }catch (RuntimeException exception){
                System.out.println("Invalid Input: "+SAMPLE_INPUT_FORMAT_MESSAGE);
            }

        }
    }
}
