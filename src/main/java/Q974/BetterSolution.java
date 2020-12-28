package Q974;

public class BetterSolution {
    public int subarraysDivByK(int[] A, int K) {
        int N = A.length;
        int[] nums = new int[N+1];
        for (int i = 1; i <=N; i++) {
            nums[i]= nums[i-1] + A[i-1];
        }
        int[] count = new int[K];
        for (int num : nums) {
            count[(num % K + K) % K]++; // to deal with negative number!
        }
        int ans = 0;
        for (int v: count) {
            ans += v *(v-1) /2;
        }
        return ans;
    }
}
