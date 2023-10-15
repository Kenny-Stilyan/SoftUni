import java.util.Scanner;

public class WorkingHours 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int hour = Integer.parseInt(input.nextLine());
        String day = input.nextLine();
        String parameter = "";

        if (10 <= hour && hour <= 18)
        {
            switch (day)
            {
                case "Monday":
                case "Tuesday":
                case "Wednesday":
                case "Thursday":
                case "Friday":
                case "Saturday":
                {
                    parameter = "open";
                    break;
                }
                case "Sunday":
                {
                    parameter = "closed";
                    break;
                }
            }
        }
        else
        {
            parameter = "closed";
        }

        System.out.println(parameter);
    }
}
