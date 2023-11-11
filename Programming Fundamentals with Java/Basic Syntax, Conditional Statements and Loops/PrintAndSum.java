import java.util.Scanner;

public class PrintAndSum 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int x = Integer.parseInt(input.nextLine());
        int y = Integer.parseInt(input.nextLine());

        int sum = 0;
        for (int i = x; i <= y; i++)
        {
            System.out.print(i + " ");
            sum += i;
        }

        System.out.printf("\nSum: %d", sum);
    }
}
