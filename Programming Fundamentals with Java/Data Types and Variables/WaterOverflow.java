import java.util.Scanner;

public class WaterOverflow 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        
        int capacity = 0;
        for (int i = 0; i < n; i++)
        {
            int num = Integer.parseInt(input.nextLine());
            capacity += num;
            if (capacity > 255)
            {
                capacity -= num;
                System.out.println("Insufficient capacity!");
            }
        }

        System.out.println(capacity);
    }
}
