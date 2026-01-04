import java.lang.*;
import java.util.*;

public class minecraft {
    public minecraft() {}

    public void runMinecraft()
    {
        Scanner scan = new Scanner(System.in);
        String enderDragon = "alive";
        Player p = new Player(0);
        System.out.println("\nWelcome to Minecraft 2.0!\n");

        //spawn
        String[] biomeList = {"jungle", "spruce", "forest", "snow", "desert", "mountain", "swamp", "beach", "savannah"};
        int x = (int) (Math.random() * biomeList.length);
        System.out.println("You spawned in a "+biomeList[x]+" biome");

        while (enderDragon.equals("alive"))
        {
            p.listOptions();
            int answer = scan.nextInt();
            p.pickChoice(answer);
            //chance of finding a mob 1/3
            int random = (int) (Math.random()*3);
            if (random == 0 && p.getDimension().equals("overworld"))
            {
                int mob = (int) (Math.random()*15);
                //System.out.println(mob);
                //sheep
                if (mob == 0 || mob == 13)
                {
                    p.foundAnimal("sheep");
                }
                //pig
                if (mob == 1 || mob == 12)
                {
                    p.foundAnimal("pig");
                }
                //cow
                if (mob == 2 || mob == 11)
                {
                    p.foundAnimal("cow");
                }
                //chicken
                if (mob == 3 || mob == 10)
                {
                    p.foundAnimal("chicken");
                }
                //enderman
                if (mob == 4 || mob == 9 || mob == 14)
                {
                    p.foundEnemy("enderman", 4.5);
                }
                //zombie
                if (mob == 5)
                {
                    p.foundEnemy("zombie", 2.5);
                }
                //creeper
                if (mob == 6)
                {
                    p.foundEnemy("creeper", 0);
                }
                //skeleton
                if (mob == 7)
                {
                    p.foundEnemy("skeleton", 2.5);
                }
                //spider
                if (mob == 8)
                {
                    p.foundEnemy("spider", 2);
                }
            }
            //check if ender dragon still alive
            enderDragon = p.getDragonStatus();
        }

        System.out.println("Hope you had fun playing this game!\n\n");
    }
}
