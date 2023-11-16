import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Snowballs 
{
    static class Snowball 
    {
        private int snow;
        private int time;
        private int quality;
        private int value;

        public Snowball(int snow, int time, int quality, int value) 
        {
            this.snow = snow;
            this.time = time;
            this.quality = quality;
            this.value = value;
        }

        @Override
        public String toString() 
        {
            return String.format("%d : %d = %d (%d)", snow, time, value, quality);
        }
    }

    private static Snowball findBestSnowball(List<Snowball> snowballs) 
    {
        Snowball bestSnowball = null;
        int maxValue = Integer.MIN_VALUE;

        for (Snowball snowball : snowballs) 
        {
            if (snowball.value > maxValue) 
            {
                maxValue = snowball.value;
                bestSnowball = snowball;
            }
        }

        return bestSnowball;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        List<Snowball> snowballs = new ArrayList<>();

        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(input.nextLine());
            int snowballTime = Integer.parseInt(input.nextLine());
            int snowballQuality = Integer.parseInt(input.nextLine());

            double snowballValue = Math.pow((double) snowballSnow / snowballTime, snowballQuality);
            int snowballValueInt = (int) snowballValue;

            Snowball snowball = new Snowball(snowballSnow, snowballTime, snowballQuality, snowballValueInt);
            snowballs.add(snowball);
        }

        Snowball bestSnowball = findBestSnowball(snowballs);
        if (bestSnowball != null)
        {
            System.out.println(bestSnowball.toString());
        }
    }
}
