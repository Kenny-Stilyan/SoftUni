import java.util.Scanner;

public class Cinema 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String ticket_type = input.nextLine();
        int row = input.nextInt();
        int column = input.nextInt();

        double ticket_price = 0.0;

        switch (ticket_type)
        {
            case "Premiere":
            {
                ticket_price = 12;
                break;
            }
            case "Normal":
            {
                ticket_price = 7.5;
                break;
            }
            case "Discount":
            {
                ticket_price = 5;
                break;
            }
        }

        double price = ticket_price * row * column;
        System.out.printf("%.2f leva", price);
    }
}
