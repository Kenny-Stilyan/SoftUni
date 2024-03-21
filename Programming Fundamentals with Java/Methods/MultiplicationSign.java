import java.util.Scanner;

public class MultiplicationSign 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 == 0 || num2 == 0 || num3 == 0)
        {
            System.out.println("zero");
        }
        else
        {
            int negativeCount = 0;
            if (num1 < 0) {negativeCount++;}
            if (num2 < 0) {negativeCount++;}
            if (num3 < 0) {negativeCount++;}

            if (negativeCount % 2 == 0)
            {
                System.out.println("positive");
            } 
            else 
            {
                System.out.println("negative");
            }
        }
    }
}
