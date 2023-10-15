import java.util.Scanner;

public class NumberInRange 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double num = input.nextDouble();
        String parameter = "";

        if (-100 <= num && num <= 100 && num != 0)
        {
            parameter = "Yes";
        }
        else
        {
            parameter = "No";
        }

        System.out.println(parameter);
    }
}

