import java.util.Scanner;

public class VacationBooksList 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int pages = Integer.parseInt(input.nextLine());
        int reading_speed = Integer.parseInt(input.nextLine());
        int time_frame = Integer.parseInt(input.nextLine());

        int reading_hours_per_day = (pages / reading_speed) / time_frame;
        System.out.println(reading_hours_per_day);
    }
}
