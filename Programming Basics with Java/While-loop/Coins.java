import java.util.Scanner;

public class Coins 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
 
        double change = Double.parseDouble(input.nextLine());
        change = Math.floor(change * 100);
        int coins = 0;
 
        while (change > 0)
        {
            if (change >= 200) // 2lv
            {
                coins ++;
                change -= 200;
            }
            else if (change >= 100) // 1lv
            {
                coins ++;
                change -=100;
            }
            else if (change >= 50) // 50st
            {
                coins ++;
                change -= 50;
            }
            else if (change >= 20) // 20st
            {
                coins ++;
                change -= 20;
            }
            else if (change >= 10) // 10st
            {
                coins ++;
                change -=10;
            }
            else if (change >= 5) // 5st
            {
                coins ++;
                change -=5;
            }
            else if (change >= 2) // 2st
            {
                coins++;
                change -= 2;
            }
            else if(change >= 1) // 1st
            {
                coins++;
                change -= 1;
            }
        }

        System.out.println(coins);
    }
}

