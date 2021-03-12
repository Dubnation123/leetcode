package Q1010;

public class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int[] modulo = new int[60];
        int result = 0;
        for (int t : time) {
            modulo[t % 60]++;
        }
        for (int i = 1; i < 30; i++) {
            if (modulo[i] >= 1 && modulo[60 - i] >= 1) {
                result += modulo[i] * modulo[60 - i];
            }
        }
        if (modulo[0] >= 2) {result += (modulo[0] - 1) * modulo[0] / 2;}
        if (modulo[30] >= 2) {result += (modulo[30] - 1) * modulo[30] / 2;}
        return result;
    }
}
