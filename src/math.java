import java.lang.*;
import java.util.*;

public class math {
    public math() {}

    public void runMath()
    {
        Scanner scan = new Scanner(System.in);
        boolean playAgain = true;
        System.out.println("\nWelcome to Math Quiz!\n");

        while (playAgain)
        {
            System.out.println("What would you like to do?");
            System.out.println("1) Addition");
            System.out.println("2) Substration");
            System.out.println("3) Multiplication");
            System.out.println("4) Division");
            System.out.println("5) Quit");
            int choice = scan.nextInt();

            if (choice == 1)
            {
                int x = (int) (Math.random()*100);
                int y = (int) (Math.random()*100);
                int z = x+y;
                System.out.println("What is "+x+" + "+y+"?");
                int answer = scan.nextInt();
                if (answer == z)
                {
                    System.out.println("Great job!");
                }
                else
                {
                    System.out.println("Wrong. The answer was "+z);
                }
            }
            else if (choice == 2)
            {
                int x = (int) (Math.random()*100);
                int y = (int) (Math.random()*100);
                int z = x-y;
                System.out.println("What is "+x+" - "+y+"?");
                int answer = scan.nextInt();
                if (answer == z)
                {
                    System.out.println("Great job!");
                }
                else
                {
                    System.out.println("Wrong. The answer was "+z);
                }
            }
            else if (choice == 3)
            {
                int x = (int) (Math.random()*100);
                int y = (int) (Math.random()*100);
                int z = x*y;
                System.out.println("What is "+x+" * "+y+"?");
                int answer = scan.nextInt();
                if (answer == z)
                {
                    System.out.println("Great job!");
                }
                else
                {
                    System.out.println("Wrong. The answer was "+z);
                }
            }
            else if (choice == 4)
            {
                int x = (int) (Math.random()*100);
                int y = (int) (Math.random()*100);
                int z;
                if (x >= y)
                {
                    z = (int) Math.round((1.0*y)/(1.0*x));
                    System.out.println("What is "+x+" / "+y+"? Round to the closest integer value");
                }
                else
                {
                    z = (int) Math.round((1.0*y)/(1.0*x));
                    System.out.println("What is "+y+" / "+x+"? Round to the closest integer value");
                }
                int answer = scan.nextInt();
                if (answer == z)
                {
                    System.out.println("Great job!");
                }
                else
                {
                    System.out.println("Wrong. The answer was "+z);
                }
            }
            else if (choice == 5)
            {
                break;
            }
            else
            {
                System.out.println(choice+" is not an option. Please try again.");
            }
        }

        System.out.println("Hope you had fun playing this game!\n\n");
    }
}
