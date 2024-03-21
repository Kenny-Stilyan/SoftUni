import java.util.Scanner;

public class CenterPoint 
{
    public static void printClosestPoint(double x1, double y1, double x2, double y2)
    {
        double distance1 = calculateDistance(x1, y1);
        double distance2 = calculateDistance(x2, y2);

        if (distance1 <= distance2)
        {
            System.out.printf("(%.0f, %.0f)", x1, y1);
        }
        else
        {
            System.out.printf("(%.0f, %.0f)", x2, y2);
        }
    }

    public static Double calculateDistance(double x, double y)
    {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double x1 = Double.parseDouble(input.nextLine());
        double y1 = Double.parseDouble(input.nextLine());

        double x2 = Double.parseDouble(input.nextLine());
        double y2 = Double.parseDouble(input.nextLine());

        printClosestPoint(x1, y1, x2, y2);
    }
}
