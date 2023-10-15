import java.util.Scanner;

public class AnimalType 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        String animal = input.nextLine();
        String animal_type = "";

        switch (animal)
        {
            case "dog":
            {
                animal_type = "mammal";
                break;
            }
            case "crocodile":
            case "tortoise":
            case "snake":
            {
                animal_type = "reptile";
                break;
            }
            default:
            {
                animal_type = "unknown";
            }
        }

        System.out.println(animal_type);
    }
}
