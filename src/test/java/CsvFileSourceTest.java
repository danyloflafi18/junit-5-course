import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CsvFileSourceTest {
    @ParameterizedTest
    @CsvFileSource(files = {"src/test/resources/csv/file1.csv", "src/test/resources/csv/file2 .csv"}, numLinesToSkip = 1)
    void test1(String name, String surname, String position, String year, int age) {
        System.out.println("Name - " + name + ", Surname - " + surname + ", Position - " + position +
                ", Year - " + year + ", Age - " + age);
    }
}
