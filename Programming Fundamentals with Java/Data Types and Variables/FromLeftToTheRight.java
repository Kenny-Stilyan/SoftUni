import java.io.Console;
import java.util.*;

public class FromLeftToTheRight 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        for (int i = 0; i < n; i++)
        {
            String strNumbers = input.nextLine();
            String[] listNumbers = strNumbers.split(" ");

            long numLeft = Long.parseLong(listNumbers[0]);
            long numRight = Long.parseLong(listNumbers[1]);
            long maxNum = Math.max(numLeft, numRight);

            long sum = 0;
            while (Math.abs(maxNum) > 0)
            {
                sum += Math.abs(maxNum % 10);
                maxNum /= 10;
            }

            System.out.println(sum);
        }
    }
}
