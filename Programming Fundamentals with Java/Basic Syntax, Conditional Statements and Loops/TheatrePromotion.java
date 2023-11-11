import java.util.Scanner;

public class TheatrePromotion 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String type_day = input.nextLine();
        int age = Integer.parseInt(input.nextLine());

        boolean flag = true;
        int price = 0;

        switch (type_day)
        {
            case "Weekday":
            {
                if (age < 0)
                {
                    flag = false;
                    break;
                }

                if ( 0 <= age && age <= 18)
                {
                    price = 12;
                }
                else if (age <= 64)
                {
                    price = 18;
                }
                else if (age <= 122)
                {
                    price = 12;
                }
                else
                {
                    flag = false;
                }
                break;
            }
            case "Weekend":
            {
                if (age < 0)
                {
                    flag = false;
                    break;
                }

                if ( 0 <= age && age <= 18)
                {
                    price = 15;
                }
                else if (age <= 64)
                {
                    price = 20;
                }
                else if (age <= 122)
                {
                    price = 15;
                }
                else
                {
                    flag = false;
                }
                break;
            }
            case "Holiday":
            {
                if (age < 0)
                {
                    flag = false;
                    break;
                }

                if ( 0 <= age && age <= 18)
                {
                    price = 5;
                }
                else if (age <= 64)
                {
                    price = 12;
                }
                else if (age <= 122)
                {
                    price = 10;
                }
                else
                {
                    flag = false;
                }
                break;
            }
            default:
            {
                flag = false;
                break;
            }
        }

        if (flag)
        {
            System.out.println(price + "$");
        }
        else
        {
            System.out.println("Error!");
        }
    }
}
