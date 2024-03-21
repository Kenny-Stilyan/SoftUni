import java.util.Arrays;
import java.util.Scanner;

public class ZigZagArrays 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        int[] zig = new int[n];
        int[] zag = new int[n];

        for (int i = 0; i < n; i++)
        {
            int[] nums = Arrays.stream(input.nextLine().split(" "))
                                .mapToInt(num -> Integer.parseInt(num))
                                .toArray();

            if (i % 2 == 0)
            {
                zig[i] = nums[0];
                zag[i] = nums[1];
            }
            else
            {
                zig[i] = nums[1];
                zag[i] = nums[0];
            }
        }

        System.out.println(Arrays.toString(zig).replace("[", "").replace(",", "").replace("]", ""));
        System.out.println(Arrays.toString(zag).replace("[", "").replace(",", "").replace("]", ""));
    }
}
