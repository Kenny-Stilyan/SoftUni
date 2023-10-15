import java.util.Scanner;

public class FruitShop 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String fruit = input.nextLine();
        String day = input.nextLine();
        double quantity = input.nextDouble();

        double price = 0.0;

        switch (day)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            {
                switch (fruit)
                {
                    case "banana":
                    {
                        price = 2.5;
                        break;
                    }
                    case "apple":
                    {
                        price = 1.2;
                        break;
                    }
                    case "orange":
                    {
                        price = 0.85;
                        break;
                    }
                    case "grapefruit":
                    {
                        price = 1.45;
                        break;
                    }
                    case "kiwi":
                    {
                        price = 2.7;
                        break;
                    }
                    case "pineapple":
                    {
                        price = 5.5;
                        break;
                    }
                    case "grapes":
                    {
                        price = 3.85;
                        break;
                    }
                }
                break;
            }
            case "Saturday":
            case "Sunday":
            {
                switch (fruit)
                {
                    case "banana":
                    {
                        price = 2.7;
                        break;
                    }
                    case "apple":
                    {
                        price = 1.25;
                        break;
                    }
                    case "orange":
                    {
                        price = 0.9;
                        break;
                    }
                    case "grapefruit":
                    {
                        price = 1.6;
                        break;
                    }
                    case "kiwi":
                    {
                        price = 3;
                        break;
                    }
                    case "pineapple":
                    {
                        price = 5.6;
                        break;
                    }
                    case "grapes":
                    {
                        price = 4.2;
                        break;
                    }
                }
                break;
            }
        }

        if(price != 0)
        {
            System.out.printf("%.2f" ,price * quantity);
        }
        else
        {
            System.out.println("error");
        }
    }
}
