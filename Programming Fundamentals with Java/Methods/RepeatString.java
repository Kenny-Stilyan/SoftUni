import java.util.Scanner;

public class RepeatString 
{
    public static void repeatString(String str, int n)
    {
        for (int i = 0; i < n; i++)
        {
            System.out.print(str);
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        int n = Integer.parseInt(input.nextLine());

        repeatString(text, n);
    }
}
