import java.util.Scanner;

public class RadiansToDegrees 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double rad = Double.parseDouble(input.nextLine());

        double degrees = rad * 180 / Math.PI;
        System.out.println(degrees);
    }
}
