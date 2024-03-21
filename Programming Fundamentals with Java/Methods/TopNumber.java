import java.util.Scanner;

public class TopNumber 
{
    public static void findTopNumbers(int n)
    {
        for (int i = 0; i <= n; i++)
        {
            if (isTopNumber(i))
            {
                System.out.println(i);
            }
        }
    }

    public static boolean hasSumOfDigitsDivisibleBy8(int number) 
    {
        int sum = 0;
        while (number > 0) 
        {
            sum += number % 10;
            number /= 10;
        }
        return sum % 8 == 0;
    }

    public static boolean hasAtLeastOneOddDigit(int number) 
    {
        while (number > 0) 
        {
            int digit = number % 10;
            if (digit % 2 != 0) 
            {
                return true;
            }
            number /= 10;
        }
        return false;
    }

    public static boolean isTopNumber(int number) 
    {
        return hasSumOfDigitsDivisibleBy8(number) && hasAtLeastOneOddDigit(number);
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        findTopNumbers(n);
    }
}
