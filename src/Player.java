import java.lang.*;
import java.util.*;

public class Player {
    private double hp = 10.0;
    private double attack = 1.0;
    private int lvl;
    private int food = 0;
    private String portal = "no";
    private String nether = "no";
    private String end = "no";
    private String dragon = "alive";
    private String crafting = "no";
    private String sword = "none";
    private String pickaxe = "none";
    private int wood = 0;
    private int stone = 0;
    private int iron = 0;
    private int diamonds = 0;
    private int obsidian = 0;
    private int blaze = 0;
    private int pearls = 0;
    private int eyes = 0;
    private ArrayList<String> options = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public Player(int l){
        lvl = l;
    }

    public String getDimension(){
        if (nether.equals("yes"))
        {
            return "nether";
        }
        else if (end.equals("yes"))
        {
            return "end";
        }
        else
        {
            return "overworld";
        }
    }

    public void listOptions(){
        System.out.println("What would you like to do now?");


        options.add("Check inventory");

        options.add("Eat food");

        if (nether.equals("no") && end.equals("no"))
        {
            options.add("Mine some wood");
        }

        if (wood > 4 && crafting.equals("no"))
        {
            options.add("Make crafting table");
        }
        if (crafting.equals("yes"))
        {
            options.add("Use crafting table");
        }

        if (!pickaxe.equals("none") && nether.equals("no") && end.equals("no"))
        {
            options.add("Mine in a cave");
        }

        if (obsidian >= 10 && portal.equals("no"))
        {
            options.add("Make nether portal");
        }
        if (portal.equals("yes") && nether.equals("no") && end.equals("no"))
        {
            options.add("Go to nether");
        }
        if (nether.equals("yes"))
        {
            options.add("Kill blaze");
            options.add("Go back home");
        }
        if (eyes >= 12 && nether.equals("no") && end.equals("no"))
        {
            options.add("Go to end");
        }
        if (end.equals("yes"))
        {
            options.add("Fight the ender dragon :D");
        }


        for (int i = 0; i < options.size(); i++)
        {
            System.out.println((i+1)+") "+options.get(i));
        }
    }


