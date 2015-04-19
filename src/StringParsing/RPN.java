package StringParsing; /**
 * Created by Shawn on 4/15/15.
 */
import java.util.*;

public class RPN {

    public int evaluate(String expr)
    {
        Scanner in = new Scanner(expr);
        in.useDelimiter(" ");
        Stack<Integer> stack = new Stack<Integer>();
        while(in.hasNext())
        {
            String current = in.next();
//            System.out.println(current);
            int currentInt = current.charAt(0) - '0';
            // current is Integer
            if(currentInt >= 0 && currentInt <= 9)
            {
                stack.push(currentInt);
            }
            else {
                if (current.equals("~")) {
                    if (stack.empty()) {
                        return -999;
                    } else {
                        int element = stack.pop();
                        element = -element;
                        stack.push(element);
                    }
                } else if (current.equals("+")) {
                    if (stack.size() < 2) {
                        return -999;
                    } else {
                        int right = stack.pop();
                        int left = stack.pop();
                        int result = left + right;
                        stack.push(result);
                    }
                } else if (current.equals("-")) {
                    if (stack.size() < 2) {
                        return -999;
                    } else {
                        int right = stack.pop();
                        int left = stack.pop();
                        int result = left - right;
                        stack.push(result);
                    }
                } else if (current.equals("*")) {
                    if (stack.size() < 2) {
                        return -999;
                    } else {
                        int right = stack.pop();
                        int left = stack.pop();
                        int result = left * right;
                        stack.push(result);
                    }
                } else
                    System.out.println("something wrong");
            }
        }

        if(stack.size() != 1)
            return -999;
        else
            return stack.pop();
    }

}
