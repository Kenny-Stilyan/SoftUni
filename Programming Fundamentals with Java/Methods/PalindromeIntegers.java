import java.util.Scanner;

public class PalindromeIntegers 
{
    public static boolean isPalindrome(int number) 
    {
        String strNumber = Integer.toString(number);
        String reversedStr = new StringBuilder(strNumber).reverse().toString();

        return strNumber.equals(reversedStr);
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        while (true) 
        {
            String command = input.nextLine();

            if (command.equals("END"))
            {
                break;
            }

            int num = Integer.parseInt(command);
            boolean palindromeIntegers = isPalindrome(num);

            if (num >= 0)
            {
                System.out.println(palindromeIntegers);
            }
        }
    }
}
