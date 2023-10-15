import java.util.Scanner;

public class OnTimeForTheExam 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int test_hour = input.nextInt();
        int test_min = input.nextInt();
        int arrival_hour = input.nextInt();
        int arrival_min = input.nextInt();

        test_min += test_hour * 60;
        arrival_min += arrival_hour * 60;

        int diff = test_min - arrival_min;
        int diff_hour = Math.abs(diff) / 60;
        int diff_min = Math.abs(diff) % 60;

        if (diff < 0)
        {
            System.out.println("Late");
            if (diff_hour != 0)
            {
                System.out.printf("%d:%02d hours after the start", diff_hour, diff_min);
            }
            else
            {
                System.out.printf("%02d minutes after the start", diff_min);
            }
        }
        else if (diff > 30)
        {
            System.out.println("Early");
            if (diff_hour != 0)
            {
                System.out.printf("%d:%02d hours before the start", diff_hour, diff_min);
            }
            else
            {
                System.out.printf("%02d minutes before the start", diff_min);
            }
        }
        else
        {
            System.out.println("On time");
            if (diff != 0)
            {
                System.out.printf("%d minutes before the start", diff);
            }
        }
    }
}
