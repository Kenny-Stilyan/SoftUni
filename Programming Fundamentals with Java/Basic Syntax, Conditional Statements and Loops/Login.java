import java.util.Scanner;

public class Login 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String username = input.nextLine();
        String password = "";

        char ch;
        for (int i = 0; i < username.length(); i++)
        {
            ch = username.charAt(i);
            password = ch + password;
        }

        int fails = 0;
        while (true) 
        {
            String pass = input.nextLine();

            if (pass.equals(password))
            {
                System.out.printf("User %s logged in.", username);
                break;
            }

            if (fails == 3)
            {
                System.out.printf("User %s blocked!", username);
                break;
            }
            else
            {
                System.out.println("Incorrect password. Try again.");
            }
            fails++;
        }
    }
}
