import java.util.Scanner;

public class Travelling 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String destination = input.nextLine();
        double trip_savings = 0;

        while (!destination.equals("End"))
        {
            double budget = Double.parseDouble(input.nextLine());

            while(trip_savings < budget)
            {
                trip_savings += Double.parseDouble(input.nextLine());
            }

            System.out.printf("Going to %s!\n" , destination);
            trip_savings = 0;
            destination = input.nextLine();
        }
    }
}
