import java.util.Scanner;

public class CharactersInRange 
{
    public static void printCharInRange(char ch1, char ch2) 
    {
        int start = Math.min((int) ch1, (int) ch2);
        int end = Math.max((int) ch1, (int) ch2);

        for (int i = start + 1; i < end; i++) 
        {
            System.out.print((char) i + " ");
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        char ch1 = input.next().charAt(0);
        char ch2 = input.next().charAt(0);

        printCharInRange(ch1, ch2);
    }
}
