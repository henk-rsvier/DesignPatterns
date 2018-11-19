package singleton_enum;


public class TestSingletonEnum {

    public static void main(String[] args) {
        
        SingletonEnum newInstance = SingletonEnum.getInstance();
        newInstance.setSecret("geheim");
        SingletonEnum instanceTwo = SingletonEnum.INSTANCE;
        System.out.println("Dezelfde instance? : " + (newInstance == instanceTwo));
        System.out.println("SECRET: " + instanceTwo.getSecret());
        
    }
}