    public void pickChoice(int a)
    {
        String answer = "";
        if (a > options.size() || a < 1)
        {
            System.out.println(a+" is not an option. Try again");
        }
        else
        {
            answer = options.get(a-1);
        }


        if (answer.equals("Check inventory"))
        {
            System.out.println("You have");
            System.out.println("HP: "+hp+"/10.0");
            System.out.println("Food: "+food);
            System.out.println("Sword: "+sword);
            System.out.println("Pick-axe: "+pickaxe);
            //System.out.println("Crafting Table: "+crafting);
            System.out.println("Wood: "+wood);
            System.out.println("Stone: "+stone);
            System.out.println("Iron: "+iron);
            System.out.println("Diamonds: "+diamonds);
            System.out.println("Obsidian: "+obsidian);
            System.out.println("Blaze Powder: "+blaze);
            System.out.println("Ender Pearls: "+pearls);
            System.out.println("Eyes of Ender: "+eyes);
        }

        if (answer.equals("Eat food"))
        {
            eatFood();
        }

        if (answer.equals("Mine some wood"))
        {
            //5-10 wood planks
            int w = (int) (Math.random()*6 + 5);
            System.out.println("You got "+w+" wood planks");
            wood += w;
        }

        if (answer.equals("Make crafting table"))
        {
            System.out.println("You made a crafting table");
            crafting = "yes";
            wood -= 4;
        }

        if (answer.equals("Use crafting table"))
        {
            System.out.println("What would you like to craft?");
            System.out.println("1) craft wood sword");
            System.out.println("2) craft stone sword");
            System.out.println("3) craft iron sword");
            System.out.println("4) craft diamond sword");
            System.out.println("5) craft wood pick-axe");
            System.out.println("6) craft stone pick-axe");
            System.out.println("7) craft iron pick-axe");
            System.out.println("8) craft diamond pick-axe");
            System.out.println("9) craft 12 eyes of ender");
            System.out.println("10) exit crafting table");

            int x = scan.nextInt();
            if (x == 1)
            {
                if (wood >= 3)
                {
                    wood -= 3;
                    System.out.println("You made a wood sword!");
                    sword = "wood";
                    attack = 2;
                }
                else
                {
                    System.out.println("You can't craft this right now");
                }
            }
            if (x == 2)
            {
                if (wood >= 1 && stone >= 2)
                {
                    wood -= 1;
                    stone -= 2;
                    System.out.println("You made a stone sword!");
                    sword = "stone";
                    attack = 3;
                }
                else
                {
                    System.out.println("You can't craft this right now");
                }
            }
            if (x == 3)
            {
                if (wood >= 1 && iron >= 2)
                {
                    wood -= 1;
                    iron -= 2;
                    System.out.println("You made a iron sword!");
                    sword = "iron";
                    attack = 4;
                }
                else
                {
                    System.out.println("You can't craft this right now");
                }
            }
            if (x == 4)
            {
                if (wood >= 1 && diamonds >= 2)
                {
                    wood -= 1;
                    diamonds -= 2;
                    System.out.println("You made a diamond sword!");
                    sword = "diamond";
                    attack = 5;
                }
                else
                {
                    System.out.println("You can't craft this right now");
                }
            }
            if (x == 5)
            {
                if (wood >= 5)
                {
                    wood -= 5;
                    System.out.println("You made a wood pick-axe!");
                    pickaxe = "wood";
                }
                else
                {
                    System.out.println("You can't craft this right now");
                }
            }
            if (x == 6)
            {
                if (wood >= 2 && stone >= 3)
                {
                    wood -= 2;
                    stone -= 3;
                    System.out.println("You made a stone pick-axe!");
                    pickaxe = "stone";
                }
                else
                {
                    System.out.println("You can't craft this right now");
                }
            }
            if (x == 7)
            {
                if (wood >= 2 && iron >= 3)
                {
                    wood -= 2;
                    iron -= 3;
                    System.out.println("You made a iron pick-axe!");
                    pickaxe = "iron";
                }
                else
                {
                    System.out.println("You can't craft this right now");
                }
            }
            if (x == 8)
            {
                if (wood >= 2 && diamonds >= 3)
                {
                    wood -= 2;
                    diamonds -= 3;
                    System.out.println("You made a diamond pick-axe!");
                    pickaxe = "diamond";
                }
                else
                {
                    System.out.println("You can't craft this right now");
                }
            }
            if (x == 9)
            {
                if (blaze >= 12 && pearls >= 12)
                {
                    blaze -= 12;
                    pearls -= 12;
                    System.out.println("You made 12 eyes of ender!");
                    eyes += 12;
                }
                else
                {
                    System.out.println("You can't craft this right now");
                }
            }
            if (x == 10)
            {
                System.out.println("You exited the crafting table");
            }
            if (x > 10 || x < 1)
            {
                System.out.println(x+" is not an option. You exited the crafting table");
            }
        }

        if (answer.equals("Mine in a cave"))
        {
            if (pickaxe.equals("wood"))
            {
                //5-10 stone
                int s = (int) (Math.random()*6 + 5);
                System.out.println("You got "+s+" pieces of stone");
                stone += s;
            }
            if (pickaxe.equals("stone"))
            {
                //5-10 stone
                int s = (int) (Math.random()*6 + 5);
                //3-6 iron
                int i = (int) (Math.random()*4 + 3);
                System.out.println("You got "+s+" pieces of stone and "+i+" pieces of iron");
                stone += s;
                iron += i;
            }
            if (pickaxe.equals("iron"))
            {
                //5-10 stone
                int s = (int) (Math.random()*6 + 5);
                //3-6 iron
                int i = (int) (Math.random()*4 + 3);
                //0-1 diamonds
                int d = (int) (Math.random()*2);
                System.out.println("You got "+s+" pieces of stone, "+i+" pieces of iron, and "+d+" diamond");
                stone += s;
                iron += i;
                diamonds += d;
            }
            if (pickaxe.equals("diamond"))
            {
                //5-10 stone
                int s = (int) (Math.random()*6 + 5);
                //3-6 iron
                int i = (int) (Math.random()*4 + 3);
                //0-1 diamonds
                int d = (int) (Math.random()*2);
                //3-6 obsidian
                int o = (int) (Math.random()*4 + 3);
                System.out.println("You got "+s+" pieces of stone, "+i+" pieces of iron, "+d+" diamond, and "+o+" pieces of obsidian");
                stone += s;
                iron += i;
                diamonds += d;
                obsidian += o;
            }
        }

        if (answer.equals("Make nether portal"))
        {
            System.out.println("You made a nether portal!");
            portal = "yes";
            obsidian -= 10;
        }

        if (answer.equals("Go to nether"))
        {
            System.out.println("You went to the nether!!");
            nether = "yes";
        }

        if (answer.equals("Kill blaze"))
        {
            foundEnemy("blaze", 5);
        }

        if (answer.equals("Go back home"))
        {
            System.out.println("You went back home");
            nether = "no";
        }

        if (answer.equals("Go to end"))
        {
            System.out.println("You are now in the end!");
            end = "yes";
        }

        if (answer.equals("Fight the ender dragon :D"))
        {
            fightEnderDragon();
        }


        options.clear();
    }

