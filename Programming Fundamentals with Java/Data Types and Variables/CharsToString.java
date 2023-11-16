import java.util.Scanner;

public class CharsToString 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String text = "";
        for ( int i = 0; i < 3; i++)
        {
            char ch = input.next().charAt(0);
            text += ch;
        }

        System.out.println(text);
    }
}
