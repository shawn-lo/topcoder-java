package DP;

import java.util.*;

/**
 * Created by Shawn on 4/19/15.
 * Travelling Salesman Problem
 * http://blog.csdn.net/ganglia/article/details/7074776
 */
public class TSP {
    private double[][] dArray;
    private int length;
    private int lengthOfLength;
    private String allzero="";
    private String biggest="";
    private List<String> list = new ArrayList<String>();
    private Map<String, Double> store;
    private String notExist = "notExist";
    private String finalRoad = notExist;
    private String finalCityFlow = "";
    private String min = notExist;
    private String allFlowTime = notExist;
    private String dpTime = notExist;

//    public TSP(double[][] dArray)
//    {
//
//    }
//
//    public String getFinalRoad()
//    {
//
//    }
//
//    public String getFinalCityFlow()
//    {
//
//    }
//
//    public String getMin()
//    {
//
//    }
//
//    public String getAllFlowTime()
//    {
//
//    }
//
//    public String getDpTime()
//    {
//
//    }
//
//    private boolean check(double[][] dArray)
//    {
//        if(dArray.length < 3)
//        {
//            System.out.println();
//        }
//    }
//
//    private boolean oneZero(double[][] dArray, int i)
//    {
//
//    }
//
//    private boolean oneFlow(String str)
//    {
//
//    }
//
//    private void initstoreMap()
//    {
//
//    }
//
//    private void dp(int temp)
//    {
//
//    }
//
//    private void allFlow()
//    {
//
//    }
//
//    private String addOne(String str)
//    {
//
//    }
//
//    private String toLengthOfLength(Object i)
//    {
//
//    }
//
//    private void thePrint(String str)
//    {
//
//    }
}
