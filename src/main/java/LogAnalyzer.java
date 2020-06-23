public class LogAnalyzer {

    public boolean isValidLogFileName(String fileName){
        FileExtensionManager fileExtensionManager= new FileExtensionManager();
        return fileExtensionManager.isValid(fileName);
    }
}
