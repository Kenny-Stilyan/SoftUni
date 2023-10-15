import java.util.Scanner;

public class NumbersN1 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = num; i > 0; i--)
        {
            System.out.println(i);
        }
    }
}
