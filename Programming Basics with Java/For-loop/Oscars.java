import java.util.Scanner;

public class Oscars 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String actor = input.nextLine();
        double points = Double.parseDouble(input.nextLine());
        int n = Integer.parseInt(input.nextLine());

        for (int i = 0; i < n; i++)
        {
            if (points > 1250.5)
            {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, points);
                break;
            }
            String judge = input.nextLine();
            double judge_points = Double.parseDouble(input.nextLine());

            points += (judge.length() * judge_points) / 2;
        }

        if (points < 1250.5)
        {
            System.out.printf("Sorry, %s you need %.1f more!", actor, Math.abs(1250.5 - points));
        }
    }
}
