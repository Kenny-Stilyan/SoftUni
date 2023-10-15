import java.util.Scanner;

public class yard_greening
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double kvm = Double.parseDouble(input.nextLine());

        double price = kvm * 7.61;
        double discount = 0.18 * price;
        double discounted_price = price - discount;

        System.out.printf("The final price is: %.2f lv.%n", discounted_price);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
