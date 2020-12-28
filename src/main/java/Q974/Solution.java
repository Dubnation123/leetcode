package Q974;

// intuitive solution
public class Solution {
    public int subarraysDivByK(int[] A, int K) {
        int result = 0;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
                if (sum % K == 0) {
                    result += 1;
                }
            }
        }
        return result;
    }
}
