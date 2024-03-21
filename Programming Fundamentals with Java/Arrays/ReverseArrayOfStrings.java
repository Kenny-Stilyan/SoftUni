import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArrayOfStrings 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String[] arr = Arrays.stream(input.nextLine().split(" "))
                            .toArray(String[]::new);

        Collections.reverse(Arrays.asList(arr));
        for (String text : arr)
        {
            System.out.print(text + " ");
        }
    }
}
