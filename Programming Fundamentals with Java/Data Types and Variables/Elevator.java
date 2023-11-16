import java.util.Scanner;

public class Elevator 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int people = input.nextInt();
        int capacity  = input.nextInt();

        int trips = people / capacity;
        if (people % capacity != 0)
        {
            trips++;
        }

        System.out.println(trips);
    }
}
