package Checks;
import java.util.Scanner;

public class SpeedInfo 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double speed = input.nextDouble();
        if (speed <= 10)
        {
            System.out.println("slow");
        }
        else if (speed <= 50)
        {
            System.out.println("average");
        }
        else if (speed <= 150)
        {
            System.out.println("fast");
        }
        else if (speed <= 1000)
        {
            System.out.println("ultra fast");
        }
        else
        {
            System.out.println("extremely fast");
        }
    }
}
