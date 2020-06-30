public class LogAnalyzerUsingFactoryMethod {
    public boolean isValidLogFileName(String filename){
        return isValid(filename);
    }

    protected boolean isValid(String filename){
        FileExtensionManager manager = new FileExtensionManager();
        return manager.isValid(filename);
    }

}
