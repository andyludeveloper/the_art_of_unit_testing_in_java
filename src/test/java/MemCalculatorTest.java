import org.junit.Test;

import static org.junit.Assert.*;

public class MemCalculatorTest {

    @Test
    public void Sum_ByDefault_ReturnZero() {
        MemCalculator SUT = new MemCalculator();
        int result = SUT.sum();
        assertEquals(0, result);
    }
}