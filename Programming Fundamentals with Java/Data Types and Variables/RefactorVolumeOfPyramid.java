import java.util.Scanner;

public class RefactorVolumeOfPyramid 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double length, sh, V;

        System.out.print("Length: ");
        length = Double.parseDouble(input.nextLine());

        System.out.print("Width: ");
        sh = Double.parseDouble(input.nextLine());

        System.out.print("Height: ");
        V = Double.parseDouble(input.nextLine());

        V = (length * sh * V) / 3;
        System.out.printf("Pyramid Volume: %.2f", V);
    }
}
