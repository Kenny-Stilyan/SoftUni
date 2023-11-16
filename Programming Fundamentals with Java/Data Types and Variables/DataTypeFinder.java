import java.util.Scanner;

public class DataTypeFinder 
{
    private static String findDataType(String input) 
    {
        if (isInteger(input))
        {
            return "Integer";
        }
        else if (isFloatingPoint(input))
        {
            return "Floating point";
        }
        else if (isBoolean(input))
        {
            return "Boolean";
        }
        else if (isCharacter(input))
        {
            return "Character";
        }
        else
        {
            return "String";
        }
    }

    private static boolean isInteger(String input)
    {
        try
        {
            Integer.parseInt(input);
            return true;
        } 
        catch (NumberFormatException ex)
        {
            return false;
        }
    }

    private static boolean isFloatingPoint(String input)
    {
        try
        {
            Double.parseDouble(input);
            return true;
        } 
        catch (NumberFormatException ex)
        {
            return false;
        }
    }

    private static boolean isBoolean(String input)
    {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }

    private static boolean isCharacter(String input)
    {
        return input.length() == 1;
    }

    public static void main(String[] args) 
    {
        Scanner inputScanner = new Scanner(System.in);

        while (true) 
        {
            String input = inputScanner.nextLine();

            if (input.equalsIgnoreCase("END")) 
            {
                break;
            }

            String dataType = findDataType(input);
            System.out.println(input + " is " + dataType.toLowerCase() + " type");
        }
    }
}
