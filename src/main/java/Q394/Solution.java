package Q394;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public String decodeString(String s) {
        int length = s.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) != ']') {
                stack.push(s.charAt(i));
            } else {
                List<Character> decoded = new ArrayList<>();
                while (stack.peek()!= '[') {
                    decoded.add(stack.pop());
                }
                stack.pop(); // pop out '['
                int count = 0;
                int times = 0;
                while (stack.peek() >= '0' && stack.peek() <= '9') {
                    times += Character.getNumericValue(stack.pop()) * Math.pow(10, count);
                    count++;
                }
                while (times != 0) {
                    for (int j = decoded.size() - 1; j >= 0; j--) {
                        stack.push(decoded.get(j));
                    }
                    times--;
                }
            }
        }
        char[] result = new char[stack.size()];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = stack.pop();
        }
        return new String(result);
    }
}
