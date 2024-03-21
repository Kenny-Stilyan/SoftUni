import java.util.Scanner;

public class MiddleCharacters 
{
    public static void middleCharacters(String text)
    {
        if (text.length() % 2 == 0)
        {
            int middleIndex = text.length() / 2;
            char middle1 = text.charAt(middleIndex - 1);
            char middle2 = text.charAt(middleIndex);
    
            System.out.println("" + middle1 + middle2);
        }
        else
        {
            int middleIndex = text.length() / 2;
            char middle = text.charAt(middleIndex);
    
            System.out.println(middle);
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        middleCharacters(text);
    }
}
