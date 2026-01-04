import java.lang.*;
import java.util.*;

public class hangman {
    public hangman() {}

    public void runHangMan()
    {
        Scanner scan = new Scanner(System.in);
        int guesses = 8;
        System.out.println("\nWelcome to Hang Man!\n");

        //UPERCASE ONLY!!!!
        String[] wordsList = {"ROCK", "PAPER", "SCISSORS"};
        int x = (int) (Math.random() * wordsList.length);

        ArrayList<String> word = new ArrayList<String>();
        for (int i = 0; i < wordsList[x].length(); i++)
        {
            word.add("_");
        }

        while (guesses > 0)
        {
            System.out.println("You have "+guesses+" guesses left.");
            System.out.print("Word: ");
            for (int i = 0; i < word.size(); i++)
            {
                System.out.print(" " + word.get(i));
            }
            System.out.println("\nWhat letter would you like to guess?");
            String guess = scan.nextLine();
            if (guess.length() == 1)
            {
                guess = guess.toUpperCase();
                int count = 0;
                for (int i = 0; i < wordsList[x].length(); i++)
                {
                    if (guess.equals(wordsList[x].substring(i, i+1)))
                    {
                        word.set(i, guess);
                        count++;
                    }
                }
                if (count == 0)
                {
                    guesses--;
                    System.out.println(guess+" is not a letter in the word :(");
                }
                else
                {
                    System.out.println("You got "+count+" letter(s)!");
                }
                int w = 0;
                for (int i = 0; i < word.size(); i++)
                {
                    if (word.get(i).equals("_"))
                    {
                        w++;
                    }
                }
                if (w == 0)
                {
                    System.out.println("You won! :D");
                    break;
                }
                if (guesses == 0)
                {
                    System.out.println("You have no more guesses. You lost :((");
                    break;
                }
            }
            else
            {
                System.out.println("That is not a valid input. Please try again.");
            }
        }

        System.out.println("Hope you had fun playing this game!\n\n");
    }
}
