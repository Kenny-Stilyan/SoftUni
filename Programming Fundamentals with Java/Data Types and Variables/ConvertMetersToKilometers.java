import java.util.Scanner;

public class ConvertMetersToKilometers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int meters = Integer.parseInt(input.nextLine());

        double kilometers = (double) meters / 1000;
        System.out.printf("%.2f", kilometers);
    }
}
