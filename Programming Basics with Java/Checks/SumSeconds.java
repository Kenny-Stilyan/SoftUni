package Checks;
import java.util.Scanner;

public class SumSeconds 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        int total_time = first + second + third;
        int min = total_time / 60;
        int sec = total_time % 60;

        if (sec <= 9)
        {
            System.out.printf("%d:0%d", min, sec);
        }
        else
        {
            System.out.printf("%d:%d", min, sec);
        }
    }
}
