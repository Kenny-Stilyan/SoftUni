package Checks;
import java.util.Scanner;

public class GodzillaVsKong 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double budget = input.nextDouble();
        int extras = input.nextInt();
        double clothing = input.nextDouble();

        double decor_price = budget * 0.1;
        double clothing_price = extras * clothing;

        if (extras > 150)
        {
            clothing_price -= clothing_price * 0.1;
        }

        double diff = budget - (decor_price + clothing_price);
        if (diff >= 0)
        {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", diff);
        }
        else
        {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more." , Math.abs(diff));
        }
    }
}
