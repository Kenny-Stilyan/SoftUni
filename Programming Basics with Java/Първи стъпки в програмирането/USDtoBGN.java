import java.util.Scanner;

public class USDtoBGN 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double usd = Double.parseDouble(input.nextLine());
        double bgn = usd * 1.79549;

        System.out.println(bgn);
    }
}
