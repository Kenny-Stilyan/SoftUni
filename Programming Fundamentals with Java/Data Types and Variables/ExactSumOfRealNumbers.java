import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        BigDecimal sum = BigDecimal.ZERO;
        for (int i = 0; i < n; i++)
        {
            BigDecimal num = input.nextBigDecimal();
            sum = sum.add(num);
        }

        System.out.println(sum);
    }
}
