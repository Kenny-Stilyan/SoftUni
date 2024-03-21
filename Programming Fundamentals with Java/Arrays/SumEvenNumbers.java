import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int[] numbers = Arrays.stream(input.nextLine().split(" "))
                            .mapToInt(num -> Integer.parseInt(num))
                            .toArray();

        int sum = 0;
        for (int num : numbers)
        {
            if (num % 2 == 0)
            {
                sum += num;
            }
        }

        System.out.println(sum);
    }
}
