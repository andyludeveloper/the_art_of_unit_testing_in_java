public class LogAnalyzer {
    public boolean isValidLogFileName(String fileName){
        if(fileName.toUpperCase().endsWith(".SLF")){
            return true;
        }else{
            return false;
        }
    }
}
