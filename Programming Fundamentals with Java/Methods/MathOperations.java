import java.util.Scanner;

public class MathOperations 
{
    public static int calculate(int a, String operator, int b)
    {
        switch (operator) 
        {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0)
                {
                    return a / b;
                }
            default:
                return 0;
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num1 = Integer.parseInt(input.nextLine());
        String operator = input.nextLine();
        int num2 = Integer.parseInt(input.nextLine());

        int result = calculate(num1, operator, num2);
        System.out.println(result);
    }
}
