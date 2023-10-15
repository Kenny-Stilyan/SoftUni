package Checks;
import java.util.Scanner;

public class LunchBreak 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String tv_show = input.nextLine();
        int ep = input.nextInt();
        int time_off = input.nextInt();

        double lunch_time = time_off / 8.0;
        double break_time = time_off / 4.0;
        double time_left = time_off - lunch_time - break_time;
        double diff = Math.ceil(ep - time_left);

        if (diff > 0)
        {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tv_show, Math.abs(diff));
        }
        else
        {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tv_show, diff);
        }
    }
}
