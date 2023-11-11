import java.util.Scanner;

public class SumOfOddNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;

        for (int i = 0; i < n*2; i++)
        {
            if (i % 2 != 0)
            {
                sum += i;
                System.out.println(i);
            }
        }

        System.out.println("Sum: " + sum);
    }
}
