package com.chess.util;

import com.chess.board.Position;

import java.util.HashMap;
import java.util.Map;

/**
 * Util class defining util methods used across chess implementation.
 */
public final class ChessUtil {

    private static final String ALPHABETS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final Map<String, Integer> ALPHABETS_TO_INTEGER = new HashMap<>();
    private static final Map<Integer, String> INTEGER_TO_ALPHABETS = new HashMap<>();
    static{
        for(int i = 0; i < ALPHABETS.length(); i++){
            ALPHABETS_TO_INTEGER.put(String.valueOf(ALPHABETS.charAt(i)), i+1);
            INTEGER_TO_ALPHABETS.put(i+1, String.valueOf(ALPHABETS.charAt(i)));
        }
    }

    private ChessUtil(){
    }

    /**
     * Returns the current row for the given alpah numeric string.
     * @param alphaNumericString
     * @return
     */
    public static int getRowPosition(String alphaNumericString){
        return Integer.valueOf(alphaNumericString.substring(1,2));
    }

    /**
     * Returns the column position for the given alpha numeric string.
     * @param alphaNumericString
     * @return
     */
    public static int getColumnPosition(String alphaNumericString){
        return ALPHABETS_TO_INTEGER.get(alphaNumericString.substring(0,1));
    }

    /**
     * Converts the alpha numeric string to Position.
     * @param alphaNumericString
     * @return
     */
    public static Position getPositionFromAlphaNumericString(String alphaNumericString){
        return new Position(getColumnPosition(alphaNumericString), getRowPosition(alphaNumericString));
    }

    /**
     * Convers the numeric position to alpha numberic position.
     * @param position the numeric position.
     * @return the alpha numeric position.
     */
    public static String getAlphaNumericPosition(Position position){
        return INTEGER_TO_ALPHABETS.get(position.getColumn()) + position.getRow();

    }
}
