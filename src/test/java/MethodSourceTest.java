import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MethodSourceTest {

    @ParameterizedTest
    @MethodSource(value = "ParamProvider#sourceString")
    @Order(1)
    void test1(String value) {
        System.out.println("Word - " + value);
    }

    @ParameterizedTest
    @MethodSource(value = "ParamProvider#sourceStreamString")
    void test2(String value) {
        System.out.println("Word - " + value);
    }

    @ParameterizedTest
    @MethodSource(value = "ParamProvider#sourceListArguments")
    void test3(String value) {
        System.out.println("Word - " + value);
    }

    @ParameterizedTest
    @MethodSource(value = "ParamProvider#sourceStreamArguments")
    @Order(2)
    void test4(String value) {
        System.out.println("Word - " + value);
    }
}
