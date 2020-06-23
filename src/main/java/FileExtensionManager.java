public class FileExtensionManager implements IExtensionManager {
    @Override
    public boolean isValid(String fileName) {
        if(fileName==null){
            throw new IllegalArgumentException("filename has to be provided");
        }
        if(!fileName.toUpperCase().endsWith(".SLF")){
            return false;
        }
        return true;
    }
}
