import java.util.Scanner;

public class PassedOrFailed 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        Double grade = Double.parseDouble(input.nextLine());

        if (grade >= 3.00)
        {
            System.out.println("Passed!");
        }
        else
        {
            System.out.println("Failed!");
        }
    }
}
