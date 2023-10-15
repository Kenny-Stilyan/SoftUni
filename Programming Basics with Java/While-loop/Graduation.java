import java.util.Arrays;
import java.util.Scanner;

public class Graduation 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();

        double[] arr = {};
        double sum = 0.0;
        int classes = 0;
        int mark = 0;

        while (classes != 12)
        {
            classes += 1;
            double grade = Double.parseDouble(input.nextLine());

            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = grade;

            if (grade < 4)
            {
                mark += 1;
                if (mark >= 2)
                {
                    System.out.printf("%s has been excluded at %d grade", name, arr.length - 1);
                    break;
                }
            }

            if (classes == 12)
            {
                for (int i = 0; i < arr.length; i++)
                {
                    sum += arr[i];
                }

                double avg = sum / arr.length;
                System.out.printf("%s graduated. Average grade: %.2f", name, avg);
                break;
            }
        }
    }
}
