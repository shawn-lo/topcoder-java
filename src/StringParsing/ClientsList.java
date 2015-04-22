package StringParsing;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Shawn on 4/22/15.
 */
public class ClientsList {
    public String[] dataCleanup(String[] names)
    {
        ArrayList<Name> nameList = new ArrayList<Name>();
        for(String client : names)
        {
            Name name = new Name();
            if(client.contains(","))
            {
                String[] arr = client.split(", ");
                name.firstName = arr[1];
                name.lastName = arr[0];
            }
            else
            {
                String[] arr = client.split(" ");
                name.firstName = arr[0];
                name.lastName = arr[1];
            }
            nameList.add(name);
        }
        Collections.sort(nameList);

        ArrayList<String> result = new ArrayList<String>();
        for(Name n : nameList)
        {
            result.add(n.firstName + " " + n.lastName);
        }
        return result.toArray(new String[0]);
    }

    private class Name implements Comparable<Name>
    {
        String firstName;
        String lastName;

        @Override
        public int compareTo(Name n)
        {
            if(lastName.equals(n.lastName))
            {
                return firstName.compareTo(n.firstName);
            }
            else
                return lastName.compareTo(n.lastName);
        }
    }
}
