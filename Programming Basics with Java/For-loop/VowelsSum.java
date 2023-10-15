import java.util.Scanner;

public class VowelsSum 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();

        int points = 0;
        for (int i = 0; i < text.length(); i++)
        {
            char letter = text.charAt(i);
            switch (letter)
            {
                case 'a':
                {
                    points += 1;
                    break;
                }
                case 'e':
                {
                    points += 2;
                    break;
                }
                case 'i':
                {
                    points += 3;
                    break;
                }
                case 'o':
                {
                    points += 4;
                    break;
                }
                case 'u':
                {
                    points += 5;
                    break;
                }
                default:
                {
                    points += 0;
                    break;
                }
            }
        }

        System.out.println(points);
    }
}
