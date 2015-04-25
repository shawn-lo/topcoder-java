package BruteForce;

/**
 * Created by Shawn on 4/25/15.
 */
public class Isoceles {
    public int howMany(int[] xs, int[] ys)
    {
        int count = 0;
        for(int i = 0; i < xs.length; i++)
            for(int j = i+1; j < xs.length; j++)
                for(int k = j+1; k < xs.length; k++)
                {
                    double edge1 = Math.pow(xs[i] - xs[j], 2) + Math.pow(ys[i] - ys[j], 2);
                    double edge2 = Math.pow(xs[i] - xs[k], 2) + Math.pow(ys[i] - ys[k], 2);
                    double edge3 = Math.pow(xs[j] - xs[k], 2) + Math.pow(ys[j] - ys[k], 2);
                    // is isocele?
                    if(edge1 != edge2 && edge2 != edge3 && edge1 != edge3)
                        continue;

                    if((edge1+edge2 == edge3)
                            || (edge2+edge3 == edge1)
                            || (edge1+edge3 == edge2))
                        count++;
                }
        return count;
    }
}
