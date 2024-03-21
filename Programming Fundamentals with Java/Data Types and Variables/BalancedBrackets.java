import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets 
{
    // to Fix
    private static boolean isBalanced(String input) 
    {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) 
        {
            if (ch == '(') 
            {
                stack.push(ch);
            } 
            else if (ch == ')') 
            {
                if (stack.isEmpty() || stack.pop() != '(') 
                {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        int n = Integer.parseInt(inputScanner.nextLine());

        for (int i = 0; i < n; i++)
        {
            String input = inputScanner.nextLine();
            if (isBalanced(input))
            {
                System.out.println("BALANCED");
            }
            else
            {
                System.out.println("UNBALANCED");
            }
        }
    }
}
