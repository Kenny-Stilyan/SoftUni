import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class CommonElements 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String[] arr1 = Arrays.stream(input.nextLine().split(" "))
                                .toArray(String[]::new);
        String[] arr2 = Arrays.stream(input.nextLine().split(" "))
                                .toArray(String[]::new);

        HashSet<String> set = new HashSet<>();
        for (String str : arr1)
        {
            set.add(str);
        }

        for (String str : arr2)
        {
            if (set.contains(str))
            {
                System.out.print(str + " ");
            }
        }
    }
}
