import java.util.Arrays;
import java.util.Scanner;

public class MaxNumber 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int[] arr = {};
        int max = 0;

        while (true)
        {
            String command = input.nextLine();

            if (command.equals("Stop"))
            {
                Arrays.sort(arr);
                max = arr[arr.length - 1];
                break;
            }

            int num = Integer.parseInt(command);
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = num;
        }

        System.out.println(max);
    }
}
