import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int juryCount = Integer.parseInt(input.nextLine());
        String presentationName = input.nextLine();

        double totalAverageGrade = 0;
        int presentationCount = 0;

        while (!presentationName.equals("Finish")) 
        {
            double sumGrades = 0;

            for (int i = 0; i < juryCount; i++) 
            {
                double grade = Double.parseDouble(input.nextLine());
                sumGrades += grade;
            }

            double averageGrade = sumGrades / juryCount;
            totalAverageGrade += averageGrade;
            presentationCount++;

            System.out.printf("%s - %.2f.%n", presentationName, averageGrade);
            presentationName = input.nextLine();
        }

        double finalAssessment = totalAverageGrade / presentationCount;
        System.out.printf("Student's final assessment is %.2f.", finalAssessment);
    }
}
