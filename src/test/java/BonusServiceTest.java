import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BonusServiceTest {
    @Test
    void shouldCalculateForRegisteredAndUnderLimit() {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(1000, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(1_000_000, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndZeroUnderLimit() {
        BonusService service = new BonusService();

        long expected = 0;
        long actual = service.calculate(0, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateUnRegisteredAndZeroUnderLimit() {
        BonusService service = new BonusService();

        long expected = 0;
        long actual = service.calculate(0, false);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndOverOverLimit() {
        BonusService service = new BonusService();

        long expected = 500;
        long actual = service.calculate(1_000_000_80, true);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForRegisteredAndUnderUnderLimit() {
        BonusService service = new BonusService();

        long expected = 30;
        long actual = service.calculate(3000, false);

        Assertions.assertEquals(expected, actual);
    }
}


