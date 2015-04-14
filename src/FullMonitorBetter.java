/**
 * Created by Shawn on 4/14/15.
 * Copyright:
 * @author Yiuyuho, Topcoder
 */
import java.util.*;
import java.text.*;
import java.math.*;

public class FullMonitorBetter
{
    public Set<Triples> S, XY, YZ, XZ;

    public int numLasers(String[] pixels) {
        S = new TreeSet<Triples>();
        XY = new TreeSet<Triples>();
        YZ = new TreeSet<Triples>();
        XZ = new TreeSet<Triples>();

        Triples T;
        for(String line : pixels)
        {
            Scanner in = new Scanner(line);
            in.useDelimiter("[ ,]+");

            T = new Triples(in.nextInt(), in.nextInt(), in.nextInt());
            S.add(T);
            XY.add(new Triples(T.x, T.y, 0));
            YZ.add(new Triples(0, T.y, T.z));
            XZ.add(new Triples(T.x, 0, T.z));
        }

        for(Triples xy : XY)
        {
            for(Triples yz : YZ)
            if(xy.y == yz.y)
            {
                for(Triples xz : XZ)
                if(xy.x == xz.x && yz.z == xz.z)
                {
                    T = new Triples(xy.x, yz.y, xz.z);
                    if (!S.contains(T)) return -1;
                }
            }
        }
        return XY.size() + XZ.size() + YZ.size();
    }

    private class Triples implements Comparable<Triples>
    {
        public int x, y, z;
        public Triples(int xx, int yy, int zz) { x = xx; y = yy; z = zz;};
        // in S.contains(T), call compareTo function.
        public int compareTo(Triples u)
        {
            if(x != u.x) return x-u.x;
            if(y != u.y) return y-u.y;
            return z-u.z;
        }
    }
}
