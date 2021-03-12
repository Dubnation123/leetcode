package Q690;

import java.util.List;
import java.util.Map;
import java.util.Stack;

import static java.util.stream.Collectors.toMap;

public class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int result = 0;
        Stack<Integer> idForSearch = new Stack<>();
        idForSearch.push(id);
        Map<Integer, Employee> map = employees.stream().collect(toMap(e -> e.id, e-> e));
        while (!idForSearch.isEmpty()) {
            int idTemp = idForSearch.pop();
            if (map.containsKey(idTemp)) {
                result += map.get(idTemp).importance;
                idForSearch.addAll(map.get(idTemp).subordinates);
                map.remove(idTemp);
            }
        }
        return result;
    }
}
