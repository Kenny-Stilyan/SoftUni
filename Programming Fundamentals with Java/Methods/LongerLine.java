import java.util.Scanner;

public class LongerLine 
{
    private static double calculateDistanceToCenter(int x, int y) 
    {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    private static void printLine(int x1, int y1, int x2, int y2) 
    {
        if (calculateDistanceToCenter(x1, y1) <= calculateDistanceToCenter(x2, y2))
        {
            System.out.printf("(%d, %d)(%d, %d)%n", x1, y1, x2, y2);
        } 
        else 
        {
            System.out.printf("(%d, %d)(%d, %d)%n", x2, y2, x1, y1);
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int x1 = input.nextInt();
        int y1 = input.nextInt();

        int x2 = input.nextInt();
        int y2 = input.nextInt();

        int x3 = input.nextInt();
        int y3 = input.nextInt();

        int x4 = input.nextInt();
        int y4 = input.nextInt();

        // Calculate the distances from the center for both lines
        double distanceLine1 = calculateDistanceToCenter(x1, y1) + calculateDistanceToCenter(x2, y2);
        double distanceLine2 = calculateDistanceToCenter(x3, y3) + calculateDistanceToCenter(x4, y4);

        if (distanceLine1 >= distanceLine2) 
        {
            printLine(x1, y1, x2, y2);
        }
        else
        {
            printLine(x3, y3, x4, y4);
        }
    }
}
