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
        Iterator it = map.entrySet().iterator();
        while(it.hasNext())
        {
            Map.Entry pair = (Map.Entry)it.next();
            System.out.printf("%s, %s\n", pair.getKey(), pair.getValue());
        }

        //Parse messages into set.
        for(String message: messages)
        {
            String[] mArr = message.split(" ");
            String subject = mArr[0];
            String object = mArr[2];
            if(set.isEmpty())
            {
                TwoTuple sTuple = new TwoTuple(subject, 1);
                TwoTuple oTuple = new TwoTuple(object, -1);
                set.add(sTuple);
                set.add(oTuple);
            }
            else
            {
                boolean isNewSubject = true;
                boolean isNewObject = true;
                Iterator setIt = set.iterator();
                while(setIt.hasNext())
                {
                    TwoTuple tt = (TwoTuple)setIt.next();
                    if(tt.name.equals(subject)) { tt.score++; isNewSubject = false;}
                    if(tt.name.equals(object)) { tt.score--; isNewObject = false;}
                }
                if(isNewSubject) {
                    TwoTuple sTuple = new TwoTuple(subject, 1);
                    set.add(sTuple);
                }
                if(isNewObject) {
                    TwoTuple oTuple = new TwoTuple(object, -1);
                    set.add(oTuple);
                }
            }
        }
        Iterator setItt = set.iterator();
        while(setItt.hasNext())
        {
            TwoTuple temp = (TwoTuple)setItt.next();
            System.out.println(temp.name);
            System.out.println(temp.score);
        }

        //sum
        Iterator mapIt = map.entrySet().iterator();
        Set<TwoTuple> teamSet = new HashSet<TwoTuple>();
        while(mapIt.hasNext())
        {
            int count = 0;
            Map.Entry mapEntry = (Map.Entry)mapIt.next();
            String key = (String)mapEntry.getKey();
            ArrayList<String> list = (ArrayList<String>)mapEntry.getValue();
            for(int i = 0; i < list.size(); i++)
            {
                String player = list.get(i);
                Iterator itt = set.iterator();
                while(itt.hasNext())
                {
                    TwoTuple tt = (TwoTuple)itt.next();
                    if(tt.name.equals(player))
                        count += tt.score;
                }
            }
            TwoTuple teamTT = new TwoTuple(key, count);
            teamSet.add(teamTT);
        }

        Iterator teamIt = teamSet.iterator();
        while(teamIt.hasNext())
        {
            TwoTuple tt = (TwoTuple)teamIt.next();
            System.out.println(tt.name);
            System.out.println(tt.score);
        }

        convertToStrArr(map, set, teamSet);
        return players;
    }

    public String[] convertToStrArr(Map<String, ArrayList<String>> map, Set<TwoTuple> set, Set<TwoTuple> teamSet)
    {
        String[] temp = new String[4];
        // Easy to implement, but it's too complex.
        return  temp;
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
