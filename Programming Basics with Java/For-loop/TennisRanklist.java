import java.util.Scanner;

public class TennisRanklist 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        int starting_points = Integer.parseInt(input.nextLine());

        int points = 0;
        int w_count = 0;

        for (int i = 0; i < n; i++)
        {
            String text = input.nextLine();

            if (text.equals("W"))
            {
                points += 2000;
                w_count += 1;
            }
            else if (text.equals("F"))
            {
                points += 1200;
            }
            else if (text.equals("SF"))
            {
                points += 720;
            }
        }

        System.out.printf("Final points: %d\n", points + starting_points);
        System.out.printf("Average points: %d \n", points / n);
        System.out.printf("%.2f%%", (double) w_count / n * 100);
    }
}
