import java.util.Scanner;

public class DayOfWeek 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String[] days =  {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int n = Integer.parseInt(input.nextLine());
        if (n <= 0 || n > 7)
        {
            System.out.println("Invalid day!");
        }
        else
        {
            System.out.println(days[n - 1]);
        }
    }
}
