package Checks;
import java.util.Scanner;

public class ExcellentResult 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int grade = input.nextInt();
        if (5 <= grade)
        {
            System.out.println("Excellent!");
        }
    }
}

