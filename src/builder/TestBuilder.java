package builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		Klant klant = new Klant.Builder()
				.voornaam("Peter")
				.tussenvoegsel("van der")
				.achternaam("Meer")
				.build();
		System.out.println(klant);
		
		Klant klant2 = new Klant.Builder()
				.voornaam("Willem")
				.build();
		System.out.println(klant2);

	}

}
