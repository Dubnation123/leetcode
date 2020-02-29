import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static String multiply(String num1, String num2) {
        int str1_len = num1.length();
        int str2_len = num2.length();
        List<Integer> temp_res = new ArrayList<Integer>((Collections.nCopies(str1_len + str2_len, 0)));

        for (int i = 0; i < str1_len + str2_len; i++) {
            Integer temp_digit = temp_res.get(i);
            for (int j = 0; j < str1_len && j <= i; j++) {
                int pointer_2 = i - j;
                if (pointer_2 < str2_len) {
                    temp_digit += Character.getNumericValue(num1.charAt(str1_len - 1 - j)) * Character.getNumericValue(num2.charAt(str2_len - 1 - pointer_2));
                }
            }
            temp_res.set(i, temp_digit % 10);
            if (temp_digit / 10 > 0) temp_res.set(i + 1, temp_digit / 10);
        }

        StringBuilder sb = new StringBuilder();
        boolean zero_flag = true;
        for (int i = str1_len + str2_len - 1; i >= 0; i--) {
            if (zero_flag) {
                if (temp_res.get(i) == 0) continue;
                else zero_flag = false; sb.append(temp_res.get(i));
            }
            else {
                sb.append(temp_res.get(i));
            }
        }
        if (zero_flag) return "0";
        else return sb.toString();
    }
}