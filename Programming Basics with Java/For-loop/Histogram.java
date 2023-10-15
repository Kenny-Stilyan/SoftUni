import java.util.Scanner;

public class Histogram 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] counts = new int[5];

        for (int i = 0; i < n; i++)
        {
            int num = input.nextInt();

            if (num < 200)
            {
                counts[0]++;
            }
            else if (num < 400)
            {
                counts[1]++;
            }
            else if (num < 600)
            {
                counts[2]++;
            }
            else if (num < 800)
            {
                counts[3]++;
            }
            else
            {
                counts[4]++;
            }
        }

        for (int i = 0; i < counts.length; i++)
        {
            double percentage = (double) counts[i] / n * 100;
            System.out.printf("%.2f%%\n", percentage);
        }
    }
}
