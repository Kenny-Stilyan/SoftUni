import java.util.Scanner;

public class ReadText 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        while (!text.equals("Stop"))
        {
            System.out.println(text);
            text = input.nextLine();
        }
    }
}
