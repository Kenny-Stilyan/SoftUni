package Checks;

import java.util.Scanner;

public class ToyShop 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double price_vacation = input.nextDouble();
        int puzzle = input.nextInt();
        int dolls = input.nextInt();
        int teddy_bear = input.nextInt();
        int minion = input.nextInt();
        int truck = input.nextInt();

        int toy_count = puzzle + dolls + teddy_bear + minion + truck;
        double total_price = (puzzle * 2.6) + (dolls * 3) + (teddy_bear * 4.1) + (minion * 8.2) + (truck * 2);

        if (toy_count >= 50)
        {
            total_price -= total_price * 0.25;
        }

        total_price -= total_price * 0.1;

        double diff = total_price - price_vacation;
        if (diff >= 0)
        {
            System.out.printf("Yes! %.2f lv left.", diff);
        }
        else
        {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(diff));
        }
    }
}