    public void foundAnimal(String animal)
    {
        System.out.println("You found a "+animal+"! What would you like to do?");
        System.out.println("1) Kill the "+animal);
        System.out.println("2) Ignore it");
        int x = scan.nextInt();
        if (x == 1)
        {
            int chance;
            if (sword.equals("none"))
            {
                chance = 1;
            }
            else if (sword.equals("wood"))
            {
                chance = (int) (Math.random()*4);
            }
            else if (sword.equals("stone"))
            {
                chance = (int) (Math.random()*2);
            }
            else
            {
                chance = 0;
            }
            if (chance == 0)
            {
                //1-4 pieces of food
                int f = (int) (Math.random()*4 + 1);
                System.out.println("You got "+f+" piece(s) of food!");
                food += f;
            }
            else
            {
                System.out.println("The "+animal+" ran away :(");
            }
        }
        if (x < 1 || x > 2)
        {
            System.out.println(x+" is not an option. The "+animal+" ran away");
        }
    }

    public void foundEnemy(String enemy, double damage)
    {
        System.out.print("You found a "+enemy+"! ");
        if (enemy.equals("enderman"))
        {
            System.out.println("What would you like to do");
            System.out.println("1) Look at its eyes");
            System.out.println("2) Run away");
            int x = scan.nextInt();
            if (x == 1)
            {
                hp -= damage;
                System.out.println("The "+enemy+" attacked you. You lost "+damage+" hp. You now have "+hp+"/10.0 hp");
                fightEnemy(enemy, damage);
            }
            else if (x == 2)
            {
                System.out.println("You ran away");
            }
            else
            {
                System.out.println(x+" is not an option. You ran away");
            }
        }
        else
        {
            fightEnemy(enemy, damage);
        }
    }
    public void fightEnemy(String enemy, double dam)
    {
        double damage = dam;
        double enemyhp = 10.0;
        while (enemyhp > 0.0)
        {
            if (enemy.equals("creeper"))
            {
                //chance of creeper damage 1/5
                int d = (int) (Math.random()*5);
                if (d == 0)
                {
                    damage = 9.5;
                }
            }
            System.out.println("What would you like to do");
            System.out.println("1) Attack the "+enemy);
            System.out.println("2) Eat food");
            System.out.println("3) Run away");
            int x = scan.nextInt();
            if (x == 1)
            {
                enemyhp -= attack;
                if (enemyhp <= 0.0)
                {
                    System.out.println("The "+enemy+" lost "+attack+" hp.");
                }
                else
                {
                    System.out.println("The "+enemy+" lost "+attack+" hp. It now has "+enemyhp+"/10.0 hp. ");
                    hp -= damage;
                    System.out.println("The "+enemy+" attacked you. You lost "+damage+" hp. ");
                    if (hp > 0.0)
                    {
                        System.out.println("You now have "+hp+"/10.0 hp");
                    }
                    else
                    {
                        System.out.println("You died :(");
                        //System.exit(0);
                        enemyhp = -1.11;
                        dragon = "game over";
                        break;
                    }
                }
            }
            else if (x == 2)
            {
                eatFood();
            }
            else
            {
                if (x != 3)
                {
                    System.out.print(x+" is not an option. ");
                }
                int y = (int) (Math.random()*2);
                if (y == 0)
                {
                    System.out.println("You ran away");
                    enemyhp = -1.11;
                }
                else
                {
                    hp -= damage;
                    System.out.println("You tried to run away but the "+enemy+" attacked you. You lost "+damage+" hp. ");
                    if (hp > 0)
                    {
                        System.out.println("You now have "+hp+"/10.0 hp");
                    }
                    else
                    {
                        System.out.println("You died :(");
                        //System.exit(0);
                        enemyhp = -1.11;
                        dragon = "game over";
                        break;
                    }
                }
            }
        }
        if (enemyhp != -1.11)
        {
            System.out.println("The "+enemy+" died");
            if (enemy.equals("enderman"))
            {
                //pearls 0-4
                int p = (int) (Math.random()*5);
                System.out.println("You got "+p+" ender pearl(s)");
                pearls += p;
            }
            else if (enemy.equals("blaze"))
            {
                //blaze power 0-4
                int b = (int) (Math.random()*5);
                System.out.println("You got "+b+" blaze powder(s)");
                blaze += b;
            }
        }
    }

