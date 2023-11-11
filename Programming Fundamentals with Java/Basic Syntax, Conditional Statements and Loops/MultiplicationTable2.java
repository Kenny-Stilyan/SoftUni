import java.util.Scanner;

public class MultiplicationTable2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int index = input.nextInt();

        while (true)
        {
            System.out.printf("%d X %d = %d%n", n, index, (int) n * index);
            index++;
            if (index > 10)
            {
                break;
            }
        }
    }
}
