import java.util.Scanner;

public class EvenNumber 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        while (true)
        {
            int num = Integer.parseInt(input.nextLine());

            if (num % 2 == 0)
            {
                System.out.printf("The number is: %d", Math.abs(num));
                break;
            }
            else
            {
                System.out.println("Please write an even number.");
            }
        }
    }
}
