import java.util.Scanner;

public class TriplesOfLatinLetters 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                for (int k = 0; k < n; k++)
                {
                    char firstLetter = (char) ('a' + i);
                    char secondLetter = (char) ('a' + j);
                    char thirdLetter = (char) ('a' + k);

                    String result = String.format("%c%c%c", firstLetter, secondLetter, thirdLetter);
                    System.out.println(result);
                }
            }
        }
    }
}
