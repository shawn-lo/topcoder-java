import java.util.ArrayList;

/**
 * Created by Shawn on 4/17/15.
 */
public class IsHomomorphism {
    public String[] numBad(String[] source, String[] target, int[] mapping)
    {
        ArrayList<String> result = new ArrayList<String>();
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
                targetResult[i][j] = target[rowIndex].charAt(columnIndex) - '0';
            }
        }
        //Compare
        for(int i = 0; i < source.length; i++)
        {
            for(int j = 0; j < source.length; j++)
            {
                if(sourceResult[i][j] != targetResult[i][j]) {
                    String currentStr = "(" + i + "," + j + ")";
                    result.add(currentStr);
                }
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
