package Checks;
import java.util.Scanner;

public class WorldSwimmingRecord 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        double record_sec = input.nextDouble();
        double distance_meters = input.nextDouble();
        double sec_for_1m = input.nextDouble();

        double travel_time = (distance_meters * sec_for_1m) + (Math.floor(distance_meters / 15) * 12.5);
        
        if (record_sec > travel_time)
        {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", travel_time);
        }
        else
        {
            double diff = travel_time - record_sec;
            System.out.printf("No, he failed! He was %.2f seconds slower.", diff);
        }
    }
}
