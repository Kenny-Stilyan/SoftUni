import java.util.Scanner;

public class rectangle_area 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());

        int area = a * b;
        System.out.println(area);
    }
}
