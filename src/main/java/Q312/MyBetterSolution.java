package Q312;

public class MyBetterSolution {
    public int maxCoins(int[] nums) {
        int[][] memo = new int[nums.length][nums.length];
        int result = maxCoinsHelper(nums, 0, nums.length-1, memo);
        return result;
    }

    private int maxCoinsHelper(int[] nums, int start, int end, int[][] memo) {
        if (start > end) {
            return 0;
        }
        if (memo[start][end] > 0) {
            return memo[start][end];
        }

        int localMax = 0;
        for (int i = start; i < end + 1; i++) {
            int local = maxCoinsHelper(nums, start, i -1, memo) +
                    get(nums, start-1) * get(nums, i) * get(nums, end +1) +
                    maxCoinsHelper(nums, i + 1, end, memo);
            localMax = Math.max(local, localMax);
        }
        memo[start][end] = localMax;
        return localMax;
    }

    private int get(int[] nums, int location) {
        if (location == -1 || location == nums.length) {
            return 1;
        } else {
            return nums[location];
        }
    }
}
