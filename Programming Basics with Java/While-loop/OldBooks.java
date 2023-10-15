import java.util.Scanner;

public class OldBooks 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String book_name = input.nextLine();

        int count = 0;

        while (true)
        {
            String book = input.nextLine();

            if (book.equals(book_name))
            {
                System.out.printf("You checked %d books and found it.", count);
                break;
            }
            else if (book.equals("No More Books"))
            {
                System.out.println("The book you search is not here!");
                System.out.printf("You checked %d books.", count);
                break;
            }

            count += 1;
        }
    }
}
