import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumberse
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int[] numbers = Arrays.stream(input.nextLine().split(" "))
                            .mapToInt(num -> Integer.parseInt(num))
                            .toArray();

        while (numbers.length > 1) 
        {
            int[] condensedArray = new int[numbers.length - 1];

            for (int i = 0; i < condensedArray.length; i++) 
            {
                condensedArray[i] = numbers[i] + numbers[i + 1];
            }

            numbers = condensedArray;
        }

        System.out.println(numbers[0]);
    }
}
