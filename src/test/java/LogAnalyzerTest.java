import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.Is.is;
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

    @Test
    public void isValidLogFileName_badFileName_WasLastFileNameValid_Return_False() {
        givenFileName("badname.foo");
        shouldBe(false);
    }

    @Test
    public void isValidLogFileName_GoodFileName_WasLastFileNameValid_Return_True() {
        givenFileName("goodfilename.slf");
        shouldBe(true);
    }

    private void shouldBe(boolean expected) {
        assertThat(analyzer.wasLastFileNameValid, is(expected));
    }

    private void givenFileName(String s) {
        analyzer.isValidLogFileName(s);
    }
}