import java.util.Scanner;

public class Orders 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        double total = 0.0;

        for (int i = 0; i < n; i++)
        {
            double price = Double.parseDouble(input.nextLine());
            int days = Integer.parseInt(input.nextLine());
            int count = Integer.parseInt(input.nextLine());
            
            double sum = (price * days) * count;
            total += sum;

            System.out.printf("The price for the coffee is: $%.2f\n", sum);
        }

        System.out.printf( "Total: $%.2f", total);
    }
}
