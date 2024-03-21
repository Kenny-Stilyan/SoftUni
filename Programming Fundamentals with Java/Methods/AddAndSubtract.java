import java.text.DecimalFormat;
import java.util.Scanner;

public class AddAndSubtract 
{
    public static Double addAndSubtract(double num1, double num2, double num3)
    {
        return (num1 + num2) - num3;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double num1 = Double.parseDouble(input.nextLine());
        double num2 = Double.parseDouble(input.nextLine());
        double num3 = Double.parseDouble(input.nextLine());

        double result = addAndSubtract(num1, num2, num3);
        System.out.println(new DecimalFormat("0.####").format(result));
    }
}
