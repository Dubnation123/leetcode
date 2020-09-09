import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class main {
    public static void main(String arg[]) {
        Set<String> set1 = Set.of("Hello", "World", "crazy");
        Set<String> set2 = new HashSet<>(Arrays.asList("Hello", "World"));
        System.out.print(set1.containsAll(Collections.emptySet()));
    }
}
