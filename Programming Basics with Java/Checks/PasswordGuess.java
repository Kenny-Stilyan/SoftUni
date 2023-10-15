package Checks;
import java.util.Scanner;

public class PasswordGuess 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String password = "s3cr3t!P@ssw0rd";

        String pass = input.nextLine();
        if (password.equals(pass))
        {
            System.out.println("Welcome");
        }
        else
        {
            System.out.println("Wrong password!");
        }
    }
}
