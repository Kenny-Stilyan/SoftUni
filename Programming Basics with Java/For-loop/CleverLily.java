import java.util.Scanner;

public class CleverLily 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int age = input.nextInt();
        double washing_machine = input.nextDouble();
        int price_per_toy = input.nextInt();

        int toy_count = 0;
        double money = 0;
        double total_sum = 0;
        int brother_count = 0;

        for (int i = 1; i <= age; i++)
        {
            if (i % 2 != 0)
            {
                toy_count += 1;
            }
            else
            {
                brother_count += 1;
                money += 10;
                total_sum += money;
            }
        }

        double result = ((toy_count * price_per_toy) + total_sum) - brother_count;

        double diff = Math.abs(result - washing_machine);
        if (result >= washing_machine)
        {
            System.out.printf("Yes! %.2f", diff);
        }
        else
        {
            System.out.printf("No! %.2f", diff);
        }
    }
}
