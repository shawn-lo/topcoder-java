/**
 * Created by Shawn on 4/16/15.
 */
public class SearchDisks {
    public int numberToTakeOut(String diskNames, String searchingDisk)
    {
        String[] disksArr = diskNames.split(" ");
        int length = disksArr.length;
        for(int i = 0; i < length; i++)
        {
            if(disksArr[i].equals(searchingDisk))
                return length-i-1;
        }
        return -1;
    }
}
