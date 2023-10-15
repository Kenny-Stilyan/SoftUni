import java.util.Scanner;

public class Salary 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int tabs = Integer.parseInt(input.nextLine());
        int salary = Integer.parseInt(input.nextLine());

        for (int i = 0; i < tabs; i++)
        {
            if (salary <= 0)
            {
                System.out.println("You have lost your salary.");
                break;
            }

            String text = input.nextLine();

            if (text.equals("Facebook"))
            {
                salary -= 150;
            }
            else if (text.equals("Instagram"))
            {
                salary -= 100;
            }
            else if (text.equals("Reddit"))
            {
                salary -= 50;
            }
        }

        if (salary > 0)
        {
            System.out.println(salary);
        }
    }
}
