import java.util.Scanner;

public class ReverseString 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String text = input.nextLine();
        String reverseString = new StringBuffer(text).reverse().toString();

        System.out.println(reverseString);
    }
}
