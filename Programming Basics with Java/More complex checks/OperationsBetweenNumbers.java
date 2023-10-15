import java.util.Scanner;

public class OperationsBetweenNumbers 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num1 = Integer.parseInt(input.nextLine());
        int num2 = Integer.parseInt(input.nextLine());
        String operator = input.nextLine();

        double result = 0.0;
        String num_is = "";

        switch (operator)
        {
            case "+":
            {
                result = num1 + num2;
                num_is = (result % 2 == 0) ? "even" : "odd";
                 break;
            }
            case "-":
            {
                result = num1 - num2;
                num_is = (result % 2 == 0) ? "even" : "odd";
                 break;
            }
            case "*":
            {
                result = num1 * num2;
                num_is = (result % 2 == 0) ? "even" : "odd";
                 break;
            }
            case "/":
            {
                result = (double) num1 / num2;
                 break;
            }
            case "%":
            {
                result = (double) num1 % num2;
                 break;
            }
        }

        if (num2 == 0 && (operator.equals("/") || operator.equals("%")))
        {
            System.out.printf("Cannot divide %d by zero", num1);
        }
        else if (operator.equals("/"))
        {
            System.out.printf("%d / %d = %.2f", num1, num2, result);
        }
        else if (operator.equals("%"))
        {
            System.out.printf("%d %% %d = %.0f", num1, num2, result);
        }
        else
        {
            System.out.printf("%d %s %d = %.0f - %s", num1, operator, num2, result, num_is);
        }
    }
}
