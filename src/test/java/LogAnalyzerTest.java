import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class LogAnalyzerTest {
    private final LogAnalyzer analyzer = new LogAnalyzer();
    @Test
    public void isValidLogFileName_GoodExtensionLowercase_ReturnsTrue() {
        boolean result = analyzer.isValidLogFileName("filewithgoodextension.slf");
        assertTrue(result);
    }

    @Test
    public void isValidLogFileName_GoodExtensionUppercase_ReturnsTrue() {
        boolean result = analyzer.isValidLogFileName("filewithgoodextension.SLF");
        assertTrue(result);
    }

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Test
    public void isValidLogFileName_EmptyFileName_Throws() {
        exceptionRule.expect(IllegalArgumentException.class);
        exceptionRule.expectMessage("filename has to be provided");
        analyzer.isValidLogFileName(null);
    }
}