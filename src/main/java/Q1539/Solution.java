package Q1539;

public class Solution {
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int point = 0;
        int i = 1;
        while (count < k) {
            if (point < arr.length && i == arr[point]) {
                point +=1;
            } else {
                count += 1;
            }
            i++;
        }
        return i;
    }
}
