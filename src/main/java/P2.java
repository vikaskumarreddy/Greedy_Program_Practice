/*Given an array of N integers.
* Find the highest product by multiplying 3 elements.
* .Constraints:
*   .1<=N<=5e5
* Example:
* Input: [1,2,3,4]
* Output: 2*3*4 = 24
*
* Input : [0,-1,10,7,5]
* Output: 5*7*10 = 350 */

public class P2 {
    public static void main(String[] args) {
        P2 p0 =new P2(new int[]{0, -1, 10, 7, 5});
        P2 p1 =new P2(new int[]{1,2,3,4});
    }
    public P2(int[] array){
        /*
        * Considerations:
        * sort the array and take highest 3 elements
        * lowest 2 and highest 1 (when the lowest are negative) because multiplying 2 negatives can become a positive*/
        int hi3= array[array.length-1]*array[array.length-2]*array[array.length-3];
        int low2hi1 = array[0]*array[1]*array[array.length-1];
        System.out.println(Integer.max(hi3,low2hi1));
    }
}
