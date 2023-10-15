import java.util.Scanner;

public class SuppliesForSchool 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int pen = input.nextInt();
        int marker = input.nextInt();
        int cleaner = input.nextInt();
        int procent = input.nextInt();

        double price = (pen * 5.8) + (marker * 7.2) + (cleaner * 1.2);
        double procent_off = procent / 100.0;
        double discounted_price = price - (price * procent_off);

        System.out.println(discounted_price);
    }
}
