import java.util.Scanner;

public class SumOfChars 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        int sum = 0;
        for (int i = 0; i < n; i++)
        {
            Character ch = input.next().charAt(0);
            sum += (int) ch;
        }

        System.out.printf("The sum equals: %d", sum);
    }
}