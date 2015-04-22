package StringParsing;

import java.util.ArrayList;

/**
 * Created by Shawn on 4/22/15.
 */
public class BusinessTasks {
    public String getTask(String[] list, int n)
    {
        ArrayList<String> tasks = new ArrayList<String>();
        for(String task : list)
        {
            tasks.add(task);
        }

        int index = 0;
        while(tasks.size() > 1)
        {
            index += n-1;
            while(index > tasks.size()-1 )
            {
                index = index - tasks.size();
            }
            // There is a better way to cut off this while loop.
            // using %, I forgot it before.

            tasks.remove(index);
        }

        return tasks.get(0);
    }
}
