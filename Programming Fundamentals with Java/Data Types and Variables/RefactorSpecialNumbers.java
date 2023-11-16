import java.util.Scanner;

public class RefactorSpecialNumbers 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        int currNum = 0;
        boolean isSpecialNum = false;

        for (int i = 1; i <= n; i++)
        {
            currNum = i;
            while (i > 0)
            { 
                sum += i % 10;
                i = i / 10;
            }

            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);
            System.out.printf("%d -> %s\n", currNum, isSpecialNum ? "True" : "False");
            sum = 0;
            i = currNum;
        }
    }
}
