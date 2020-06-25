public class LogAnalyzer {
    IExtensionManager fileExtensionManager;
    public LogAnalyzer(IExtensionManager fileExtensionManager) {
        this.fileExtensionManager = fileExtensionManager;
    }
    public LogAnalyzer() {
        fileExtensionManager = ExtensionManagerFactory.create();
    }

    public void setFileExtensionManager(IExtensionManager manager){
        this.fileExtensionManager = manager;
    }

    public boolean isValidLogFileName(String fileName){
        return fileExtensionManager.isValid(fileName);
    }
}
