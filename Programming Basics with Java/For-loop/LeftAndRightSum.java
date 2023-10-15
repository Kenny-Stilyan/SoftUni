import java.util.Scanner;

public class LeftAndRightSum 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int left_sum = 0;
        int right_sum = 0;

        for (int i = 0; i < n; i++)
        {
            left_sum += input.nextInt();
        }
        
        for (int i = 0; i < n; i++)
        {
            right_sum += input.nextInt();
        }

        int diff = (int) Math.abs(right_sum - left_sum);

        if (left_sum == right_sum)
        {
            System.out.println("Yes, sum = " + right_sum);
        }
        else
        {
            System.out.println("No, diff = " + diff);
        }
    }
}
