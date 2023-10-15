import java.util.Scanner;

public class Moving 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int width_apartmen = Integer.parseInt(input.nextLine());
        int length_apartmen = Integer.parseInt(input.nextLine());
        int height_apartmen = Integer.parseInt(input.nextLine());

        int apartmen_size = width_apartmen * length_apartmen * height_apartmen;

        while (true)
        {
            String command = input.nextLine();
            if (command.equals("Done"))
            {
                System.out.printf("%d Cubic meters left.", apartmen_size);
                break;
            }

            int boxes = Integer.parseInt(command);
            apartmen_size -= boxes;
            if (apartmen_size < 0)
            {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(apartmen_size));
                break;
            }
        }
    }
}
