package singleton;

public class TestSingleton {
    
    public static void main(String[] args) {
        
        Singleton newInstance = Singleton.getInstance();
        Singleton instanceTwo = Singleton.getInstance();
        System.out.println("Dezelfde instance? : " + (newInstance == instanceTwo));
    }
}