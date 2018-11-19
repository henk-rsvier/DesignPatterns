package factory;

public class TestVoertuigFactory {

	public static void main(String[] args) {
		
		VoertuigFactory factory = new VoertuigFactory();
		factory.setVoertuigType(1);
		Voertuig voertuig = factory.create();
		voertuig.move();
		factory.setVoertuigType(20);
		voertuig = factory.create();
		voertuig.move();
	}
}