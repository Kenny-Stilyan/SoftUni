import java.util.Scanner;

public class NewHouse 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String flower = input.nextLine();
        int num_flowers = input.nextInt();
        double budget = input.nextDouble();

        double flower_price = 0.0;
        double flower_discount = 0.0;

        switch (flower)
        {
            case "Roses":
            {
                if (num_flowers > 80)
                {
                    flower_discount = 0.1;
                }
                flower_price = 5;
                break;
            }
            case "Dahlias":
            {
                if (num_flowers > 90)
                {
                    flower_discount = 0.15;
                }
                flower_price = 3.8;
                break;
            }
            case "Tulips":
            {
                if (num_flowers > 80)
                {
                    flower_discount = 0.15;
                }
                flower_price = 2.8;
                break;
            }
            case "Narcissus":
            {
                if (num_flowers < 120)
                {
                    flower_discount = 1.15;
                }
                flower_price = 3;
                break;
            }
            case "Gladiolus":
            {
                if (num_flowers < 80)
                {
                    flower_discount = 1.2;
                }
                flower_price = 2.5;
                break;
            }
        }

        double price = (flower_price * num_flowers);
        if (flower_discount != 0.0 && flower_discount > 1.0)
        {
            price *= flower_discount;
        }
        else if (flower_discount != 0.0 && flower_discount < 1.0)
        {
            price = price - (price * flower_discount);
        }

        double diff = budget - price;
        if (diff < 0)
        {
            System.out.printf("Not enough money, you need %.2f leva more.", Math.abs(diff));
        }
        else
        {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num_flowers, flower, diff);
        }
    }
}
