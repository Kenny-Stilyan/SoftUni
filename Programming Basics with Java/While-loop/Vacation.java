import java.util.Scanner;

public class Vacation 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double money_goal = Double.parseDouble(input.nextLine());
        double balance = Double.parseDouble(input.nextLine());

        int days_count = 0;
        int consistently_spend_days_counter = 0;

        while (input.hasNextLine())
        {
            days_count += 1;
            String command = input.nextLine();
            if (!input.hasNextLine()) 
            {
                break;
            }

            double money = Double.parseDouble(input.nextLine());

            if (command.equals("spend"))
            {
                consistently_spend_days_counter += 1;
            }
            else
            {
                consistently_spend_days_counter = 0;
            }

            if (command.equals("spend"))
            {
                balance -= money;
                if (balance < 0)
                {
                    balance = 0;
                }

                if (consistently_spend_days_counter == 5)
                {
                    System.out.println("You can't save the money.");
                    System.out.println(consistently_spend_days_counter);
                    break;
                }
            }
            else if (command.equals("save"))
            {
                balance += money;
                if (balance >= money_goal)
                {
                    System.out.printf("You saved the money for %d days.", days_count);
                    break;
                }
            }
        }
    }
}