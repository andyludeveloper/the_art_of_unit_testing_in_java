import org.junit.Test;

import static org.junit.Assert.*;

public class MemCalculatorTest {

    @Test
    public void Sum_ByDefault_ReturnZero() {
        MemCalculator SUT = new MemCalculator();
        int result = SUT.sum();
        assertEquals(0, result);
    }

    @Test
    public void Add_WhenCalled_ChangesSum(){
        MemCalculator SUT = new MemCalculator();
        SUT.add(1);
        int result = SUT.sum();
        assertEquals(1, result);
    }
}