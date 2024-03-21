import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayManipulator {

    private static ArrayList<Integer> exchange(ArrayList<Integer> array, int index) 
    {
        if (index < 0 || index >= array.size()) 
        {
            System.out.println("Invalid index");
            return array;
        }

        ArrayList<Integer> resultArray = new ArrayList<>();

        for (int i = index + 1; i < array.size(); i++) 
        {
            resultArray.add(array.get(i));
        }

        for (int i = 0; i <= index; i++) 
        {
            resultArray.add(array.get(i));
        }

        return resultArray;
    }

    private static void findMaxIndex(ArrayList<Integer> array, String type) 
    {
        int maxIndex = -1;

        if (type.equals("even")) 
        {
            for (int i = array.size() - 1; i >= 0; i--) 
            {
                if (array.get(i) % 2 == 0 && (maxIndex == -1 || 
                    array.get(i) >= array.get(maxIndex))) 
                {
                    maxIndex = i;
                }
            }
        } 
        else if (type.equals("odd")) 
        {
            for (int i = array.size() - 1; i >= 0; i--) 
            {
                if (array.get(i) % 2 != 0 && (maxIndex == -1 || array.get(i) >= array.get(maxIndex))) 
                {
                    maxIndex = i;
                }
            }
        }

        if (maxIndex == -1) 
        {
            System.out.println("No matches");
        } 
        else 
        {
            System.out.println(maxIndex);
        }
    }

    private static void findMinIndex(ArrayList<Integer> array, String type) 
    {
        int minIndex = -1;

        if (type.equals("even")) 
        {
            for (int i = array.size() - 1; i >= 0; i--) 
            {
                if (array.get(i) % 2 == 0 && (minIndex == -1 || array.get(i) <= array.get(minIndex))) 
                {
                    minIndex = i;
                }
            }
        } 
        else if (type.equals("odd")) 
        {
            for (int i = array.size() - 1; i >= 0; i--) 
            {
                if (array.get(i) % 2 != 0 && (minIndex == -1 || array.get(i) <= array.get(minIndex))) 
                {
                    minIndex = i;
                }
            }
        }

        if (minIndex == -1) 
        {
            System.out.println("No matches");
        } 
        else 
        {
            System.out.println(minIndex);
        }
    }

    private static void printFirstElements(ArrayList<Integer> array, int count, String type) 
    {
        if (count < 0 || count > array.size()) 
        {
            System.out.println("Invalid count");
            return;
        }

        ArrayList<Integer> resultArray = new ArrayList<>();

        for (Integer value : array) 
        {
            if ((type.equals("even") && value % 2 == 0) || 
                (type.equals("odd") && value % 2 != 0)) 
            {
                resultArray.add(value);
                if (resultArray.size() == count) 
                {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(resultArray.toArray()));
    }

    private static void printLastElements(ArrayList<Integer> array, int count, String type) 
    {
        if (count < 0 || count > array.size()) 
        {
            System.out.println("Invalid count");
            return;
        }

        ArrayList<Integer> resultArray = new ArrayList<>();

        for (int i = array.size() - 1; i >= 0; i--) 
        {
            if ((type.equals("even") && array.get(i) % 2 == 0) || 
                (type.equals("odd") && array.get(i) % 2 != 0)) 
            {
                resultArray.add(array.get(i));
                if (resultArray.size() == count) 
                {
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(resultArray.toArray()));
    }

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> array = new ArrayList<>();
        Arrays.stream(input.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(array::add);

        while (true) 
        {
            String command = input.nextLine();
            if (command.equals("end")) 
            {
                break;
            }

            String[] tokens = command.split("\\s+");
            String action = tokens[0];

            switch (action) 
            {
                case "exchange":
                    int index = Integer.parseInt(tokens[1]);
                    array = exchange(array, index);
                    break;
                case "max":
                    String type = tokens[1];
                    findMaxIndex(array, type);
                    break;
                case "min":
                    type = tokens[1];
                    findMinIndex(array, type);
                    break;
                case "first":
                    int count = Integer.parseInt(tokens[1]);
                    type = tokens[2];
                    printFirstElements(array, count, type);
                    break;
                case "last":
                    count = Integer.parseInt(tokens[1]);
                    type = tokens[2];
                    printLastElements(array, count, type);
                    break;
            }
        }

        System.out.println(Arrays.toString(array.toArray()));
    }
}
