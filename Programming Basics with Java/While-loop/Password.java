import java.util.Scanner;

public class Password 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        String password = input.nextLine();
        String pass = input.nextLine();

        while (!pass.equals(password))
        {
            pass = input.nextLine();
        }

        System.out.printf("Welcome %s!", name);
    }
}
