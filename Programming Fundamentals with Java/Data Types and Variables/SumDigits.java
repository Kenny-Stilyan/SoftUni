import java.util.ArrayList;
import java.util.Scanner;

public class SumDigits 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        ArrayList<Integer> digits = new ArrayList<>();
        while (number > 0)
        {
            digits.add(number % 10);
            number /= 10;
        }

        int sum = 0;
        for (Integer num : digits)
        {
            sum += num;
        }

        System.out.println(sum);
    }
}
