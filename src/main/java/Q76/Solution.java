//package Q76;
//
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//public class Solution {
//    public String minWindow(String s, String t) {
//        if (s.length() == 0 || t.length() == 0) {
//            return "";
//        }
//
//        // Dictionary which keeps a count of all the unique characters in t.
//        Map<Character, Integer> dictT = new HashMap<Character, Integer>();
//        for (int i = 0; i < t.length(); i++) {
//            int count = dictT.getOrDefault(t.charAt(i), 0);
//            dictT.put(t.charAt(i), count + 1);
//        }
//
//        int matches = dictT.size();
//
//        int pointer1 = 0;
//        int pointer2 = 0;
//        int[] answer = new int[2];
//        answer[0] = 0;
//        answer[1] = Integer.MAX_VALUE;
//        while(pointer1 <= pointer2 && pointer2 < s.length()) {
//            if (containsAllCharacters(s.substring(pointer1, pointer2+1), t)) {
//                if (pointer2 - pointer1 < answer[1] - answer[0]) {
//                    answer[0] = pointer1;
//                    answer[1] = pointer2;
//                }
//                pointer1++;
//            } else {
//                pointer2++;
//            }
//        }
//    }
//
//    private void loop(int pointer1, int pointer2, String s, Set<Character> t) {
//        while (!t.contains(s.charAt(pointer1))) pointer1++;
//        while (!t.contains(s.charAt(pointer2))) pointer2--;
//        if (pointer1 > pointer2) return;
//        else {
//
//        }
//    }
//
//    private boolean containsAllCharacters(String s1, String s2) {
//        Set<Character> set1 = convertCharArrayToSet(s1.toCharArray());
//        Set<Character> set2 = convertCharArrayToSet(s2.toCharArray());
//        return set1.containsAll(set2);
//    }
//
//    private Set<Character> convertCharArrayToSet(char[] chars) {
//        Set<Character> result = new HashSet<>();
//        for (char c : chars) {
//            result.add(c);
//        }
//        return result;
//    }
//}
