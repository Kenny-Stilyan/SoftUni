import java.util.Scanner;

public class FishTank 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int length = input.nextInt();
        int width = input.nextInt();
        int height = input.nextInt();
        double percentage = input.nextDouble();

        double size_tank = (length * width * height) / 1000.0;
        double needed_liters = size_tank * (1 - (percentage / 100.0));

        System.out.println(needed_liters);
    }
}
