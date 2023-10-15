import java.util.Scanner;

public class WeekendOrWorkingDay 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String day = input.nextLine();
        String parameter = "";

        switch (day)
        {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
            {
                parameter = "Working day";
                break;
            }
            case "Saturday":
            case "Sunday":
            {
                parameter = "Weekend";
                break;
            }
            default:
            {
                parameter = "Error";
            }
        }

        System.out.println(parameter);
    }
}
