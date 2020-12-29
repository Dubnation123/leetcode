package Q38;

public class Solution {
    public String countAndSay(int n) {
        String base = "1";
        for (int i = 1; i< n; i++) {
            StringBuilder builder = new StringBuilder();
            int count = 1;
            char c = base.charAt(0);
            for (int j = 1; j< base.length(); j++) {
                if (base.charAt(j) == c) {
                    count +=1;
                } else {
                    builder.append(count);
                    builder.append(c);
                    c = base.charAt(j);
                    count=1;
                }
            }
            builder.append(count);
            builder.append(c);
            base = builder.toString();
        }
        return base;
    }
}
