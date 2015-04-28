package Others;

/**
 * Created by Shawn on 4/27/15.
 */
public class Permutation {
    public void swap(int[] array, int i, int j)
    {
        int temp = array[j];
        array[j] = array[i];
        array[i] = temp;
    }

    public void printArray(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.printf("%d ", array[i]);
        }
        System.out.println(" ");
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
                swap(array, startIndex, i);
                getPermutation(array, startIndex+1, endIndex);
                swap(array, startIndex, i);
            }
        }
//        printArray(array);
//        swap(array, 0, 1);
//        System.out.println(" ");
//        printArray(array);
    }
}
