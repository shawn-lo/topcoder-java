package StringParsing;

/**
 * Created by Shawn on 4/16/15.
 */
public class QuoteContest {
    public String bestQuote(String[] quotes)
    {
        int maxSumOfVote = 0;
        String result = "asuralo";
        for(String eachQuote : quotes)
        {
            String[] quoteArr = eachQuote.split(" ");
            int vote1 = Integer.valueOf(quoteArr[0]);
            int vote2 = Integer.valueOf(quoteArr[1]);
            String name = quoteArr[2];
            if (vote1 + vote2 > maxSumOfVote) {
                maxSumOfVote = vote1 + vote2;
                result = name;
            }
        }
        return result;
    }
}
