import java.util.Scanner;

public class SpiceMustFlow 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int yield = input.nextInt();

        int days = 0;
        int total = 0;

        if (yield < 100){
            System.out.println(days);
            if (yield > 26)
            {
                total = yield - 26;
            }
            System.out.println(total);
        }
        else
        {
            while (yield >= 100)
            {
                days++;
                total += yield-26;
                yield-=10;
            }

            total -= 26;

            System.out.println(days);
            System.out.println(total);
        }
    }
}
