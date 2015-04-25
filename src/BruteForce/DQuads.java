package BruteForce;

/**
 * Created by Shawn on 4/23/15.
 */
public class DQuads {
    public int count(String[] flights)
    {
        int n = flights.length;
        int[][] g = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            String current = flights[i];
            String[] array = current.split(" ");
            for(String x : array)
            {
                if(x.length() == 0) continue;
                //Is this safe??? No initializing.
                g[i][Integer.parseInt(x)]++;
            }
        }

        int result = 0;
        for(int x1 = 0; x1 < n; x1++)
            for(int x2 = 0; x2 < n; x2++)
                for(int x3 = 0; x3 < n; x3++)
                    for(int x4 = 0; x4 < n; x4++)
                    {
                        boolean noDup = true;
                        int[] currentSet = new int[]{x1, x2, x3, x4};
                        // Here is Brute Force?
                        for(int i = 0; i < 4; i++)
                            for(int j = i + 1; j < 4; j++)
                            {
                                if(currentSet[i] == currentSet[j])
                                    noDup = false;
                            }

                        if(!noDup)
                            continue;
                        if(g[x1][x3] + g[x3][x1] > 0 || g[x2][x4] + g[x4][x2] > 0)
                            continue;

                        result += g[x1][x2] * g[x2][x3] * g[x3][x4] * g[x4][x1];
                    }
        result /= 4;
        return result;
    }
}
