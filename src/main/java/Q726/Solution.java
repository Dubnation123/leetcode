package Q726;

//
//public class Q228.Solution {
//    public String countOfAtoms(String formula) {
//        Map<String, Integer> result = new HashMap<>();
//        for (char c: formula.toCharArray()) {
//            if (c)
//        }
//    }
//
//    public Map<String, Integer> calculator(String formula) {
//        Map<String, Integer> result = new HashMap<>();
//        int i = 0;
//        while (i < formula.length()) {
//            if (formula.charAt(i) == '(') {
//                i++;
//            } else if (formula.charAt(i) == ')') {
//                int j = i;
//                while (j+1 < formula.length() && formula.charAt(j+1) >= '0' && formula.charAt(j+1) <= '9') j++;
//                if (j > i) {
//                    int finalI = i;
//                    int finalJ = j;
//                    result.replaceAll((k, v) -> v * Integer.getInteger(formula.substring(finalI +1, finalJ +1)));
//                }
//                return result;
//            } else if (formula.charAt(i) >= 'A' && formula.charAt(i) <= 'Z') {
//                int k = i;
//                while (k+1 < formula.length() && formula.charAt(k+1) >= 'a' && formula.charAt(k+1) <= 'z') k++;
//                int j = k;
//                while (j+1 < formula.length() && formula.charAt(j+1) >= '0' && formula.charAt(j+1) <= '9') j++;
//                if (j == k) {
//                    result.put(formula.substring(i, k+1), 1);
//                } else {
//                    result.put(formula.substring(i, k+1), Integer.getInteger(formula.substring(k+1, j+1)));
//                }
//                i = j + 1;
//            }
//        }
//        return result;
//    }
//}
