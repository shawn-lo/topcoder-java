import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Shawn on 4/16/15.
 */
public class WallRepair {
    public int bricksRequired(String[] wallRows)
    {
        int rowCount = wallRows.length;
        Set<Integer> brickSet = new TreeSet<Integer>();
        int count = 0;
        for(String row: wallRows)
        {
            if(!brickSet.isEmpty())
            {
                Iterator<Integer> it = brickSet.iterator();
                while(it.hasNext())
                {
                    int check = it.next();
                    if(row.charAt(check) == '.')
                        count++;
                }
            }
            for(int i = 0; i < row.length(); i++)
            {
                if(row.charAt(i) == 'X')
                    brickSet.add(i);
            }
        }
        return count;
    }
}
