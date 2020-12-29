package Q739;

import java.util.Stack;

public class StackSolution {
    public int[] dailyTemperatures(int[] T) {
        int[] answer = new int[T.length];
        Stack<Integer> position = new Stack<>();
        for (int i = T.length -1; i >=0; i--) {
            while (!position.empty() && T[i] >= T[position.peek()]) position.pop();
            answer[i] = position.empty() ? 0 : position.peek() - i;
            position.push(i);
        }
        return answer;
    }
}
