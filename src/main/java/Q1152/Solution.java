//package Q1152;
//
//import java.util.*;
//
//public class Solution {
//    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
//        Map<String, Queue<String>> visited = new HashMap<>();
//        for (int i = 0; i< username.length; i++) {
//            if (!visited.containsKey(username[i])) {
//                visited.put(username[i], new PriorityQueue<>(Comparator.comparingInt(n -> timestamp[Integer.parseInt(n)])));
//            }
//            visited.get(username[i]).add(website[i]);
//        }
//        Map<String, Integer> times = new HashMap<>();
//        for (String name: visited.keySet()) {
//
//        }
//    }
//
//    private void addCombination(Queue<String> list, Map<String, Integer> result) {
//        String[] temp = (String[]) list.toArray();
//        if (temp.length <3) return;
//        else if (temp.length == 3) {
//            String key = convertToKey(temp);
//            result.put(key, result.getOrDefault(key, 0) + 1);
//        } else {
//            for (int i = 0; i < )
//        }
//
//    }
//
//    private void combination(int start, List<Integer> curr, Map<sTRI>) {
//        if (curr.size() == 3) {
//            String key = convertToKey(temp);
//            result.put(key, result.getOrDefault(key, 0) + 1);
//        }
//
//    }
//
//    private String convertToKey(String s1, String s2, String s3) {
//        return String.join("/", s1,s2,s3);
//    }
//
//    private String convertToKey(String[] s) {
//        return String.join("/", s);
//    }
//}
