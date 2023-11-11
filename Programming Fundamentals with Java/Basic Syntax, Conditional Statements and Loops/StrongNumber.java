import java.util.Scanner;

public class StrongNumber 
{
    private static int factorial(int n) 
    {
        if (n == 0 || n == 1) 
        {
            return 1;
        } 
        else 
        {
            return n * factorial(n - 1);
        }
    }

    private static boolean isStrongNumber(int num)
    {
        int originalNum = num;
        int sum = 0;

        while (num > 0) 
        {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        return sum == originalNum; // if True
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String inputStr = input.nextLine();
        int num = Integer.parseInt(inputStr);

        if (isStrongNumber(num))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
