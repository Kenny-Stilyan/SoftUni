import java.util.Scanner;

public class EvenPowersOf2 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 0; i <= num; i += 2)
        {
            int result = (int) Math.pow(2, i);
            System.out.println(result);
        }
    }
}
