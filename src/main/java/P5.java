import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/*
*  Given a list of intervals: [s,e] for meetings.
*  Find the least number of meeting rooms required.
*  .Constraints:
*       .1<=N<=1e5
*       .1<=A[i][0]<=A[i][1]<=1e9
*
*  Example: Input [[5,10],[15,20],[0,30]] Output: 2
* Explanation: [0,30] and [5,10] take place simultaneously Same for [0,30] and [15,20]*/
public class P5 {
    public static void main(String[] args) {
        new P5(new int[][]{{5,10},{15,20},{0,30}});
        new P5(new int[][]{{5,10},{10,20},{12,30},{0,40}});
    }
    public P5(int[][] meetings) {
        TreeMap<Integer, Integer> meet= new TreeMap<>();
        for(int[] meeting : meetings) {
            meet.put(meeting[0], 1);
            meet.put(meeting[1], -1);
        }
        int max =0;
        int current = 0;
        for(int i: meet.keySet()) {
            current= current+meet.get(i);
            if(current > max) max=current;
        }
        System.out.println(max);
    }
}
