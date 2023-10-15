import java.util.Scanner;

public class SumNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            int num = input.nextInt();
            sum += num;
        }

        System.out.println(sum);
    }
}
