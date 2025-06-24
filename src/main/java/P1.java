/*
* Given N bulbs, either on(1) or off(0) .
* Turning on ith bulb causes all remaining bulbs on the right to flip.
*
* Find the min number of switches to turn all the bulbs on.
*
* .Constraints:
*   .1<=N<=1e5
*   .A[i] = {0,1}
* */

/*
Note:   Time Complexity O(N)
        Space Complexity O(1)
*/
public class P1 {
    public static void main(String[] args) {
        P1 p1 = new P1();
    }
    public P1() {
        int cost = 0;
        int[] bulbs = {0, 1, 1, 0, 1};
        for (int i = 0; i < bulbs.length; i++) {
            int currentState = bulbs[i];
            if(cost %2 != 0)   //if even the value will be in its origin state , if not value will got flipped
                currentState = 1-currentState;
            if(currentState == 0) cost++;
        }
        System.out.println(cost);
    }

}