    public void eatFood()
    {
        if (food <= 0)
        {
            System.out.println("You have no food :(");
        }
        else
        {
            //+hp 2-4
            int f = (int) (Math.random()*3+2);
            hp += f;
            if (hp > 10)
            {
                hp = 10;
            }
            System.out.println("You ate some food. You got "+f+" hp! You now have "+hp+"/10.0 hp");
            food--;
        }
    }

    public void fightEnderDragon()
    {
        double health = 100.0;
        System.out.println("The Ender Dragon is right in front of you.");
        while (health > 0.0)
        {
            double damage = 0.5*((int) (Math.random()*9)) + 3.5;
            System.out.println("What would you like to do");
            System.out.println("1) Attack the Ender Dragon");
            System.out.println("2) Eat food");
            int x = scan.nextInt();
            if (x == 2)
            {
                eatFood();
            }
            else
            {
                if (x == 1)
                {
                    //attack the dragon
                    health -= attack;
                    if (health <= 0.0)
                    {
                        System.out.println("The Ender Dragon lost "+attack+" hp.");
                        System.out.println("Congrats! You killed the Ender Dragon and beat the game!!! :D");
                        dragon = "dead";
                        break;
                    }
                    else
                    {
                        System.out.println("The Ender Dragon lost "+attack+" hp. It now has "+health+"/100.0 hp. ");
                    }
                }
                else
                {
                    System.out.println(x+" is not an option");
                }
                //dragon attacks you
                if (health > 0)
                {
                    System.out.println("The Ender Dragon attacked you. You lost "+damage+" hp. ");
                    hp -= damage;
                    if (hp > 0.0)
                    {
                        System.out.println("You now have "+hp+"/10.0 hp");
                    }
                    else
                    {
                        System.out.println("You died :(");
                        //System.exit(0);
                        dragon = "game over";
                        break;
                    }
                }
            }
        }
    }

    public String getDragonStatus()
    {
        return dragon;
    }
}