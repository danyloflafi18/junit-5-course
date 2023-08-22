import org.junit.jupiter.params.provider.Arguments;

import java.util.List;
import java.util.stream.Stream;

public class ParamProvider {
    static List<String> sourceString() {
        return List.of("rabbit", "tomato", "cherry");
    }

    static Stream<String> sourceStreamString() {
        return Stream.of("rabbit", "tomato", "cherry");
    }

    static List<Arguments> sourceListArguments() {
        return List.of(Arguments.arguments("rabbit", "tomato", "cherry"));
    }

    static Stream<Arguments> sourceStreamArguments() {
        return Stream.of(Arguments.arguments("rabbit", "tomato", "cherry"));
    }
}
