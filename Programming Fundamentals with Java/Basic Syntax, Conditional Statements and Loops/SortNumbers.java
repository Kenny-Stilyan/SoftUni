import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        Integer[] numbers = new Integer[3];
        for (int i = 0; i < 3; i++)
        {
            int num = Integer.parseInt(input.nextLine());
            numbers[i] = num;
        }

        Arrays.sort(numbers, Collections.reverseOrder());

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println(numbers[i]);
        }
    }
}
