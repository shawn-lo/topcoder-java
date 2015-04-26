package BruteForce;

/**
 * Created by Shawn on 4/26/15.
 */
public class Shouting {
    public double shout(int[] x, int[] y)
    {
        int n = x.length;
        double max = 0;
        for(int i = 0; i < n; i++)
            for(int j = i+1; j < n; j++)
            {
                int xDis = x[i] - x[j];
                int yDis = y[i] - y[j];
                double dis = Math.sqrt(xDis*xDis + yDis*yDis);
                if(dis > max)
                    max = dis;
            }
        return max;
    }
}
