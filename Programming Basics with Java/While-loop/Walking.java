import java.util.Scanner;

public class Walking 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int goal = 10_000;
        int steps_taken = 0;

        while (true)
        {
            String command = input.nextLine();

            if (command.equals("Going home"))
            {
                steps_taken += Integer.parseInt(input.nextLine());
                if (steps_taken >= goal)
                {
                    int diff = steps_taken - goal;
                    System.out.println("Goal reached! Good job!");
                    System.out.printf("%d steps over the goal!", diff);
                    break;
                }
                else
                {
                    int diff = Math.abs(steps_taken - goal);
                    System.out.printf("%d more steps to reach goal.", diff);
                    break;
                }
            }

            int steps = Integer.parseInt(command);
            steps_taken += steps;

            if (steps_taken >= goal)
            {
                int diff = steps_taken - goal;
                System.out.println("Goal reached! Good job!");
                System.out.printf("%d steps over the goal!", diff);
                break;
            }
        }
    }
}
