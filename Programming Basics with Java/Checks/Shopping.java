package Checks;
import java.util.Scanner;

public class Shopping 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double budget = input.nextDouble();
        int gpu = input.nextInt();
        int cpu = input.nextInt();
        int ram = input.nextInt();

        double gpu_price = gpu * 250;
        double cpu_price = cpu * (gpu_price * 0.35);
        double ram_price = ram * (gpu_price * 0.10);

        double total_price = gpu_price + cpu_price + ram_price;
        if (gpu > cpu)
        {
            total_price -= total_price * 0.15;
        }

        double diff = budget - total_price;
        if (budget < total_price)
        {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(diff));
        }
        else
        {
            System.out.printf("You have %.2f leva left!", diff);
        }
    }
}
