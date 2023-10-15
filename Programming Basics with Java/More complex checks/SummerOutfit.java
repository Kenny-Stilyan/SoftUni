import java.util.Scanner;

public class SummerOutfit 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int degrees = Integer.parseInt(input.nextLine());
        String day = input.nextLine();

        String outfit = "";
        String shoes = "";

        if (day.equals("Morning"))
        {
            if (10 <= degrees && degrees <= 18)
            {
                outfit = "Sweatshirt";
                shoes = "Sneakers";
            }
            else if (degrees <= 24)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if (degrees >= 25)
            {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
        }
        else if (day.equals("Afternoon"))
        {
            if (10 <= degrees && degrees <= 18)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if (degrees <= 24)
            {
                outfit = "T-Shirt";
                shoes = "Sandals";
            }
            else if (degrees >= 25)
            {
                outfit = "Swim Suit";
                shoes = "Barefoot";
            }
        }
        else if (day.equals("Evening"))
        {
            if (10 <= degrees && degrees <= 18)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if (degrees <= 24)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
            else if (degrees >= 25)
            {
                outfit = "Shirt";
                shoes = "Moccasins";
            }
        }

        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
