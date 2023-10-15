import java.util.Scanner;

public class DayOfWeek
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String parameter = "";

        switch (num)
        {
            case 1:
            {
                parameter = "Monday";
                break;
            }
            case 2:
            {
                parameter = "Tuesday";
                break;
            }
            case 3:
            {
                parameter = "Wednesday";
                break;
            }
            case 4:
            {
                parameter = "Thursday";
                break;
            }
            case 5:
            {
                parameter = "Friday";
                break;
            }
            case 6:
            {
                parameter = "Saturday";
                break;
            }
            case 7:
            {
                parameter = "Sunday";
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