import java.util.Scanner;

public class DepositCalculator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double depozit = Double.parseDouble(input.nextLine());
        int quarter = Integer.parseInt(input.nextLine());
        double procent = Double.parseDouble(input.nextLine());

        double sum = depozit + quarter * ((depozit * (procent / 100)) / 12);
        System.out.println(sum);
    }
}
