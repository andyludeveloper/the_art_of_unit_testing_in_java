import org.junit.Test;

import static org.junit.Assert.*;

public class LogAnalyzerTest {

    @Test
    public void isValidLogFileName_GoodExtensionLowercase_ReturnsTrue() {
        LogAnalyzer analyzer = new LogAnalyzer();
        boolean result = analyzer.isValidLogFileName("filewithgoodextension.slf");
        assertTrue(result);
    }

    @Test
    public void isValidLogFileName_GoodExtensionUppercase_ReturnsTrue() {
        LogAnalyzer analyzer = new LogAnalyzer();
        boolean result = analyzer.isValidLogFileName("filewithgoodextension.SLF");
        assertTrue(result);
    }

}