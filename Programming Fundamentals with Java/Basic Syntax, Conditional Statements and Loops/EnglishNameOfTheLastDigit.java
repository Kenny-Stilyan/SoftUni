import java.util.Scanner;

public class EnglishNameOfTheLastDigit 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num = Integer.parseInt(input.nextLine());

        String[] digitNames = {
            "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
        };

        int lastDigit = num % 10;
        System.out.println(digitNames[lastDigit]);
    }
}
