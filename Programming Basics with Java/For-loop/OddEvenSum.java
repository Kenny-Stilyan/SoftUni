import java.util.Scanner;

public class OddEvenSum 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int even = 0;
        int odd = 0;

        for (int i = 0; i < n; i++)
        {
            if (i % 2 == 0)
            {
                even += input.nextInt();
            }
            else
            {
                odd += input.nextInt();
            }
        }

        int diff = (int) Math.abs(even - odd);

        if (even == odd)
        {
            System.out.println("Yes");
            System.out.println("Sum = " + even);
        }
        else
        {
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
