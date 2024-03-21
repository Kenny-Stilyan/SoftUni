import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders 
{
    public static double orderPrice(Map<String, Double> productsPrices, String product, int quantity)
    {
        if (productsPrices.containsKey(product))
        {
            return (productsPrices.get(product) * quantity);
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        Map<String, Double> productsPrices = new HashMap<>();
        productsPrices.put("coffee", 1.50);
        productsPrices.put("water", 1.00);
        productsPrices.put("coke", 1.40);
        productsPrices.put("snacks", 2.00);

        String product = input.nextLine();
        int quantity = Integer.parseInt(input.nextLine());

        double result = orderPrice(productsPrices, product, quantity);
        System.out.printf("%.2f", result);
    }
}
