public class LogAnalyzerUsingFactoryMethod {
    public boolean isValidLogFileName(String filename){
        return getManager().isValid(filename);
    }

    protected IExtensionManager getManager() {
        return new FileExtensionManager();
    }
}
