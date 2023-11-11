import java.util.Scanner;

public class Division 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());

        int divisibleNum = -1;
        if (num % 10 == 0)
        {
            divisibleNum = 10;
        }
        else if (num % 7 == 0)
        {
            divisibleNum = 7;
        }
        else if (num % 6 == 0)
        {
            divisibleNum = 6;
        }
        else if (num % 3 == 0)
        {
            divisibleNum = 3;
        }
        else if (num % 2 == 0)
        {
            divisibleNum = 2;
        }

        if (divisibleNum != -1)
        {
            System.out.printf("The number is divisible by %d", divisibleNum);
        }
        else
        {
            System.out.println("Not divisible");
        }
    }
}
