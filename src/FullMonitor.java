import java.util.HashSet;
import java.util.Set;

/**
 * Created by Shawn on 3/17/15.
 */
public class FullMonitor {

    public int numLasers(String[] pixels) {
        // Build 3 sets - (x,y), (y,z), (x,z)
        Set xySet = new HashSet();
        Set yzSet = new HashSet();
        Set xzSet = new HashSet();

        for(String xyzStr : pixels){
            String[] xyzArr = xyzStr.split(",");
            String xy = xyzArr[0] + "," + xyzArr[1];
            String yz = xyzArr[1] + "," + xyzArr[2];
            String xz = xyzArr[0] + "," + xyzArr[2];
            xySet.add(xy);
            yzSet.add(yz);
            xzSet.add(xz);
        }
        System.out.println(yzSet.size());

        for(Object xy : xySet) {
            String[] xyArr = xy.toString().split(",");
            String x1 = xyArr[0];
            String y1 = xyArr[1];

            for(Object yz : yzSet) {
                String[] yzArr = yz.toString().split(",");
                String y2 = yzArr[0];
                String z1 = yzArr[1];

                for(Object xz : xzSet) {
                    String[] xzArr = xz.toString().split(",");
                    String x2 = xzArr[0];
                    String z2 = xzArr[1];

//                    System.out.printf("x1, y1 : %s , %s \n", x1, y1);
//                    System.out.printf("y2, z1 : %s , %s \n", y2, z1);
//                    System.out.printf("x2, z2 : %s , %s \n", x2, z2);
                    // x1 == x2 && y1 == y2 && z1 == z2
                    if( x1.equals(x2) && y1.equals(y2) && z1.equals(z2)) {
                        //(x, y, z) not in the input
                        String xyzNew = x1 + "," + y1 + "," + z1;
                        int inPixels = 0;
                        for(String temp : pixels) {
                            if(temp.equals(xyzNew))
                                inPixels = 1;
                        }
                        if (inPixels == 0) {
                            return -1;
                        }
                    }
                }
            }
        }
        return xySet.size() + yzSet.size() + xzSet.size();
    }
}
