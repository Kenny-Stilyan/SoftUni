import java.util.Scanner;

public class TrekkingMania 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int total = 0;
        int[] list = new int[5];

        for (int i = 0; i < n; i++)
        {
            int num = input.nextInt();
            total += num;

            if (num <= 5) // Мусала
            {
                list[0] += num;
            }
            else if (num <= 12) // Монблан
            {
                list[1] += num;
            }
            else if (num <= 25) // Килиманджаро
            {
                list[2] += num;
            }
            else if (num <= 40) // К2
            {
                list[3] += num;
            }
            else // Еверест
            {
                list[4] += num;
            }
        }

        for (int i = 0; i < list.length; i++)
        {
            double result = (double) list[i] / total * 100;
            System.out.printf("%.2f%%\n", result);
        }
    }
}
