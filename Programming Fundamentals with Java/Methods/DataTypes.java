import java.util.Scanner;

public class DataTypes 
{
    public static int dataInt(String data)
    {
        int num = Integer.parseInt(data);
        return num * 2;
    }
    public static double dataDouble(String data)
    {
        double num = Double.parseDouble(data);
        return num * 1.5;
    }
    public static String dataStr(String data)
    {
        return "$" + data + "$";
    }
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String type = input.nextLine();
        String data = input.nextLine();

        switch (type) 
        {
            case "int":
                System.out.println(dataInt(data));
                break;
            case "real":
                System.out.printf("%.2f", dataDouble(data));
                break;
            case "string":
                System.out.println(dataStr(data));
                break;
            default:
                break;
        }
    }
}
