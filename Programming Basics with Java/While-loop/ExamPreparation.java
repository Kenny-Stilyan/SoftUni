import java.util.Arrays;
import java.util.Scanner;

public class ExamPreparation 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int max_fails = Integer.parseInt(input.nextLine());

        String[] problems = {};
        double[] grades = {};

        boolean isEnough = true;

        double sum = 0.0;
        int fails = 0;

        while (isEnough)
        {
            String problem_command = input.nextLine();

            if (problem_command.equals("Enough"))
            {
                isEnough = false;
                break;
            }

            double grade = Double.parseDouble(input.nextLine());

            problems = Arrays.copyOf(problems, problems.length + 1);
            grades = Arrays.copyOf(grades, grades.length + 1);

            problems[problems.length - 1] = problem_command;
            grades[grades.length - 1] = grade;

            if (grade <= 4.0)
            {
                fails += 1;
            }

            if (fails == max_fails)
            {
                System.out.printf("You need a break, %d poor grades.", fails);
                break;
            }
        }

        if (!isEnough)
        {
            for (int i = 0; i < grades.length; i++)
                {
                    sum += grades[i];
                }

                double avg = sum / grades.length;
                String last_problem = problems[problems.length - 1];

                System.out.printf("Average score: %.2f\n", avg);
                System.out.printf("Number of problems: %d\n", problems.length);
                System.out.printf("Last problem: %s\n", last_problem);
        }
    }
}
