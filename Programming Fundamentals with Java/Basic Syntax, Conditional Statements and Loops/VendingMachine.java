import java.util.Scanner;

public class VendingMachine 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double money = 0.0;
        boolean buyingProcess = false;

        String[] currency  = {"0.1", "0.2", "0.5", "1", "2"};
        String[] products = {"Nuts", "Water", "Crisps", "Soda", "Coke"};
        double[] productsPrices = {2.0, 0.7, 1.5, 0.8, 1.0};

        while (true)
        {
            String command = input.nextLine();

            if (command.equals("Start"))
            {
                buyingProcess = true;
                command = input.nextLine();
            }
            else if (command.equals("End"))
            {
                break;
            }

            if (!buyingProcess)
            {
                boolean isValidCurrency = false;
                for (int i = 0; i < currency.length; i++)
                {
                    if (command.equals(currency[i]))
                    {
                        money += Double.parseDouble(command);
                        isValidCurrency = true;
                    }
                }

                if (!isValidCurrency)
                {
                    System.out.printf("Cannot accept %s\n", command);
                }
            }
            else
            {
                boolean isValidProduct = false;
                for (int i = 0; i < products.length; i++)
                {
                    if (command.equals(products[i]))
                    {
                        isValidProduct = true;
                        if (money >= productsPrices[i])
                        {
                            money -= productsPrices[i];
                            System.out.printf("Purchased %s\n", products[i]);
                        }
                        else if (money < productsPrices[i])
                        {
                            System.out.println("Sorry, not enough money");
                        }
                        break;
                    }
                }

                if (!isValidProduct)
                    {
                        System.out.println("Invalid product");
                    }
            }
        }

        System.out.printf("Change: %.2f", money);
    }
}
