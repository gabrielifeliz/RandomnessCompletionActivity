package com.company;

/*  DiceRoller.java
    Complete the following program
    so that it creates a random die roll (random numbers from 1 to 6).
 */

// Complete import statement with 'util.Random;' to import Random class successfully
import java.util.Random;

public class DiceRoller
{
    public static void main( String[] args )
    {
        /* Change variable format to camel case in all occasions in this program
            due to Java naming conventions
        */
        int dieNumber;
        // Create Random object with new keyword and default constructor
        Random rnd = new Random();

        // Assign random number between 1 to 6 to die roll
        dieNumber = 1 + rnd.nextInt(6);

        // Display die roll
        System.out.println("Your die roll was: " + dieNumber);
    }
}