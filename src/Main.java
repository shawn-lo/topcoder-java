import BruteForce.*;
import StringParsing.*;
import DP.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Another test for HTTP or SSH");
        System.out.println("Hello World!");
/**
 * StringParsing.FullMonitor
 */
//        StringParsing.FullMonitor fm = new StringParsing.FullMonitor();
//        StringParsing.FullMonitorBetter fmb = new StringParsing.FullMonitorBetter();
//        String[] pixels1 = {"25,25,25","25,25,26"};
//        String[] pixels2 = {"1,1,3","1,3,1","3,1,1"};
//        String[] pixels3 = {"25,25,25","25,25,26","25,26,26","25,26,25"};
//        String[] pixels4 = {"25,25,25"};
//        String[] pixels5 = {"1000,1005,20","20,50,20","30,90,10","1005,30,90","90,1000,1005","30,90,20","1000,90,10","40,90,10","1000,1000,1000"};
//        int result = fmb.numLasers(pixels1);
//        System.out.println(result);
/**
 * StringParsing.RPN
 */
//        StringParsing.RPN rpn = new StringParsing.RPN();
//        String expr1 = "2 3 + 6 ~ 7 * -";
//        String expr2 = "5 ~ ~ ~";
//        String expr3 = "9 8 7 * * 4 5 - -";
//        String expr4 = "1 + 2 + 3";
//        String expr5 = "1 9 ~ 2 8 * +";
//        int result = rpn.evaluate(expr5);
//        System.out.println(result);
/**
 * StringParsing.SearchDisks
 */
//        StringParsing.SearchDisks sd = new StringParsing.SearchDisks();
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
 * StringParsing.WallRepair
 */
//        StringParsing.WallRepair wr = new StringParsing.WallRepair();
//        String[] wallRows1 = {
//                "..X...X.....",
//                "....X.X...XX",
//                "...........X",
//                "..X.......X."};
//        String[] wallRows2 = {".X...X..X"};
//        String[] wallRows3 = {
//                ".........X............",
//                "......X..X..X..X......",
//                "X.......X..X.........X",
//                "....XXXXX..X.XXXXX...X",
//                ".....X..X..X.........X",
//                "...X....X..X.........X",
//                ".X...XX..X..X..X......",
//                ".....X...X...XX......X"};
//        int result = wr.bricksRequired(wallRows3);
//        System.out.println(result);
/**
 * StringParsing.QuoteContest
 */
//            StringParsing.QuoteContest qc = new StringParsing.QuoteContest();
//            String[] quotes1 = {"4 1 firstquote","10 2 secondquote","1 5 thirdquote"};
//            String[] quotes2 = {"13 5 nocodecanbreakme","10 6 iamthebest","13 2 trytochallengeme"};
//            String[] quotes3 = {"1 1 justdoit","1 2 thewinnertakeitall","1 4 aboutthechallenge"};
//            String[] quotes4 = {"1 1 theworstquoteintheworld"};
//            String result = qc.bestQuote(quotes4);
//            System.out.println(result);
/**
 * StringParsing.IsHomomorphism
 */
//        StringParsing.IsHomomorphism ih = new StringParsing.IsHomomorphism();
//        String[] source1 = {
//                "0000",
//                "0123",
//                "0202",
//                "0321"};
//        String[] result1 = {
//                "0000",
//                "0123",
//                "0202",
//                "0321"};
//        int[] mapping1 = {0, 1, 2, 3};
//        String[] source2 = {
//                "0123456",
//                "1234560",
//                "2345601",
//                "3456012",
//                "4560123",
//                "5601234",
//                "6012345"};
//        String[] result2 = {
//                "0123456",
//                "1234560",
//                "2345601",
//                "3456012",
//                "4560123",
//                "5601234",
//                "6012345"};
//        int [] mapping2 = {1,3,2,1,2,1,1};
//        String[] source3 = {
//                "012",
//                "120",
//                "210"};
//        String[] result3 = {
//                "012",
//                "120",
//                "210"};
//        int[] mapping3 = {1,2,0};
//        String[] result = ih.numBad(source3, result3, mapping3);
//        for(int i = 0; i < result.length; i++)
//        {
//            System.out.println(result[i]);
//        }
/**
 * StringParsing.FloorLayout
 */
