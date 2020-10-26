package Q397;

public class Solution1 {
    public int integerReplacement(int n) {
        int count = 0;
        if (n == Integer.MAX_VALUE) return 32;
        while (n > 1) {
            if (n % 2 == 0) {
                n = n/2;
            } else {
                if (n == 3 || (n-1) % 4 == 0) {
                    n--;
                } else {
                    n++;
                }
            }
            count++;
        }
        return count;
    }
}
