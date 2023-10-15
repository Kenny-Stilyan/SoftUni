import java.util.Scanner;

public class CinemaTicket 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String day = input.nextLine();
        int price = 0;

        switch (day)
        {
            case "Monday":
            case "Tuesday":
            case "Friday":
            {
                price = 12;
                break;
            }
            case "Wednesday":
            case "Thursday":
            {
                price = 14;
                break;
            }
            case "Saturday":
            case "Sunday":
            {
                price = 16;
                break;
            }
        }

        System.out.println(price);
    }
}
