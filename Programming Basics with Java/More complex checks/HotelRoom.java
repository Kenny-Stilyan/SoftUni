import java.util.Scanner;

public class HotelRoom 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String month = input.nextLine();
        int days_spend = Integer.parseInt(input.nextLine());

        double studio = 0.0;
        double apartment = 0.0;
        double discount_studio = 0.0;
        double discount_apartment = 0.0;

        switch (month)
        {
            case "May":
            case "October":
            {
                if (days_spend > 14)
                {
                    discount_studio = 0.7;
                }
                else if (days_spend > 7)
                {
                    discount_studio = 0.95;
                }
                studio = 50;
                apartment = 65;
                break;
            }
            case "June":
            case "September":
            {
                if (days_spend > 14)
                {
                    discount_studio = 0.8;
                }
                studio = 75.2;
                apartment = 68.7;
                break;
            }
            case "July":
            case "August":
            {
                studio = 76;
                apartment = 77;
                break;
            }
        }

        if (discount_studio != 0.0)
        {
            studio *= discount_studio;
        }

        if (days_spend > 14)
        {
            apartment *= 0.9;
        }

        System.out.printf("Apartment: %.2f lv.\n", apartment * days_spend);
        System.out.printf("Studio: %.2f lv.", studio * days_spend);
    }
}
