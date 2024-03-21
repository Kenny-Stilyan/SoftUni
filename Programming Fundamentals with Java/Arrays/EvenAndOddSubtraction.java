import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int[] numbers = Arrays.stream(input.nextLine().split(" "))
                                .mapToInt(num -> Integer.parseInt(num))
                                .toArray();

        int sum_odd = 0;
        int sum_even = 0;

        for (int num : numbers)
        {
            if (num % 2 == 0)
            {
                sum_even += num;
            }
            else
            {
                sum_odd += num;
            }
        }

        System.out.println(sum_even - sum_odd);
    }
}
