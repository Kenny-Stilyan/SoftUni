import java.util.Arrays;
import java.util.Scanner;

public class Train 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        int sum = 0;
        int[] numbers = new int[n];

        for (int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(input.nextLine());
            numbers[i] = num;
            sum += num;
        }

        for (int num : numbers)
        {
            System.out.print(num + " ");
        }

        System.out.println("\n" + sum);
    }
}
