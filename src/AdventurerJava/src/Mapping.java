import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Mapping {

    public static final int INITIAL_LOCATION = 95;

    /**
     * TODO
     * create a static LocationMap object
     */
    static Mapping LocationMap = new Mapping();

    /**
     * TODO
     * create a vocabulary HashMap to store all directions a user can go
     */
    HashMap<String, String> vocabulary = new HashMap<String, String>();
    /**
     * TODO
     * create a FileLogger object
     */
    FileLogger fileLogger = new FileLogger();

    /**
     * TODO
     * create a ConsoleLogger object
     */
    ConsoleLogger consoleLogger = new ConsoleLogger();


    public Mapping() {
        //vocabulary.put("QUIT", "Q"); //example
        /** TODO
         * complete the vocabulary HashMap <Key, Value> with all directions.
         * use the directions.txt file and crosscheck with the ExpectedInput and ExpectedOutput files to find the keys and the values
         */
        vocabulary.put("NORTH", "N");
        vocabulary.put("SOUTH", "S");
        vocabulary.put("EAST", "E");
        vocabulary.put("WEST", "W");
        vocabulary.put("DOWN", "D");
        vocabulary.put("UP", "U");
        vocabulary.put("NORTHEAST", "NE");
        vocabulary.put("SOUTHEAST", "SE");
        vocabulary.put("NORTHWEST", "NW");
        vocabulary.put("SOUTHWEST", "SW");
        vocabulary.put("QUIT", "Q");

    }

    public void mapping() {

        /** TODO
         * create a Scanner object
         */
        Scanner object = new Scanner(System.in);

        /**
         * initialise a location variable with the INITIAL_LOCATION
         */

        while (true) {

            /** TODO
             * get the location and print its description to both console and file
             * use the FileLogger and ConsoleLogger objects
             */

            /** TODO
             * verify if the location is exit
             */

            /** TODO
             * get a map of the exits for the location
             */

            /** TODO
             * print the available exits (to both console and file)
             * crosscheck with the ExpectedOutput files
             * Hint: you can use a StringBuilder to append the exits
             */

            /** TODO
             * input a direction
             * ensure that the input is converted to uppercase
             */

            /** TODO
             * are we dealing with a letter / word for the direction to go to?
             * available inputs are: a letter(the HashMap value), a word (the HashMap key), a string of words that contains the key
             * crosscheck with the ExpectedInput and ExpectedOutput files for examples of inputs
             * if the input contains multiple words, extract each word
             * find the direction to go to using the vocabulary mapping
             * if multiple viable directions are specified in the input, choose the last one
             */

            /** TODO
             * if user can go in that direction, then set the location to that direction
             * otherwise print an error message (to both console and file)
             * check the ExpectedOutput files
             */
        }
    }

    public static void main(String[] args) {
        /**TODO
         * run the program from here
         * create a Mapping object
         * start the game
         */
    }

}
