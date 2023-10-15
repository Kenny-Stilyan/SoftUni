import java.util.Scanner;

public class InvalidNumber 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();

        if ((100 > num || num > 200) && num != 0)
        {
            System.out.println("invalid");
        }
    }
}
