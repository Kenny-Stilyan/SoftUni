import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation 
{
    private static void rotateArray(int[] arr, int rotations) 
    {
        int length = arr.length;

        // Adjust the number of rotations if it's greater than the array size
        rotations = rotations % length;

        // Create a temporary array to store the rotated elements
        int[] temp = new int[length];

        // Perform the rotation
        for (int i = 0; i < length; i++) 
        {
            temp[(i - rotations + length) % length] = arr[i];
        }

        // Copy the rotated array back to the original array
        System.arraycopy(temp, 0, arr, 0, length);
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int[] numbers = Arrays.stream(input.nextLine().split(" "))
                                .mapToInt(num -> Integer.parseInt(num))
                                .toArray();

        int n = Integer.parseInt(input.nextLine());

        rotateArray(numbers, n);
        for (int num : numbers)
        {
            System.out.print(num + " ");
        }
    }
}
