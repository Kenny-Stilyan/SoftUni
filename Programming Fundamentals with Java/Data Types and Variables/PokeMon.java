import java.util.Scanner;

public class PokeMon
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int pokePower = Integer.parseInt(input.nextLine());
        int distanceBetweenTargets = Integer.parseInt(input.nextLine());
        int exhaustionFactor = Integer.parseInt(input.nextLine());

        int originalPokePower = pokePower;
        int pokesCount = 0;

        while (pokePower >= distanceBetweenTargets) 
        {
            pokePower -= distanceBetweenTargets;
            pokesCount++;

            if (pokePower == originalPokePower * 0.5 && exhaustionFactor != 0) 
            {
                pokePower /= exhaustionFactor;
            }
        }

        System.out.println(pokePower);
        System.out.println(pokesCount);
    }
}
