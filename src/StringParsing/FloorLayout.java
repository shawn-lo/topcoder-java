package StringParsing;

/**
 * Created by Shawn on 4/18/15.
 */
public class FloorLayout {
    public int countBoards(String[] layout)
    {
        int count = 0;
        for(String ew : layout)
        {
            for(int i = 0; i < ew.length(); i++)
            {
                if( ew.charAt(i) == '-')
                {
                    // bound, the first one
                    if( i == 0 )
                        count++;
                    else
                    {
                        if(ew.charAt(i-1) == '-')
                            continue;
                        else
                            count++;
                    }

                }
            }
        }

        for(int i = 0; i < layout[0].length(); i++)
        {
            for(int j = 0; j < layout.length; j++)
            {
                if( layout[j].charAt(i) == '|')
                {
                    if( j == 0)
                        count++;
                    else
                    {
                        if( layout[j-1].charAt(i) == '|')
                            continue;
                        else
                            count++;
                    }
                }
            }
        }
        return count;
    }

//    int countBoards(vector <string> layout){
//        int count = 0;
//        for (int i=0;i<layout.size();i++)
//            for (int j=0;j<layout[i].size();j++)
//                if (layout[i][j] == '-'){
//                    if (j==0 || layout[i][j-1]=='|') count++;
//                } else {
//                    if (i==0 || layout[i-1][j]=='-') count++;
//                }
//        return count;
//    }
}
