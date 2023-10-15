import java.util.Scanner;

public class FruitOrVegetable 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String product = input.nextLine();
        String parameter = "";

        switch (product)
        {
            case "banana":
            case "apple":
            case "kiwi":
            case "cherry":
            case "lemon":
            case "grapes":
            {
                parameter = "fruit";
                break;
            }
            case "tomato":
            case "cucumber":
            case "pepper":
            case "carrot":
            {
                parameter = "vegetable";
                break;
            }
            default:
            {
                parameter = "unknown";
            }
        }

        System.out.println(parameter);
    }
}
