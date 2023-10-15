import java.util.Scanner;

public class Journey 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double budget = Double.parseDouble(input.nextLine());
        String season = input.nextLine();

        String destination = "";
        String type_vacation = "";
        double percent = 0.0;

        if (season.equals("summer"))
        {
            if (budget <= 100)
            {
                destination = "Bulgaria";
                type_vacation = "Camp";
                percent = 0.3;
            }
            else if (budget <= 1000)
            {
                destination = "Balkans";
                type_vacation = "Camp";
                percent = 0.4;
            }
            else
            {
                destination = "Europe";
                type_vacation = "Hotel";
                percent = 0.9;
            }
        }
        else if (season.equals("winter"))
        {
            if (budget <= 100)
            {
                destination = "Bulgaria";
                type_vacation = "Hotel";
                percent = 0.7;
            }
            else if (budget <= 1000)
            {
                destination = "Balkans";
                type_vacation = "Hotel";
                percent = 0.8;
            }
            else
            {
                destination = "Europe";
                type_vacation = "Hotel";
                percent = 0.9;
            }
        }

        double spend_monney = budget * percent;
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", type_vacation, spend_monney);
    }
}
