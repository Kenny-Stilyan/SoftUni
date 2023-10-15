import java.util.Scanner;

public class SkiTrip 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int days = Integer.parseInt(input.nextLine());
        String premises = input.nextLine();
        String grade = input.nextLine();

        days -= 1;

        double percent = 0.0;
        double premises_price = 0.0;

        if (premises.equals("room for one person"))
        {
            premises_price = 18;
        }
        else if (premises.equals("apartment"))
        {
            premises_price = 25;
        }
        else if (premises.equals("president apartment"))
        {
            premises_price = 35;
        }

        if (days < 10)
        {
            if (premises.equals("apartment"))
            {
                percent = 0.7;
            }
            else if (premises.equals("president apartment"))
            {
                percent = 0.9;
            }
        }
        else if (days <= 15)
        {
            if (premises.equals("apartment"))
            {
                percent = 0.65;
            }
            else if (premises.equals("president apartment"))
            {
                percent = 0.85;
            }
        }
        else
        {
            if (premises.equals("apartment"))
            {
                percent = 0.5;
            }
            else if (premises.equals("president apartment"))
            {
                percent = 0.8;
            }
        }

        double price = 0.0;

        if (percent != 0.0)
        {
            price = (days * premises_price) * percent;
        }
        else
        {
            price = days * premises_price;
        }

        if (grade.equals("positive"))
        {
            price *= 1.25;
        }
        else
        {
            price *= 0.9;
        }

        System.out.printf("%.2f", price);
    }
}
