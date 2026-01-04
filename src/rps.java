import java.lang.*;
import java.util.*;

public class rps {
    public rps() {}

    public void runRPS()
    {
        Scanner scan = new Scanner(System.in);
        boolean playAgain = true;
        System.out.println("\nWelcome to Rock, Paper, Scissors!\n");

        while (playAgain)
        {
            String[] choices = {"Rock", "Paper", "Scissors"};
            int x = (int) (Math.random() * choices.length);

            System.out.println("Which of the following would you like to chose?");
            System.out.println("1) Rock");
            System.out.println("2) Paper");
            System.out.println("3) Scissors");
            System.out.println("4) Quit");
            int y = scan.nextInt();
            //Rock
            if (y == 1)
            {
                System.out.println("Computer: "+choices[x]);
                //Rock
                if (x == 0)
                {
                    System.out.println("It was a tie!");
                }
                //Paper
                if (x == 1)
                {
                    System.out.println("The computer won!");
                }
                //Scissors
                if (x == 2)
                {
                    System.out.println("You won!");
                }
            }
            //Paper
            else if (y == 2)
            {
                System.out.println("Computer: "+choices[x]);
                //Rock
                if (x == 0)
                {
                    System.out.println("You won!");
                }
                //Paper
                if (x == 1)
                {
                    System.out.println("It was a tie!");
                }
                //Scissors
                if (x == 2)
                {
                    System.out.println("The computer won!");
                }
            }
            //Scissors
            else if (y == 3)
            {
                System.out.println("Computer: "+choices[x]);
                //Rock
                if (x == 0)
                {
                    System.out.println("The computer won!");
                }
                //Paper
                if (x == 1)
                {
                    System.out.println("You won!");
                }
                //Scissors
                if (x == 2)
                {
                    System.out.println("It was a tie!");
                }
            }
            else if (y == 4)
            {
                break;
            }
            else
            {
                System.out.println(y+" is not an option. Please try again.");
            }
        }

        System.out.println("Hope you had fun playing this game!\n\n");
    }
}
