import java.util.Scanner;

public class BasketballEquipment 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int tranning_price = input.nextInt();

        double shoes = tranning_price - (tranning_price * 0.4);
        double outfit = shoes - (shoes * 0.2);
        double ball = outfit / 4.0;
        double accessories = ball / 5.0;

        double sum = tranning_price + shoes + outfit + ball + accessories;
        System.out.println(sum);
    }
}
