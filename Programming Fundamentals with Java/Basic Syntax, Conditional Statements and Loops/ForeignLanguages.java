import java.util.Scanner;

public class ForeignLanguages 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String country = input.nextLine();
        String language = "";

        switch (country)
        {
            case "England":
            case "USA":
            {
                language = "English";
                break;
            }
            case "Spain":
            case "Argentina":
            case "Mexico":
            {
                language = "Spanish";
                break;
            }
            default:
            {
                language =  "unknown";
                break;
            }
        }

        System.out.println(language);
    }
}
