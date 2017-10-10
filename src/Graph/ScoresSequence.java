/* Use Brute-force. Construct graph first(indegree, outdegree, relationship)
 * Floyd-Warshall algorithm
 */

import java.util.*;
public class ScoresSequence {
    public boolean[][] graph = new boolean[100][100];
    public int[] in = new int[100];
    public int[] out = new int[100];
    public int n = 0;
    
    public int count(int[] s) {
		n = s.length;
        Arrays.sort(s);
        int left = 0, right = n-1;
        while(left < right){
        	int tmp = s[left];
            s[left] = s[right];
            s[right] = tmp;
            left++;
            right--;
        }
        for(int i = 0; i < n; i++) {
        	in[i] = n - 1 - s[i];
            out[i] = s[i];
			graph[i][i] = true;
        }
        for(int i = 0; i < n; i++) {
        	while(out[i]-- > 0){
            	int j = -1;
                for(int k = 0; k < n; k++) {
                	if(i != k && !graph[i][k] && (j == -1 || in[k] >= in[j]))
                        j = k;
                }
                graph[i][j] = true;
                in[j]--;
            }
        }
        for(int k = 0; k < n; k++)
        	for(int i = 0; i < n; i++)
            	for(int j = 0; j < n; j++)
            		graph[i][j] |= graph[i][k] && graph[k][j];
            
        int cnt = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
            	if(graph[i][j]) cnt++;
        System.out.println(cnt);
        return cnt; 
    }
}
