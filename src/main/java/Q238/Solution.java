package Q238;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

        int[] L = new int[length];
        int[] R = new int[length];

        int[] answer = new int[length];

        L[0] = 1;
        for (int i= 1; i< nums.length; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        }
        R[length - 1] = 1;
        for (int i = length - 2; i >= 0; i--) {

            // R[i + 1] already contains the product of elements to the right of 'i + 1'
            // Simply multiplying it with nums[i + 1] would give the product of all
            // elements to the right of index 'i'
            R[i] = nums[i + 1] * R[i + 1];
        }
        for(int i = 0; i < length; i++) {
            answer[i] = L[i] * R[i];
        }
        return answer;
    }
}
