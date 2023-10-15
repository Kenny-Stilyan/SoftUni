import java.util.Scanner;

public class inches_to_centimeters 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double inch = Double.parseDouble(input.nextLine());

        double cm = inch * 2.54;
        System.out.println(cm);

    }
}
