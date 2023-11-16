import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class BeerKegs 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());

        Dictionary<String, Double> beer = new Hashtable<>();
        for (int i = 0; i < n; i++)
        {
            String model = input.nextLine();
            Double radius = Double.parseDouble(input.nextLine());
            int height = Integer.parseInt(input.nextLine());

            double volume = Math.PI * radius * radius * height;
            beer.put(model, volume);
        }

        String maxKey = null;
        Double maxValue = Double.MIN_VALUE;
        Enumeration<String> keys = beer.keys();

        while (keys.hasMoreElements()) 
        {
            String key = keys.nextElement();
            Double value = beer.get(key);

            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            }
        }

        System.out.println(maxKey);
    }
}
