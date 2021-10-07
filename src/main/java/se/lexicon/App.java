package se.lexicon;

/**
 * Guessing Game
 * @author Erik Svensson
 *
 */
public class App 
{
    public static final String GREETING = "Welcome to the guessing game!\n1. Play\nQ. Quit";
    public static final String GOOD_BYE = "Good bye!";

    public static void main( String[] args ) {
        boolean isRunning = true;
        do{
            String answer = UserInputUtil.getStringFromUser(GREETING);
            switch(answer){
                case "1":
                    GuessingGame.play();
                    break;
                case "Q":
                case "q":
                    isRunning = false;
                    break;
                default:
                    System.out.println("Unrecognized input " + answer);
            }
        }while(isRunning);
        System.out.println(GOOD_BYE);
    }
}
