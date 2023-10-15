import java.util.Scanner;

public class Sequence2kPlus1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int number = 1;

        while (number <= n)
        {
            System.out.println(number);
            number = number * 2 + 1;
        }
    }
}
