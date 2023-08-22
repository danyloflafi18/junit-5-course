import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourceTest {
    @ParameterizedTest
    @ValueSource(ints = {1,4,3,2})
    void test1(int nums) {
        System.out.println("Numbers - " + nums);
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"One", "Two"})
    void test2(String nums) {
        System.out.println("Strings - " + nums);
    }

    @ParameterizedTest(name = "Run - {index}, Number - {arguments}")
    @NullAndEmptySource
    @ValueSource(strings = {"One", "Two"})
    void test3(String nums) {
        System.out.println("Strings - " + nums);
    }
}
