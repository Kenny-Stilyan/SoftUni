import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int[] numbers1 = Arrays.stream(input.nextLine().split(" "))
                                .mapToInt(num -> Integer.parseInt(num))
                                .toArray();
        int[] numbers2 = Arrays.stream(input.nextLine().split(" "))
                                .mapToInt(num -> Integer.parseInt(num))
                                .toArray();

        int sum = 0;
        int index = -1;

        for (int i = 0; i < numbers1.length; i++)
        {
            sum += numbers1[i];

            if (numbers1[i] != numbers2[i])
            {
                index = i;
                break;
            }
        }

        if (index != -1)
        {
            System.out.printf("Arrays are not identical. Found difference at %d index." , index);
        }
        else
        {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        }
    }
}
