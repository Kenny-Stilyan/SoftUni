import java.util.Scanner;

public class Repainting 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int nylon = input.nextInt() + 2;
        int paint = input.nextInt();
        int razreditel = input.nextInt();
        int hours = input.nextInt();

        double sum_material = (nylon * 1.5) + ((paint * 1.1) * 14.5) + (razreditel * 5.0) + 0.4;
        double sum_workman = (sum_material * 0.3) * hours;
        double total = sum_material + sum_workman;

        System.out.println(total);
    }
}
