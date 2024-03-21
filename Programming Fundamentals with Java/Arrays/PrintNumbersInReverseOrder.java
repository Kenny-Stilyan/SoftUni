import java.util.Scanner;

public class PrintNumbersInReverseOrder 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        Integer[] numbers = new Integer[n];

        for (int i = n - 1; i >= 0; i--)
        {
            int num = Integer.parseInt(input.nextLine());
            numbers[i] = num;
        }


        for (Integer num : numbers)
        {
            System.out.print(num + " ");
        }
    }
}
