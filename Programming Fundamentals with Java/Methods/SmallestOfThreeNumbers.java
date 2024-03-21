import java.util.Scanner;

public class SmallestOfThreeNumbers 
{
    public static int getSmallestNum(int smallestNum, int num)
    {
        if (num < smallestNum)
        {
            return num;
        }
        return smallestNum;
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        int smallestNum = Integer.MAX_VALUE;
        for (int i = 0; i < 3; i++)
        {
            int num = Integer.parseInt(input.nextLine());
            smallestNum = getSmallestNum(smallestNum, num);
        }

        System.out.println(smallestNum);
    }
}
