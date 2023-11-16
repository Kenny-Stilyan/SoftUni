import java.util.Scanner;

public class SpecialNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            int sum = 0;
            int temp = i;
            while (temp > 0) 
            {
                int digit = temp % 10;
                sum += digit;
                temp /= 10;
            }

            if (sum == 5 || sum == 7 || sum == 11) 
            {
                System.out.println(i + " -> True");
            } 
            else 
            {
                System.out.println(i + " -> False");
            }
        }
    }
}
