package BruteForce;

/**
 * Created by Shawn on 5/18/15.
 */
public class DigitsSum {
    public int lastDigit(int n)
    {
        int result = 0;
        while(n >= 10)
        {
            result = 0;
            while( n >= 10)
            {
                result += n%10;
                n = n / 10;
            }
            result += n;
            n = result;
        }
        return result;
    }
}
