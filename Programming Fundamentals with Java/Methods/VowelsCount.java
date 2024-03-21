import java.util.Scanner;

public class VowelsCount 
{
    public static int countVowels(String text) 
    {
        text = text.toLowerCase();
        int vowelCount = 0;
    
        for (int i = 0; i < text.length(); i++) 
        {
            char currentChar = text.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || 
                currentChar == 'o' || currentChar == 'u')
            {
                    vowelCount++;
            }
        }

        return vowelCount;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        int count = countVowels(text);

        System.out.println(count);
    }
}
