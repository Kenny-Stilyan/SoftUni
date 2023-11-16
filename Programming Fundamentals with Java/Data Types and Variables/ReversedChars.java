import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ReversedChars 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        Character[] chars = new Character[3];
        for ( int i = 2; i >= 0; i--)
        {
            chars[i] = input.next().charAt(0);;
        }

        System.out.print(chars[0] + " " + chars[1] + " " + chars[2]);
    }
}
