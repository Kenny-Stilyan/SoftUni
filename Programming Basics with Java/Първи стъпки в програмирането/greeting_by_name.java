import java.util.Scanner;

public class greeting_by_name 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
