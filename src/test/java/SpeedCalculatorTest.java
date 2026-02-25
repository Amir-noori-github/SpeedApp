import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SpeedCalculatorTest {

    @Test
    void testCalculateSpeedNormal() {
        double result = SpeedCalculator.calculateSpeed(100, 2);
        assertEquals(50.0, result);
    }

    @Test
    void testCalculateSpeedDecimal() {
        double result = SpeedCalculator.calculateSpeed(150.5, 2.5);
        assertEquals(60.2, result, 0.0001);
    }

    @Test
    void testCalculateSpeedZeroDistance() {
        double result = SpeedCalculator.calculateSpeed(0, 5);
        assertEquals(0.0, result);
    }

    @Test
    void testCalculateSpeedZeroTime() {
        double result = SpeedCalculator.calculateSpeed(100, 0);
        assertTrue(Double.isInfinite(result));
    }
}
