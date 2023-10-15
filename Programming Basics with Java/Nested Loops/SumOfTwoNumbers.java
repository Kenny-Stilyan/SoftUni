import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int start = Integer.parseInt(input.nextLine());
        int end = Integer.parseInt(input.nextLine());
        int magicNumber = Integer.parseInt(input.nextLine());

        int count = 0;
        boolean found = false;

        for (int i = start; i <= end; i++) 
        {
            for (int j = start; j <= end; j++) 
            {
                count++;
                int sum = i + j;
                if (sum == magicNumber) 
                {
                    found = true;
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, i, j, magicNumber);
                    break;
                }
            }

            if (found) 
            {
                break;
            }
        }

        if (!found) 
        {
            System.out.printf("%d combinations - neither equals %d%n", count, magicNumber);
        }
    }
}
