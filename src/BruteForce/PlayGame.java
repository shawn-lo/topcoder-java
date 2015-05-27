package BruteForce;

import java.util.*;
/**
 * Created by Shawn on 5/20/15.
 */
public class PlayGame {
    public int saveCreatures(int[] you, int[] computer)
    {
        Arrays.sort(you);
        Arrays.sort(computer);
        int ylength = you.length - 1;
        int clength = computer.length - 1;
        int result = 0;
        while(ylength >= 0 && clength >= 0)
        {
            if(you[ylength] > computer[clength])
            {
                result += you[ylength];
                ylength--;
                clength--;
            }
            else
            {
                clength--;
            }
        }
//        for(int temp: you)
//        {
//            System.out.printf("%d ", temp);
//        }
        return result;
    }
}
