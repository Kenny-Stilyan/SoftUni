import java.util.Scanner;

public class PasswordValidator 
{
    private static boolean isValidPassword(String password) 
    {
        // 6-10 characters
        String lengthRegex = "^.{6,10}$";

        // Consists only of letters and digits
        String characterRegex = "^[a-zA-Z0-9]+$";

        // Have at least 2 digits
        String digitRegex = ".*\\d.*\\d.*";

        return password.matches(lengthRegex) && password.matches(characterRegex) 
                && password.matches(digitRegex);
    }

    private static void printInvalidPasswordMessages(String password) 
    {
        // Rule 1: 6-10 characters
        if (!password.matches("^.{6,10}$")) 
        {
            System.out.println("Password must be between 6 and 10 characters");
        }

        // Rule 2: Consists only of letters and digits
        if (!password.matches("^[a-zA-Z0-9]+$")) 
        {
            System.out.println("Password must consist only of letters and digits");
        }

        // Rule 3: Have at least 2 digits
        if (!password.matches(".*\\d.*\\d.*")) 
        {
            System.out.println("Password must have at least 2 digits");
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String password = input.nextLine();
        if (isValidPassword(password)) 
        {
            System.out.println("Password is valid");
        } 
        else 
        {
            printInvalidPasswordMessages(password);
        }
    }
}
