import java.util.Scanner;

public class LowerOrUpper 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        Character ch = input.next().charAt(0);

        if (Character.isUpperCase(ch))
        {
            System.out.println("upper-case");
        }
        else if (Character.isLowerCase(ch))
        {
            System.out.println("lower-case");
        }
    }
}
