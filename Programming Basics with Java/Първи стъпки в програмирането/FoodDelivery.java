import java.util.Scanner;

public class FoodDelivery 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int chicken = input.nextInt();
        int fish = input.nextInt();
        int vegan = input.nextInt();

        double sum = (chicken * 10.35) + (fish * 12.4) + (vegan * 8.15);
        double desert = sum * 0.2;
        double total = sum + desert + 2.5;

        System.out.println(total);
    }
}
