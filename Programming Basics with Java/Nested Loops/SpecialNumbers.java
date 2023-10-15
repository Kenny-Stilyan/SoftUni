import java.util.Scanner;

public class SpecialNumbers
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
    
        int N = input.nextInt();
    
        for (int num = 1111; num <= 9999; num++) 
        {
            String numStr = Integer.toString(num);
            boolean isSpecial = true;
    
            for (char digitChar : numStr.toCharArray()) 
            {
                int digit = Character.getNumericValue(digitChar);
                if (digit == 0 || N % digit != 0) 
                {
                    isSpecial = false;
                    break;
                }
            }

            if (isSpecial)
            {
                System.out.print(num + " ");
            }
        }
    }
}
