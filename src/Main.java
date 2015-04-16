
public class Main {

    public static void main(String[] args) {
        System.out.println("Another test for HTTP or SSH");
        System.out.println("Hello World!");
/**
 * FullMonitor
 */
//        FullMonitor fm = new FullMonitor();
//        FullMonitorBetter fmb = new FullMonitorBetter();
//        String[] pixels1 = {"25,25,25","25,25,26"};
//        String[] pixels2 = {"1,1,3","1,3,1","3,1,1"};
//        String[] pixels3 = {"25,25,25","25,25,26","25,26,26","25,26,25"};
//        String[] pixels4 = {"25,25,25"};
//        String[] pixels5 = {"1000,1005,20","20,50,20","30,90,10","1005,30,90","90,1000,1005","30,90,20","1000,90,10","40,90,10","1000,1000,1000"};
//        int result = fmb.numLasers(pixels1);
//        System.out.println(result);
/**
 * RPN
 */
//        RPN rpn = new RPN();
//        String expr1 = "2 3 + 6 ~ 7 * -";
//        String expr2 = "5 ~ ~ ~";
//        String expr3 = "9 8 7 * * 4 5 - -";
//        String expr4 = "1 + 2 + 3";
//        String expr5 = "1 9 ~ 2 8 * +";
//        int result = rpn.evaluate(expr5);
//        System.out.println(result);
/**
 * SearchDisks
 */
//        SearchDisks sd = new SearchDisks();
//        String diskNames1 = "beatles queen abba";
//        String searchDisk1 = "abba";
//        String diskNames2 = "beatles queen abba";
//        String searchDisk2 = "beatles";
//        String diskNames3 = "a b c";
//        String searchDisk3 = "b";
//        String diskNames4 = "t k o h z s v r i c e d n f a m u w p g j q x y l";
//        String searchDisk4 = "f";
//        int result = sd.numberToTakeOut(diskNames4, searchDisk4);
//        System.out.println(result);
/**
 * WallRepair
 */
        WallRepair wr = new WallRepair();
        String[] wallRows1 = {
                "..X...X.....",
                "....X.X...XX",
                "...........X",
                "..X.......X."};
        String[] wallRows2 = {".X...X..X"};
        String[] wallRows3 = {
                ".........X............",
                "......X..X..X..X......",
                "X.......X..X.........X",
                "....XXXXX..X.XXXXX...X",
                ".....X..X..X.........X",
                "...X....X..X.........X",
                ".X...XX..X..X..X......",
                ".....X...X...XX......X"};
        int result = wr.bricksRequired(wallRows3);
        System.out.println(result);
    }
}
