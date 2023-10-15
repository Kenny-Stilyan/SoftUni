import java.util.Scanner;

public class projects_creation 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        int projects = Integer.parseInt(input.nextLine());

        int hours = projects * 3;
        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hours, projects);
    }
}
