import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class AssumptionTest {

    @ParameterizedTest
    @ValueSource(ints = {1,4,3,2})
    void test1(int nums) {
        Assumptions.assumeTrue(nums > 3);
        System.out.println("Numbers - " + nums);
    }

    @ParameterizedTest
    @CsvSource(value = {"tom,jerry", "Cha,Da"})
    @Tag("sanity")
    void test3(String param1, String param2) {
        Assumptions.assumeFalse(param1.equals("tom"), "Assumption failed for the param2: " + param2);
        System.out.println("Param 1 - " + param1 + ", Param 2 - " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"tom,1,true", "Cha,2,false"})
    @Tag("sanity")
    void test2(String param1, int param2, boolean param3) {
        Assumptions.assumingThat(param2 > 1, () -> System.out.println("Code found"));
        System.out.println("Param 1 - " + param1 + ", Param 2 - " + param2 + ", Param 3 - " + param3);
    }
}
