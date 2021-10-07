package se.lexicon;

import java.util.concurrent.ThreadLocalRandom;

public class GuessingGame {

    public static void play() {
        int maxTries = 10;
        //Generate random number
        int theNumber = ThreadLocalRandom.current().nextInt(1, 101);

        for(int i = 1; i<=maxTries; i++){
            //Prompt for guess
            //Take input from user
            int guess = UserInputUtil.getIntFromUser("Try " + i + " of " + maxTries);
            //Evaluate
            String result = evaluateGuess(guess, theNumber);
            System.out.println(result);
            if(result.startsWith("You guessed the number!")){
                break;
            }
        }
    }

    public static String evaluateGuess(int guess, int theNumber){
        if(guess == theNumber){
            return "You guessed the number! It was " + theNumber;
        }
        if(guess < theNumber){
            return "Go higher!";
        }
        return "Go lower!";
    }
}
