import java.util.Scanner;

public class CalculateRectangleArea 
{
    public static int area(int width, int length)
    {
        return width * length;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int width = Integer.parseInt(input.nextLine());
        int length = Integer.parseInt(input.nextLine());

        int result = area(width, length);
        System.out.println(result);
    }
}
