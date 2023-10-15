import java.util.Scanner;

public class SumNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        int sum = 0;
        while (sum < num)
        {
            int curr_num = input.nextInt();
            sum += curr_num;
        }

        System.out.println(sum);
    }
}
