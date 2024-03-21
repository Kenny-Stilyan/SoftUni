import java.util.Scanner;

public class SignOfIntegerNumbers 
{
    public static void declareNum(int num)
    {
        if (num == 0)
        {
            System.out.println("The number 0 is zero.");
        }
        else if (num > 0)
        {
            System.out.printf("The number %d is positive.", num);
        }
        else
        {
            System.out.printf("The number %d is negative.", num);
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());
        declareNum(num);
    }
}
