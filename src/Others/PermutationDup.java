package Others;

/**
 * Created by Shawn on 4/30/15.
 */
public class PermutationDup {

    public void printArray(int[] array)
    {
        for(int x : array)
        {
            System.out.printf("%d ", x);
        }
        System.out.println(" ");
    }

    public void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public boolean isDup(int[] array, int start, int end)
    {
        for(int i = start; i < end; i++)
        {
            if(array[start] == array[end])
                return true;
        }
        return false;
    }

    public void getPermtDup(int[] array, int startIndex, int endIndex)
    {
        if(startIndex == endIndex)
        {
            printArray(array);
        }
        else
        {
            for(int i = startIndex; i <= endIndex; i++)
            {
                if(!isDup(array, startIndex, i))
                {
                    swap(array, startIndex, i);
                    getPermtDup(array, startIndex+1, i);
                    swap(array, startIndex, i);
                }
            }
        }
    }
}
