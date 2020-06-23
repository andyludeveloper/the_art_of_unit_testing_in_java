public class LogAnalyzer {

    public boolean isValidLogFileName(String fileName){
        IExtensionManager fileExtensionManager= new FileExtensionManager();
        return fileExtensionManager.isValid(fileName);
    }
}
