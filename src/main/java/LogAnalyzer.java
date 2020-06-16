public class LogAnalyzer {
    public boolean isValidLogFileName(String fileName){
        if(fileName==null){
            throw new IllegalArgumentException("filename has to be provided");
        }
        if(fileName.toUpperCase().endsWith(".SLF")){
            return true;
        }else{
            return false;
        }
    }
}
