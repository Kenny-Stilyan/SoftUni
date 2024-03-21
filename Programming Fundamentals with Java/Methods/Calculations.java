import java.util.Scanner;

public class Calculations 
{
    public static int add(int num1, int num2)
    {
        return num1 + num2;
    }
    public static int multiply(int num1, int num2)
    {
        return num1 * num2;
    }
    public static int subtract(int num1, int num2)
    {
        return num1 - num2;
    }
    public static int divide(int num1, int num2)
    {
        return num1 / num2;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String operation = input.nextLine();
        int num1 = Integer.parseInt(input.nextLine());
        int num2 = Integer.parseInt(input.nextLine());

        int result = 0;
        if      (operation.equalsIgnoreCase("add"))      {result = add(num1, num2);}
        else if (operation.equalsIgnoreCase("multiply")) {result = multiply(num1, num2);}
        else if (operation.equalsIgnoreCase("subtract")) {result = subtract(num1, num2);}
        else if (operation.equalsIgnoreCase("divide"))   {result = divide(num1, num2);}

        System.out.println(result);
    }
}
