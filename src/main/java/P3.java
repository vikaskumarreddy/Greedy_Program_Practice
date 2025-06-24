/*
* Given a list of intervals [start, end]
*
* Find the length of the maximal set of mutually disjoint intervals
* .Constraints:
*   .1<=N<=1e5
*   .1<=A[i][0] <= A[i][1]<= 1e9
*
* Example:
*  Input: [[1,2],[2,10],[4,6]]
*  Output: 2
*
* Explanation: select [1,2] and [4,6].
* Selecting [2,10] will block [1,2] and [4,6] because of intersection*/


import java.util.Arrays;
import java.util.Comparator;

public class P3 {
    /*Consideration:
    * Need to check for intervals that are ending early for optimal solutions*/
    public static void main(String[] args) {
        P3 p0 = new P3(new int[][]{{1,2},{4,6}, {2,10}});
        P3 p1 = new P3(new int[][]{{1,4},{2,3}, {4,6},{8,9}});
    }
    public P3(int[][] intervals ){
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[1]));
        int prev_start = intervals[0][0];
        int prev_end = intervals[0][1];
        int count = 1;
        for(int i = 1; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if(start <= prev_end) continue;
            else{
                prev_start = start;
                prev_end = end;
                count++;
            }
        }
        System.out.println(count);
    }
}
