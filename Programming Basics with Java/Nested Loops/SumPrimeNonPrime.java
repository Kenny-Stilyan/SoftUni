import java.util.Scanner;

public class SumPrimeNonPrime 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int sum_prime = 0;
        int sum_non_prime = 0;

        while (true)
        {
            String command = input.nextLine();
            if (command.equals("stop"))
            {
                System.out.printf("Sum of all prime numbers is: %d\n", sum_prime);
                System.out.printf("Sum of all non prime numbers is: %d", sum_non_prime);
                break;
            }

            int num = Integer.parseInt(command);
            if (num < 0)
            {
                System.out.println("Number is negative.");
            }
            else
            {
                boolean flag = false;
                for (int i = 2; i <= num / 2; ++i) 
                {
                    if (num % i == 0) 
                    {
                        flag = true;
                        break;
                    }
                }

                if (!flag)
                {
                    sum_prime += num;
                }
                else
                {
                    sum_non_prime += num;
                }
            }
        }
    }
}