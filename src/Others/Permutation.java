package Others;

/**
 * Created by Shawn on 4/27/15.
 */
public class Permutation {
    public void swap(int a, int b)
    {
        int temp = b;
        b = a;
        a = temp;
    }

    public void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("%d ", array[i]);
        }
    }

    public void getPermutation(int[] array, int startIndex, int endIndex)
    {
        if(startIndex == endIndex)
        {
            printArray(array);
        }
        else
        {
            for(int i = startIndex; i <= endIndex; i++)
            {
                swap(array[startIndex], array[i]);
                getPermutation(array, startIndex+1, endIndex);
                swap(array[startIndex], array[i]);
            }
        }
    }
}
