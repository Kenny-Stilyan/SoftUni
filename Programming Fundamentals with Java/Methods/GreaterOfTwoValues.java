import java.util.Scanner;

public class GreaterOfTwoValues 
{
    public static int getMax(int a, int b)
    {
        if (a > b)
        {
            return a;
        }

        return b;
    }
    public static char getMax(char a, char b)
    {
        if ((int) a > (int) b)
        {
            return a;
        }

        return b;
    }
    public static String getMax(String a, String b)
    {
        if (a.compareTo(b) >= 0)
        {
            return a;
        }

        return b;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String type = input.nextLine();

        if (type.equalsIgnoreCase("int"))
        {
            System.out.println(getMax(Integer.parseInt(input.nextLine()), Integer.parseInt(input.nextLine())));
        }
        else if (type.equalsIgnoreCase("char"))
        {
            System.out.println(getMax(input.next().charAt(0), input.next().charAt(0)));
        }
        else if (type.equalsIgnoreCase("String"))
        {
            System.out.println(getMax(input.nextLine(), input.nextLine()));
        }
    }
}