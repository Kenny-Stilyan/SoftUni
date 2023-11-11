import java.util.Scanner;

public class BackIn30Minutes 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int hour = Integer.parseInt(input.nextLine());
        int min = Integer.parseInt(input.nextLine());

        min += 30;

        if (min >= 60)
        {
            min -= 60;
            hour += 1;
        }

        if (hour >= 24)
        {
            hour -= 24;
        }

        System.out.printf("%d:%02d", hour, min);
    }
}
