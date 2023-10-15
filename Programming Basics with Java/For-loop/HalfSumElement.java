import java.util.Scanner;

public class HalfSumElement 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++)
        {
            int num = input.nextInt();
            sum += num;

            if (num > max)
            {
                max = num;
            }
        }

        sum -= max;
        int diff = (int) Math.abs(sum - max);

        if (sum == max)
        {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sum);
        }
        else
        {
            System.out.println("No");
            System.out.printf("Diff = %d", diff);
        }
    }
}
