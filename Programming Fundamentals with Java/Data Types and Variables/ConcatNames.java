import java.util.Scanner;

public class ConcatNames 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String pointer = input.nextLine();

        System.out.printf("%s%s%s", name1, pointer, name2);
    }
}
