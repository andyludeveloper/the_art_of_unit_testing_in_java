public class ExtensionManagerFactory {
    private static IExtensionManager customManager = null;

    public static IExtensionManager create(){
        if(customManager != null){
            return customManager;
        }
        return new FileExtensionManager();
    }

    public void setManager(IExtensionManager extensionManager){
        customManager = extensionManager;
    }
}
