import java.util.Scanner;

public class concatenate_data 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String first_name = input.nextLine();
        String last_name = input.nextLine();
        int age = Integer.parseInt(input.nextLine());
        String town = input.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", first_name, last_name, age, town);
    }
}
