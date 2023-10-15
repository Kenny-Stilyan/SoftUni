import java.util.Scanner;

public class PersonalTitles 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double age = input.nextDouble();
        input.nextLine(); // Consume the newline character
        String sex =  input.nextLine();
        String parameter = "";

        if (sex.equals("m"))
        {
            if (age < 16)
            {
                parameter = "Master";
            }
            else
            {
                parameter = "Mr.";
            }
        }
        else if (sex.equals("f"))
        {
            if (age < 16)
            {
                parameter = "Miss";
            }
            else
            {
                parameter = "Ms.";
            }
        }

        System.out.println(parameter);
    }
}
