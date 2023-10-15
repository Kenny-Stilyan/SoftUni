import java.util.Scanner;

public class pet_shop 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int dog = Integer.parseInt(input.nextLine());
        int cat = Integer.parseInt(input.nextLine());

        double sum = dog * 2.5 + cat * 4;
        System.out.printf("%.1f lv." , sum);
    }
}
