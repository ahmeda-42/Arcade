//libraries
import java.lang.*;
import java.util.*;

//main
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean arcade = true;

        System.out.println("\nWelcome to the Ahmed's & Adrian's Arcade!");
        while (arcade)
        {
            System.out.println("What would you like to play?");
            System.out.println("1) Minecraft 2.0 (our most popular game!)");
            System.out.println("2) Rock, Paper, Scissors");
            System.out.println("3) Black Jacks");
            System.out.println("4) Hang Man");
            System.out.println("5) Math Quiz");
            System.out.println("6) Leave the arcade");
            int x = scan.nextInt();
            if (x == 1)
            {
                minecraft m = new minecraft();
                m.runMinecraft();
            }
            else if (x == 2)
            {
                rps r = new rps();
                r.runRPS();
            }
            else if (x == 3)
            {
                System.out.println("This game is still a work-in-porgress");
            }
            else if (x == 4)
            {
                hangman h = new hangman();
                h.runHangMan();
            }
            else if (x == 5)
            {
                math m = new math();
                m.runMath();
            }
            else if (x == 6)
            {
                System.out.println("Hope you had fun! See you next time :)");
                System.exit(0);
            }
            else
            {
                System.out.println(x+" is not an option. Please try again.");
            }
        }
    }
}
