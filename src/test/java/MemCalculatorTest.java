import org.junit.Test;

import static org.junit.Assert.*;

public class MemCalculatorTest {
    private MemCalculator SUT = new MemCalculator();

    @Test
    public void Sum_ByDefault_ReturnZero() {
        int result = SUT.sum();
        assertEquals(0, result);
    }

    @Test
    public void Add_WhenCalled_ChangesSum(){
        SUT.add(1);
        int result = SUT.sum();
        assertEquals(1, result);
    }
}