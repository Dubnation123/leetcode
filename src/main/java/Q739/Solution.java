package Q739;

public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] delta = new int[T.length];
        int[] result = new int[T.length];
        for (int i = 0; i< T.length-1; i++) {
            delta[i] = T[i+1] - T[i];
        }
        for (int i = 0; i < T.length-1; i++) {
            int count = 0, sum = 0, pointer = i;
            while(sum <=0 && pointer < T.length) {
                count+=1;
                sum+= delta[pointer];
                pointer++;
            }
            if (sum >0) {
                result[i] = count;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }
}
