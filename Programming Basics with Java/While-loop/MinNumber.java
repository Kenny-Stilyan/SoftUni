import java.util.Arrays;
import java.util.Scanner;

public class MinNumber
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int[] arr = {};
        int min = 0;

        while (true)
        {
            String command = input.nextLine();

            if (command.equals("Stop"))
            {
                Arrays.sort(arr);
                min = arr[0];
                break;
            }

            int num = Integer.parseInt(command);
            arr = Arrays.copyOf(arr, arr.length + 1);
            arr[arr.length - 1] = num;
        }

        System.out.println(min);
    }
}
