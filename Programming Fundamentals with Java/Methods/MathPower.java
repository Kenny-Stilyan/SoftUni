import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower 
{
    public static Double numToPow(double num, int power)
    {
        return Math.pow(num, power);
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        Double num = input.nextDouble();
        int pow = input.nextInt();

        double result = numToPow(num, pow);
        System.out.println(new DecimalFormat("0.####").format(result));
    }
}
