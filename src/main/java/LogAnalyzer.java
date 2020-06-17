public class LogAnalyzer {
    public boolean wasLastFileNameValid;

    public boolean isValidLogFileName(String fileName){
        wasLastFileNameValid = false;
        if(fileName==null){
            throw new IllegalArgumentException("filename has to be provided");
        }
        if(!fileName.toUpperCase().endsWith(".SLF")){
            return false;
        }

        wasLastFileNameValid = true;
        return true;
    }
}
