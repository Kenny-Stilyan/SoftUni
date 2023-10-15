import java.util.Scanner;

public class AccountBalance 
{
    public static void main(String[] args) 
    {
         Scanner input = new Scanner(System.in);

         double balance = 0.0;

         while (true)
         {
            String command = input.nextLine();

            if (command.equals("NoMoreMoney"))
            {
                break;
            }

            double money = Double.parseDouble(command);
            if (money <= 0)
            {
                System.out.println("Invalid operation!");
                break;
            }
            else
            {
                balance += money;
                System.out.printf("Increase: %.2f\n", money);
            }
         }

        System.out.printf("Total: %.2f", balance);
    }
}
