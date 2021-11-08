package rocks.zipcodewilmington.tictactoe;

import java.util.function.BinaryOperator;

/**
 * @author leon on 6/22/18.
 * multidimensional array. i.e. two-dimensional array can be seen as an array of one - Syntax -> variable[][]-[row_index][column_index] <- Syntax
 *
 *
 */
public class Board {
    private Character[][] matrix; //we created this field, to save information based off the matrix input, to reference it for other methods - this is a constructor - it has to have the same name of the class
    //methods can only reference data from two sources, parameters or fields of the class
    public Board(Character[][] matrix) { //constructor is the setup - provides the "wiring" for the creations of the object
        this.matrix = matrix; //this is pointing towards the field of methods
        //this is a constructor - it has to have the same name of the class
    }

    public Boolean isInFavorOfX() {
        return isInFavorOfCharacter('X');
    }


    public Boolean isInFavorOfCharacter(char player){ //helper method
        for(int row =0; row < matrix.length; row++){
            int rowCounter = 0; //every time we hit a new row we are resetting the counter to zero
            for(int column = 0; column < matrix[0].length; column++){ //matrix[0] = this is saying that we are looking at the array thats inside one of the array position
                if(matrix[row][column] == player){
                    rowCounter++;
                    for (int i = 0; i < matrix.length; i++) {
                        Character[] characters = matrix[i];

                    }
                }
            }
            if(rowCounter == 3){
                return true;
            }
        }
        for(int column = 0; column < 3; column++){
            int columnCounter = 0;
            for(int row = 0; row < 3; row++){
                if(matrix[row][column] == player){
                    columnCounter++;
                }
            }
            if(columnCounter == 3){
                return true;
            }
        }
        if(matrix[0][0] == player && matrix[1][1] == player && matrix [2][2] == player){ //separate conditions to check diagonals
            return true;
        }
        if(matrix[0][2] == player && matrix[1][1] == player && matrix [2][0] == player){
            return true;
        }
        return false;
    }
    
    public Boolean isInFavorOfO() {
        return isInFavorOfCharacter('O');
    }

    public Boolean isTie() {
        //is not in favor of x and not in favor o...to be a tie
//        if(isInFavorOfO() || isInFavorOfX()) {
//            return false;
//        }
//            else{
//                return true;
//            }
//        }
        if(!isInFavorOfX() && !isInFavorOfO()) {
            return true;
        }
        
        else {
            return false;
        }
    }

    public String getWinner() {
        if(isInFavorOfX() == true){
            return "X";
        }
        else if ( isInFavorOfO() == true){
          return "O";

            }
        return "";
    }

}
