import java.util.Scanner;

public class Vacation 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int group = Integer.parseInt(input.nextLine());
        String type_group = input.nextLine();
        String day_of_week = input.nextLine();

        double[][] prices = {
            { 8.45,  9.80, 10.46}, // Students
            {10.90, 15.60, 16.00}, // Business
            {15.00, 20.00, 22.50}  // Regular
        };

        int typeIndex = -1;
        switch (type_group.toLowerCase())
        {
            case "students":
            {
                typeIndex = 0;
                break;
            }
            case "business":
            {
                typeIndex = 1;
                break;
            }
            case "regular":
            {
                typeIndex = 2;
                break;
            }
        }

        int dayIndex = -1;
        switch (day_of_week.toLowerCase())
        {
            case "friday":
            {
                dayIndex = 0;
                break;
            }
            case "saturday":
            {
                dayIndex = 1;
                break;
            }
            case "sunday":
            {
                dayIndex = 2;
                break;
            }
        }

        double price_per_person = prices[typeIndex][dayIndex];
        double total_price = group * price_per_person;

        if (type_group.equalsIgnoreCase("students") && group >= 30)
        {
            total_price *= 0.85;
        }
        else if (type_group.equalsIgnoreCase("business") && group >= 100)
        {
            total_price -= 10 * price_per_person;
        }
        else if (type_group.equalsIgnoreCase("regular") && group >= 10 && group <= 20)
        {
            total_price *= 0.95;
        }

        System.out.printf("Total price: %.2f", total_price);
    }
}
