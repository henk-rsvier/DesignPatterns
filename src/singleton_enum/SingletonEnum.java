package singleton_enum;

public enum SingletonEnum {
	INSTANCE;
	
	private String Secret;
	
	public static SingletonEnum getInstance() {
		return SingletonEnum.INSTANCE;
	}

	public String getSecret() {
		return Secret;
	}

	public void setSecret(String secret) {
		Secret = secret;
	}
	
	
}
