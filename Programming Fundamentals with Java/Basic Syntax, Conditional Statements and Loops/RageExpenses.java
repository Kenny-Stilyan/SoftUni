import java.util.Scanner;

public class RageExpenses 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int gameLost = Integer.parseInt(input.nextLine());
        double priceHeadset  = Double.parseDouble(input.nextLine());
        double priceMouse  = Double.parseDouble(input.nextLine());
        double priceKeyboard  = Double.parseDouble(input.nextLine());
        double priceDisplay  = Double.parseDouble(input.nextLine());

        int headset = 0;
        int mouse = 0;
        int keyboard = 0;
        int display = 0;

        for (int i = 1; i <= gameLost; i++)
        {
            if (i % 2 == 0 && i % 3 == 0)
            {
                headset++;
                mouse++;
                keyboard++;

                if (keyboard % 2 == 0)
                {
                    display++;
                }
            }
            else if (i % 2 == 0)
            {
                headset++;
            }
            else if (i % 3 == 0)
            {
                mouse++;
            }
        }

        double total = (headset * priceHeadset) + (mouse * priceMouse) + (keyboard * priceKeyboard) + (display * priceDisplay);
        System.out.printf("Rage expenses: %.2f lv.", total);
    }
}
