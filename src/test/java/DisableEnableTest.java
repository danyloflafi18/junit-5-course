import listener.Listener;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;
import org.junit.jupiter.api.extension.ExtendWith;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@ExtendWith(Listener.class)
public class DisableEnableTest {
    @Test
    @Disabled("Disabled for the demo")
    void test1() {
        System.out.println("First test");
    }

    @Test
    @DisabledOnOs(value = OS.MAC, disabledReason = "Disabled on MAC OS for the demo")
    void test2() {
        System.out.println("Second test");
    }

    @Test
    @EnabledOnOs(value = OS.WINDOWS, disabledReason = "Enabled on WINDOWS OS for the demo")
    void test3() {
        System.out.println("Third test");
    }

    @Test
    @DisabledIfSystemProperty(named = "env", matches = "dev")
    void test4() {
        System.out.println("Fourth test");
    }

    @Test
    @DisabledIf(value = "disableProvider", disabledReason = "Disabled for the demo by @DisabledIf")
    void test5() {
        System.out.println("Fifth test");
    }

    @Test
    void test6() {
        System.out.println("Sixth test");
    }

    boolean disableProvider() {
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.WEDNESDAY);
    }
}
