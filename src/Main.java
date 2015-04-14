
public class Main {

    public static void testTCA() {
        String str = "Fuck My Life";
        char[] arr = str.toCharArray();
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        System.out.println("Another test for HTTP or SSH");
        System.out.println("Hello World!");

        FullMonitor fm = new FullMonitor();
        FullMonitorBetter fmb = new FullMonitorBetter();
        String[] pixels1 = {"25,25,25","25,25,26"};
        String[] pixels2 = {"1,1,3","1,3,1","3,1,1"};
        String[] pixels3 = {"25,25,25","25,25,26","25,26,26","25,26,25"};
        String[] pixels4 = {"25,25,25"};
        String[] pixels5 = {"1000,1005,20","20,50,20","30,90,10","1005,30,90","90,1000,1005","30,90,20","1000,90,10","40,90,10","1000,1000,1000"};
        int result = fmb.numLasers(pixels1);
        System.out.println(result);
//        testTCA();
    }
}
