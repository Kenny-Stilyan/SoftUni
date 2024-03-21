import java.util.Arrays;
import java.util.Scanner;

public class DecryptingMessage 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int key = Integer.parseInt(input.nextLine());
        int n = Integer.parseInt(input.nextLine());

        Character[] text = new Character[n];
        for (int i = 0; i < n; i++)
        {
            Character ch = input.next().charAt(0);
            Character letter = (char) ((int) ch + key);
            text[i] = letter;
        }

        for (char ch : text)
        {
            System.out.print(ch);
        }
    }
}