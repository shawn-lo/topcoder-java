package StringParsing;

import java.util.*;

/**
 * Created by Shawn on 4/21/15.
 */
public class PaintBall {
    public String[] getLeaderBoard(String[] players, String[] messages)
    {
        Map<String, ArrayList<String>> map= new HashMap<String, ArrayList<String>>();
        Set<TwoTuple> set = new HashSet<TwoTuple>();
        //Parse players into map.
        for(String player : players)
        {
            String[] pArr = player.split(" ");
            if(map.isEmpty())
            {
                ArrayList<String> list= new ArrayList<String>();
                list.add(pArr[0]);
                map.put(pArr[1], list);
            }
            else
            {
                if(map.containsKey(pArr[1]))
                {
                    ArrayList<String> list = map.get(pArr[1]);
                    list.add(pArr[0]);
                    map.put(pArr[1], list);
                }
                else
                {
                    ArrayList<String> list= new ArrayList<String>();
                    list.add(pArr[0]);
                    map.put(pArr[1], list);
                }
            }
        }
        //Parse massages into set.
        Iterator it = map.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.printf("%s, %s\n", pair.getKey(), pair.getValue());
        }

        for(String message: messages)
        {
            String[] mArr = message.split(" ");
            String subject = mArr[0];
            String object = mArr[2];
            if(set.isEmpty())
            {
                TwoTuple sTuple = new TwoTuple(subject, 1);
                TwoTuple oTuple = new TwoTuple(object, 1);
                set.add(sTuple);
                set.add(oTuple);
            }
            else
            {
                for(TwoTuple tt : set)
                {
                    if(tt.name.equals(subject))
                        tt.score++;
                    else if(tt.name.equals(object))
                        tt.score--;
                    else
                    {
                        TwoTuple sTuple = new TwoTuple(subject, 1);
                        TwoTuple oTuple = new TwoTuple(object, 1);
                        set.add(sTuple);
                        set.add(oTuple);
                    }
                }
            }
        }


        return players;
    }

    private class TwoTuple implements Comparable<TwoTuple> {
        String name;
        int score;
        public TwoTuple(String name, int score){ this.name = name; this.score = score;};

        // int sort() method, the default is increasing order.
        // thus, we use decreasing order in compareTo() method.
        @Override
        public int compareTo(TwoTuple twoTuple) {
            if( score > twoTuple.score)
                return -1;
            else if( score < twoTuple.score)
                return 1;
            else
            {
                if( name.compareTo(twoTuple.name) <= 0)
                    return -1;
                else
                    return 1;
            }
        }
    }
}
