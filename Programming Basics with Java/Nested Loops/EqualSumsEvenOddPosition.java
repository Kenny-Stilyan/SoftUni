import java.util.Scanner;

public class EqualSumsEvenOddPosition 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int num1 = Integer.parseInt(input.nextLine());
        int num2 = Integer.parseInt(input.nextLine());

        for (int i = num1; i <= num2; i++) 
        {
            int evenSum = 0;
            int oddSum = 0;
            String number = String.valueOf(i);

            for (int j = 0; j < number.length(); j++) 
            {
                int digit = Character.getNumericValue(number.charAt(j));

                if (j % 2 == 0) 
                {
                    evenSum += digit;
                } 
                else 
                {
                    oddSum += digit;
                }
            }

            if (evenSum == oddSum) 
            {
                System.out.print(i + " ");
            }
        }
    }
}
