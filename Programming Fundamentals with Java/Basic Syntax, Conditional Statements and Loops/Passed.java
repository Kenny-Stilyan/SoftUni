import java.util.Scanner;

public class Passed 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        Double grade = Double.parseDouble(input.nextLine());

        if (grade >= 3.00)
        {
            System.out.println("Passed!");
        }
    }
}
