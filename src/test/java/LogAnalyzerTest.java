import org.junit.Test;

import static org.junit.Assert.*;

public class LogAnalyzerTest {
    @Test
    public void isValidFileName_NameSupportedExtension_ReturnsTrue(){
        FakeValidFakeExtensionManager manager = givenValidTrue();
        LogAnalyzer analyzer = new LogAnalyzer(manager);
        boolean result = analyzer.isValidLogFileName("short.ext");
        assertTrue(result);
    }

    @Test
    public void isValidFileName_NameSupportedExtension_by_property_setter_ReturnsTrue(){
        FakeValidFakeExtensionManager manager = givenValidTrue();
        LogAnalyzer analyzer = new LogAnalyzer();
        analyzer.setFileExtensionManager(manager);
        boolean result = analyzer.isValidLogFileName("short.ext");
        assertTrue(result);
    }

    @Test
    public void isValidFileName_Factory_design_ReturnsTrue(){
        FakeValidFakeExtensionManager manager = givenValidTrue();
        ExtensionManagerFactory managerFactory = new ExtensionManagerFactory();
        managerFactory.setManager(manager);

        LogAnalyzer analyzer = new LogAnalyzer();
        boolean result = analyzer.isValidLogFileName("short.ext");
        assertTrue(result);
    }

    private FakeValidFakeExtensionManager givenValidTrue() {
        FakeValidFakeExtensionManager manager =
                new FakeValidFakeExtensionManager();
        manager.setValid(true);
        return manager;
    }
}

class FakeValidFakeExtensionManager implements IExtensionManager{
    boolean valid = false;

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    @Override
    public boolean isValid(String fileName) {
        return valid;
    }
}