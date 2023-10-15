import java.util.Scanner;

public class Cake 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int length_cake = Integer.parseInt(input.nextLine());
        int width_cake = Integer.parseInt(input.nextLine());

        int cake_pieces = length_cake * width_cake;

        while (true)
        {
            String command = input.nextLine();

            if (command.equals("STOP"))
            {
                System.out.printf("%d pieces are left.", cake_pieces);
                break;
            }

            int cake = Integer.parseInt(command);
            cake_pieces -= cake;

            if (cake_pieces < 0)
            {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cake_pieces));
                break;
            }
        }
    }
}
