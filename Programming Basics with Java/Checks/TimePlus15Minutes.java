package Checks;
import java.util.Scanner;

public class TimePlus15Minutes 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int hour = input.nextInt();
        int min = input.nextInt() + 15;

        if (min >= 60)
        {
            hour += 1;
            min -= 60;
        }

        if (hour >= 24)
        {
            hour -= 24;
        }

        if (min <= 9)
        {
            System.out.printf("%d:0%d", hour, min);
        }
        else
        {
            System.out.printf("%d:%d", hour, min);
        }
    }
}
