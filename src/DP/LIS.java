package DP;

/**
 * Longest Increasing Subsequence
 * Created by Shawn on 4/19/15.
 */
public class LIS {
    public int countLength (int[] sequence)
    {
        int n = sequence.length;
        int[] f = new int[n+1];
        f[0] = 1;

        for(int i = 1; i < n; i++)
        {
            int max = 0;
            for(int j = 0; j < i; j++)
            {
                if(sequence[j] < sequence[i] && f[j] > max )
                {
                    max = f[j];
                }
            }
            f[i] = max + 1;
        }

        int result = 0;
        for(int i = 0; i <= n; i++)
        {
            result = f[i] > result ? f[i] : result;
        }
        return result;
    }
}
