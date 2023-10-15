import java.util.Scanner;

public class Numbers1NWithStep3 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        for (int i = 1; i <= num; i += 3)
        {
            System.out.println(i);
        }
    }
}
