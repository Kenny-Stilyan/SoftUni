import java.util.Scanner;

public class TribonacciSequence 
{
    private static void printTribonacciSequence(int num) 
    {
        int[] tribonacci = new int[num];

        tribonacci[0] = 1;
        tribonacci[1] = 1;
        tribonacci[2] = 2;

        for (int i = 3; i < num; i++) 
        {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }

        for (int i = 0; i < num; i++) 
        {
            System.out.print(tribonacci[i] + " ");
        }
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        printTribonacciSequence(num);
    }
}
