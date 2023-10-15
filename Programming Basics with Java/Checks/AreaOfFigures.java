package Checks;
import java.util.Scanner;

public class AreaOfFigures 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String figure = input.nextLine();
        double s = 0.0;

        if (figure.equals("square"))
        {
            double a = input.nextDouble();
            s = a * a;
        }
        else if (figure.equals("rectangle"))
        {
            double a = input.nextDouble();
            double b = input.nextDouble();
            s = a * b;
        }
        else if (figure.equals("circle"))
        {
            double r = input.nextDouble();
            s = Math.PI * Math.pow(r, 2);
        }
        else if (figure.equals("triangle"))
        {
            double a = input.nextDouble();
            double h = input.nextDouble();
            s = (a * h) / 2;
        }

        if (s != 0.0)
        {
            System.out.printf("%.3f", s);
        }
    }
}
