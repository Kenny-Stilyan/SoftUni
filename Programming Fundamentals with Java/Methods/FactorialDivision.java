import java.util.Scanner;

public class FactorialDivision 
{
    public static long factorial(int num)
    {
        long result = 1;
        for (int i = 1; i <= num; i++)
        {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num1 = Integer.parseInt(input.nextLine());
        int num2 = Integer.parseInt(input.nextLine());

        long factorialNum1 = factorial(num1);
        long factorialNum2 = factorial(num2);

        double result = factorialNum1 / factorialNum2;
        System.out.printf("%.2f", result);
    }
}
