package BruteForce;

/**
 * Created by Shawn on 5/18/15.
 */
public class IndictDates {
    public int getYear(int indict, int circleSun, int circleMoon)
    {
        int result = 0;
        int year = 0;
        while(true)
        {
            if((year%15 == indict) && (year%28 == circleSun) && (year%19 == circleMoon))
                return year;
            year++;
        }
    }
}
