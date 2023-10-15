import java.util.Scanner;

public class TradeCommissions 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String city = input.nextLine();
        double sales = input.nextDouble();

        boolean parameter = true;
        double commission = 0.0;

        switch (city)
        {
            case "Sofia":
            {
                if (0 <= sales && sales <= 500)
                {
                    commission = 0.05;
                }
                else if (sales <= 1000)
                {
                    commission = 0.07;
                }
                else if (sales <= 10_000)
                {
                    commission = 0.08;
                }
                else if (sales > 10_000)
                {
                    commission = 0.12;
                }
                else
                {
                    parameter = false;
                }
                break;
            }
            case "Varna":
            {
                if (0 <= sales && sales <= 500)
                {
                    commission = 0.045;
                }
                else if (sales <= 1000)
                {
                    commission = 0.075;
                }
                else if (sales <= 10_000)
                {
                    commission = 0.1;
                }
                else if (sales > 10_000)
                {
                    commission = 0.13;
                }
                else
                {
                    parameter = false;
                }
                break;
            }
            case "Plovdiv":
            {
                if (0 <= sales && sales <= 500)
                {
                    commission = 0.055;
                }
                else if (sales <= 1000)
                {
                    commission = 0.08;
                }
                else if (sales <= 10_000)
                {
                    commission = 0.12;
                }
                else if (sales > 10_000)
                {
                    commission = 0.145;
                }
                else
                {
                    parameter = false;
                }
                break;
            }
            default:
            {
                parameter = false;
            }
        }

        if (parameter && sales >= 0)
        {
            System.out.printf("%.2f", sales * commission);
        }
        else
        {
            System.out.println("error");
        }
    }
}
