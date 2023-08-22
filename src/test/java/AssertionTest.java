import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class AssertionTest {

    @Test
    void test1() {
        Map<String, Integer> map = new HashMap<>();
        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);

        assertThat(map, Matchers.hasKey("second"));
    }

    @Test
    void test2() {
        List<String> list = new ArrayList<>();
        list.add("first");
        list.add("second");
        list.add("third");

        assertAll(
                () -> assertThat(list, Matchers.anyOf(Matchers.hasItem("f irst"), Matchers.hasItem("one"))),
                () -> assertThat(list, Matchers.allOf(Matchers.hasItem("second"), Matchers.hasItem("third"))),
                () -> assertThat(list, Matchers.containsInAnyOrder("second", "third", "first"))
        );

    }
}
