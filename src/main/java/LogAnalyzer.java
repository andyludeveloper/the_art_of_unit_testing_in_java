public class LogAnalyzer {
    IExtensionManager fileExtensionManager;

    public LogAnalyzer(IExtensionManager fileExtensionManager) {
        this.fileExtensionManager = fileExtensionManager;
    }

    public LogAnalyzer() {
        this.fileExtensionManager= new FileExtensionManager();
    }

    public boolean isValidLogFileName(String fileName){
        return fileExtensionManager.isValid(fileName);
    }
}
