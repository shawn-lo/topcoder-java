package StringParsing;

import java.util.ArrayList;

/**
 * Created by Shawn on 4/23/15.
 */
public class Library {
    public int documentAccess(String[] records, String[] userGroups, String[] roomsRights)
    {
        ArrayList<String> users = new ArrayList<String>();
        ArrayList<String> rooms = new ArrayList<String>();
        ArrayList<String> docs = new ArrayList<String>();
        int count = 0;

        for(String user : userGroups)
        {
            users.add(user);
        }
        for(String room : roomsRights)
        {
            rooms.add(room);
        }

        for(String record : records)
        {
            String[] array = record.split(" ");
            String userGroup = array[2];
            String roomRight = array[1];
            String doc = array[0];
            if(users.contains(userGroup) && rooms.contains(roomRight))
            {
                if(docs.isEmpty() || !docs.contains(doc))
                {
                    docs.add(doc);
                    count++;
                }
            }
        }

        return count;
    }
}
