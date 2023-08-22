import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CsvValueTest {
    @ParameterizedTest
    @CsvSource(value = {"tom,jerry", "Cha,Da"})
    void test1(String param1, String param2) {
        System.out.println("Param 1 - " + param1 + ", Param 2 - " + param2);
    }

    @ParameterizedTest
    @CsvSource(value = {"tom,1,true", "Cha,2,false"})
    void test2(String param1, int param2, boolean param3) {
        System.out.println("Param 1 - " + param1 + ", Param 2 - " + param2 + ", Param 3 - " + param3);
    }

    @ParameterizedTest
    @CsvSource(value = {"'tom,jerry'", "'Cha,Da'"})
    void test3(String param1) {
        System.out.println("Param 1 - " + param1);
    }

    @ParameterizedTest
    @CsvSource(value = {"tom?jerry", "Cha?Da"}, delimiter = '?')
    void test4(String param1, String param2) {
        System.out.println("Param 1 - " + param1 + ", Param 2 - " + param2);
    }
}
