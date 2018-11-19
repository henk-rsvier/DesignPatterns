package singleton;

public class Singleton {
    
    private static Singleton uniqueInstance = null;
    
    private Singleton() { }
    
    public static Singleton getInstance() {
        
        // Lazy loading (niet multi-thread safe!)
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
