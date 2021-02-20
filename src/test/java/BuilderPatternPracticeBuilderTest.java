import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class BuilderPatternPracticeBuilderTest {

    @Test
    public void test1() {
        BuilderPatternPractice patternPractice = new BuilderPatternPracticeBuilder()
                .setAddress("oo7")
                .setName("fangfun")
                .build();
    }

    @Test
    public void test2() {
        Set<Integer> set1 = new HashSet<>(Set.of(1,2,3));
        Set<Long> set2 = new HashSet<>(Set.of(1L, 2L));
        set1.removeAll(set2);

    }
}