import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

public class RepeatedTests {
    @RepeatedTest(5)
    void firstTest() {
        System.out.println("We are running several times");
    }

    @RepeatedTest(value = 5, name = "Repetition = {currentRepetition}, total is = {totalRepetitions}")
    void secondTest() {
        System.out.println("We are running several times");
    }

    @RepeatedTest(value = 3, name = "Repetition = {currentRepetition}, total is = {totalRepetitions}")
    void secondTest(RepetitionInfo repetitionInfo) {
        System.out.println("We are running several times");
        Assumptions.assumingThat(!(repetitionInfo.getCurrentRepetition() == 2),
                () -> System.out.println("Hey from third repetition"));
    }
}
