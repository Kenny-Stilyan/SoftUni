import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class MultiplyEvensByOdds 
{
    public static int getMultipleOfEvensAndOdds(int even, int odd)
    {
        return even * odd;
    }
    public static int getSumEven(List<Integer> digits)
    {
        int sum = 0;
        for (int num : digits)
        {
            if (num % 2 == 0)
            {
                sum += num;
            }
        }
        return sum;
    }
    public static int getSumOdd(List<Integer> digits)
    {
        int sum = 0;
        for (int num : digits)
        {
            if (num % 2 != 0)
            {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());
        num = Math.abs(num);

        List<Integer> digits = new ArrayList<>();
        while (num > 0) 
        {
            digits.add(num % 10);
            num /= 10;
        }

        int evenSum = getSumEven(digits);
        int oddSum = getSumOdd(digits);
        int result = getMultipleOfEvensAndOdds(evenSum, oddSum);

        System.out.println(result);
    }
}
