public class Clock 
{
    public static void main(String[] args) 
    {
        for (int h = 0; h <= 23; h++)
        {
            for (int m = 0; m < 60; m++)
            {
                System.out.println(h + ":" + m);
            }
        }
    }
}
