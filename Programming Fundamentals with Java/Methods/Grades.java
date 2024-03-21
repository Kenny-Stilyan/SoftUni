import java.util.Scanner;

public class Grades 
{
    public static String printGrade(double grade)
    {
        if (2 <= grade && grade <= 2.99)
        {
            return "Fail";
        }
        else if (3 <= grade && grade <= 3.49)
        {
            return "Poor";
        }
        else if (3.5 <= grade && grade <= 4.49)
        {
            return "Good";
        }
        else if (4.5 <= grade && grade <= 5.49)
        {
            return "Very good";
        }
        else if (5.5 <= grade && grade <= 6)
        {
            return "Excellent";
        }
        return null;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double grade = Double.parseDouble(input.nextLine());
        System.out.println(printGrade(grade));
    }
}
