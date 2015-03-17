/**
 * Created by Shawn on 3/17/15.
 */
public class FullMonitor {

    public int numLasers(String[] pixels) {
        // Build 3 sets - (x,y), (y,z), (x,z)
        String[] xyArr = new String[pixels.length];
        String[] yzArr = new String[pixels.length];
        String[] xzArr = new String[pixels.length];

        for (int i = 0; i < pixels.length; i++) {
            String xyzStr = pixels[i];
            String[] xyzArr = xyzStr.split(",");
            String x = xyzArr[0];
            String y = xyzArr[1];
            String z = xyzArr[2];



            xyArr[i] = x + " " + y; // Or, xyArr[i] = x.concat(",").concat(y);
            yzArr[i] = y + " " + z;
            xzArr[i] = x + " " + z;
        }

        //Traverse 3 sets.
        int duplicate = 0;
        for (int i = 0; i < pixels.length; i++) {
            char[] xyPlate = xyArr[i].toCharArray();
            char x1 = xyPlate[0];
            char y1 = xyPlate[1];

            for(int j = 0; j < pixels.length; j++) {
                char[] yzPlate = yzArr[j].toCharArray();
                char y2 = yzPlate[0];
                char z1 = yzPlate[1];

                for(int k = 0; k < pixels.length; k++) {
                    char[] xzPlate = xzArr[k].toCharArray();
                    char x2 = xzPlate[0];
                    char z2 = xzPlate[1];

                    if(x1 == x2 && y1 == y2 && z1 == z2) {
                        duplicate++;
                        String newStr = x1 + "," + y1 + "," + z1;
                        for(String oldStr : pixels) {
                            if( oldStr.equals(newStr))
                                return -1;
                        }
                    }
                }
            }
        }

        return 3 * pixels.length - duplicate;
    }
}
