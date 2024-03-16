import java.util.Random;
import java.util.Scanner;

public class Craps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll1 = die1 + die2;
        int crapsRoll2 = 0;
        String choice;
        boolean done = false;

        do
        {
            switch (crapsRoll1)
            {
                case 2,3,12 ->
            {
                System.out.println("The value of die 1 is " + die1);
                System.out.println("The value of die 2 is " + die2);
                System.out.print(crapsRoll1);
                System.out.println(" ,Sorry, you lost. ");
            }
                case 7,11 ->
                {
                    System.out.println("The value of die 1 is " + die1);
                    System.out.println("The value of die 2 is " + die2);
                    System.out.print("You got " + crapsRoll1);
                    System.out.println(" ,You won the game");
                }
                case 4, 5, 6, 8, 9, 10 -> {
                    System.out.println("The value of die 1 is " + die1);
                    System.out.println("The value of die 2 is " + die2);
                    System.out.print("You got " + crapsRoll1);
                    System.out.println(" ,You got a point");
                    while (true)
                    {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll2 = die1 + die2;
                        if (crapsRoll1 == crapsRoll2)
                        {
                            System.out.println("The value of die 1 is " + die1);
                            System.out.println("The value of die 2 is " + die2);
                            System.out.print("You got the sum again " + crapsRoll2);
                            System.out.println(" ,Congrats,You won the game");
                            break;
                        }
                        else if (crapsRoll2 == 7)
                        {
                            System.out.println("The value of die 1 is " + die1);
                            System.out.println("The value of die 2 is " + die2);
                            System.out.print("You got " + crapsRoll2);
                            System.out.println(" ,Sorry,You lost!!");
                            break;
                        }
                        else
                        {
                            System.out.println("The value of die 1 is " + die1);
                            System.out.println("The value of die 2 is " + die2);
                            System.out.println("You got " + crapsRoll2);
                        }

                    }
                }


            }
            while (true)
            {
            System.out.print("Wanna play again[Y/N]: ");
            choice = in.nextLine();

                if (choice.equalsIgnoreCase("Y"))
                {
                    break;
                }
                else if (choice.equalsIgnoreCase("N"))
                {
                  done = true;
                  break;
                }
                else
                {
                    System.out.println("Please enter a valid input!!");
                }

            }

        } while (!done);
    }
}