//        FloorLayout fl = new FloorLayout();
//        String[] layout1 = {
//                "----"
//                ,"----"
//                ,"----"
//                ,"----"};
//        String[] layout2 = {
//                "-||--||--"
//                ,"--||--||-"
//                ,"|--||--||"
//                ,"||--||--|"
//                ,"-||--||--"
//                ,"--||--||-"};
//        String[] layout3 = {
//                "--------"
//                ,"|------|"
//                ,"||----||"
//                ,"|||--|||"
//                ,"||----||"
//                ,"|------|"
//                ,"--------"};
//        int result = fl.countBoards(layout3);
//        System.out.println(result);
/**
 * Paint Ball
 */
//        PaintBall pb = new PaintBall();
//        String[] player1 = {"A RED", "B BLUE"};
//        String[] message1 = {"A SPLATTERED B"};
//        String[] player2 = {"LISA RED", "BART RED", "HOMER BLUE", "MARGE BLUE", "MAGGIE GREEN"};
//        String[] message2 = {"MAGGIE SPLATTERED HOMER", "MAGGIE SPLATTERED MARGE"};
//        String[] result = pb.getLeaderBoard(player2, message2);
/**
 * Clients List
 */
//        ClientsList cl = new ClientsList();
//        String[] name1 = {"Joe Smith", "Brown, Sam", "Miller, Judi"};
//        String[] name2 = {"Campbell, Phil", "John Campbell", "Young, Warren"};
//        String[] name3 = {"Kelly, Anthony", "Kelly Anthony", "Thompson, Jack"};
//        String[] name4 = {"Trevor Alvarez", "Jackson, Walter", "Mandi Stuart",
//                "Martin, Michael", "Peters, Tammy", "Richard Belmont",
//                "Carl Thomas", "Ashton, Roger", "Jamie Martin"};
//        String[] result = cl.dataCleanup(name4);
//        for(String s : result)
//        {
//            System.out.println(s);
//        }
/**
 * Business Tasks
 */
//        BusinessTasks bt = new BusinessTasks();
//        String[] list1 = {"a","b","c","d"};
//        int n1 = 2;
//        String[] list2 = {"a","b","c","d","e"};
//        int n2 = 3;
//        String[] list3 = {"alpha","beta","gamma","delta","epsilon"};
//        int n3 = 1;
//        String[] list4 = {"a","b"};
//        int n4 = 1000;
//        String[] list5 = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t",
//                "u","v","w","x","y","z"};
//        int n5 = 17;
//        String result = bt.getTask(list5, n5);
//        System.out.println(result);
/**
 * Library
 */
//        Library lib = new Library();
//        String[] records1 = {"diary computers editor","fairytale gardening editor","comix cars author","comix cars librarian"};
//        String[] userGroups1 = {"employee","editor","author"};
//        String[] roomRights1 = {"history","cars","computers"};
//        String[] records2 = {"diary computers editor","fairytale gardening editor","comix cars author","comix cars librarian"};
//        String[] userGroups2 = {"employee","editor","author","librarian"};
//        String[] roomRights2 = {"history","cars","computers"};
//        int result = lib.documentAccess(records1, userGroups1, roomRights1);
//        System.out.println(result);
/**
 * DQuads
 */
//        DQuads dq = new DQuads();
//        String[] flights1 = {"1 1 1 1 1 1 1 1 1 1","2","3","0"};
//        String[] flights2 = {"1 1 1 1 1 1 1 1 1 1","2","3","0 1"};
//        int result = dq.count(flights1);
//        System.out.println(result);
/**
 * Isoceles
 */
//        Isoceles it = new Isoceles();
//        int[] xs1 = {0, 1, 2};
//        int[] ys1 = {0, 10, 0};
//        int[] xs2 = {0, 0, 5, 5};
//        int[] ys2 = {0, 5, 0, 5};
//        int[] xs3 = {-1000000, 1000000, 0};
//        int[] ys3 = {0, 0, 1000000};
//        int result = it.howMany(xs3, ys3);
//        System.out.println(result);
/**
 * Shouting
 */
        Shouting sh = new Shouting();
        int[] x1 = {-2000, -2000};
        int[] y1 = {3000, 3000};
        double result = sh.shout(x1, y1);
        System.out.println(result);
/**
 * Longest Increasing Subsequence
 */
//        LIS lis = new LIS();
//        int[] sequence = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
//        int result = lis.countLength(sequence);
//        System.out.println(result);
    }
}
