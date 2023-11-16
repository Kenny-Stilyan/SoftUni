import java.util.Scanner;

public class FloatingEquality 
{
    private static boolean areEqual(double num1, double num2, double eps) 
    {
        return Math.abs(num1 - num2) < eps;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();

        double eps = 0.000001;

        if (areEqual(num1, num2, eps)) 
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}
