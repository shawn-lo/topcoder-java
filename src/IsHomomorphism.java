/**
 * Created by Shawn on 4/17/15.
 */
public class IsHomomorphism {
    public String[] numBad(String[] source, String[] target, int[] mapping)
    {
        String[] result = new String[]{};
        int[][] sourceResult = new int[source.length][source.length];
        int[][] targetResult = new int[target.length][target.length];
        // initialize sourceResult
        for(int i = 0; i < source.length; i++)
        {
            for(int j = 0; j < source.length; j++)
            {
                int index = source[i].charAt(j)-'0';
                sourceResult[i][j] = mapping[index];
            }
        }
        // initialize targetResult
        for(int i = 0; i < target.length; i++)
        {
            for(int j = 0; j < target.length; j++)
            {
                int rowIndex = mapping[i];
                int columnIndex = mapping[j];
//                System.out.printf("row:%d, column:%d ", rowIndex, columnIndex);
                targetResult[i][j] = target[rowIndex].charAt(columnIndex) - '0';
//                System.out.printf("%d ", targetResult[i][j]);
            }
        }
        //Compare
        int resultIndex = 0;
        for(int i = 0; i < source.length; i++)
        {
            for(int j = 0; j < source.length; j++)
            {
                if(sourceResult[i][j] != targetResult[i][j])
                    result[resultIndex] = new String("(" + i + "," + j +")");
                    resultIndex++;
            }
        }
        return result;
    }
}
