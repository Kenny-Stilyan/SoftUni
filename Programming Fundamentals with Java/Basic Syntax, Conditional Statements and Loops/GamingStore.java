import java.util.Scanner;

public class GamingStore 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        String[] gameList = {"OutFall 4", "CS: OG", "Zplinter Zell", "Honored 2", "RoverWatch", "RoverWatch Origins Edition"};
        double[] gamePrices = {39.99, 15.99, 19.99, 59.99, 29.99, 39.99};

        double budget = Double.parseDouble(input.nextLine());
        double totalSpent = 0.0;
        while (true)
        {
            String command =input.nextLine();

            if (command.equals("Game Time"))
            {
                System.out.printf("Total spent: $%.2f. Remaining: $%.2f", totalSpent, budget);
                break;
            }

            boolean isValidGame = false;
            for (int i = 0; i < gameList.length; i++)
            {
                if (command.equals(gameList[i]))
                {
                    isValidGame = true;
                    if (budget >= gamePrices[i])
                    {
                        budget -= gamePrices[i];
                        totalSpent += gamePrices[i];
                        System.out.printf("Bought %s\n", command);
                    }
                    else if (budget < gamePrices[i])
                    {
                        System.out.println("Too Expensive");
                    }
                }

            }
            if (budget <= 0)
            {
                System.out.println("Out of money!");
                break;
            }
            if (!isValidGame)
            {
                System.out.println("Not Found");
            }
        }
    }
}
