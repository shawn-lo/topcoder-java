package Others;
import java.util.*;

/**
 * Created by Shawn on 5/10/15.
 */
public class Combination {
    public void combiantion(char chs[]){
        if(chs==null||chs.length==0){
            return ;
        }
        List<Character> list=new ArrayList();
        for(int i=1;i<=chs.length;i++){
            combine(chs,0,i,list);
        }
    }
    //从字符数组中第begin个字符开始挑选number个字符加入list中
    public void combine(char []cs,int begin,int number,List<Character> list){
        if(number==0){
            System.out.println(list.toString());
            return ;
        }
        if(begin==cs.length){
            return;
        }
        list.add(cs[begin]);
        combine(cs,begin+1,number-1,list);
        list.remove((Character)cs[begin]);
        combine(cs,begin+1,number,list);
    }

    public void combineInt(int[] array, int begin, int number, List<Integer> list){
        if(number == 0)
        {
            System.out.println(list.toString());
            return ;
        }
        if(begin == array.length)
            return ;
        list.add(array[begin]);
        combineInt(array, begin+1, number-1, list);
        list.remove(array[begin]);

    }
}
