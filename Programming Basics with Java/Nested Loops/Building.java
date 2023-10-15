import java.util.Scanner;

public class Building 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int levels = Integer.parseInt(input.nextLine());
        int rooms = Integer.parseInt(input.nextLine());

        for (int level = levels; level >= 1 && level <= levels; level--)
        {
            for (int room = 0; room < rooms; room++)
            {
                if (level == levels)
                {
                    System.out.print("L" + level + room + " ");
                }
                else if (level % 2 != 0)
                {
                    System.out.print("A" + level + room + " ");
                }
                else if (level % 2 == 0)
                {
                    System.out.print("O" + level + room + " ");
                }
            }

            System.out.println();
        }
    }
}
