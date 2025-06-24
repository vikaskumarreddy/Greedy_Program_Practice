/*
*  Given an array A of a random permutation of numbers from 1 to N.
* Given B the number of swaps in A that we can make.
*
* Find the largest permutation possible.
*
* >Constraints:
*   . 1<= N <= 1e6
*   . 1<= B <= 1e9
*
* Example:
*
* Input : A = [1,3,2], B = 1
* Output: [3,1,2]
* Explanation:
* N = 3
* since we can make B = 1 swaps, we swap 1 and 3 `*/

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P4 {
    /*Consideration:
    * Greedily replace the higher elements N->N-1-> . . . */
    public static void main(String[] args) {
        new P4(new int[]{3,2,4,1,5},3);
        new P4(new int[]{1,2,3},1);
    }
    public P4(int[] A,int B){
        int n = A.length;

        // Map each number to its index
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(A[i], i);
        }

        for (int i = 0; i < n && B > 0; i++) {
            int expectedValue = n - i;
            if (A[i] == expectedValue) continue;

            int idxToSwap = indexMap.get(expectedValue);

            // Update the map before swapping
            indexMap.put(A[i], idxToSwap);
            indexMap.put(expectedValue, i);

            // Swap the values
            int temp = A[i];
            A[i] = A[idxToSwap];
            A[idxToSwap] = temp;

            B--;
        }

        System.out.println(Arrays.toString(A));

    }
}
