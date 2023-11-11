import java.util.Scanner;

public class PadawanEquipment 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double budget = Double.parseDouble(input.nextLine());
        int students = Integer.parseInt(input.nextLine());
        double priceLightsabers  = Double.parseDouble(input.nextLine());
        double priceRobes  = Double.parseDouble(input.nextLine());
        double priceBelts  = Double.parseDouble(input.nextLine());

        double sum = 0.0;
        sum += (priceLightsabers * (int) Math.ceil(students * 1.1));
        sum += (priceRobes * students);
        sum += (priceBelts * (students - (int) (students / 6)));

        if (sum <= budget)
        {
            System.out.printf("The money is enough - it would cost %.2flv.", sum);
        }
        else
        {
            System.out.printf( "George Lucas will need %.2flv more." , Math.abs(sum - budget));
        }
    }
}
