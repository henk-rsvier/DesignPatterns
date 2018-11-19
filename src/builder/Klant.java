package builder;

public class Klant {

	private final String voornaam;
	private final String tussenvoegsel;
	private final String achternaam;
	
	private Klant(Builder builder) {
		this.voornaam = builder.voornaam;
		this.tussenvoegsel = builder.tussenvoegsel;
		this.achternaam = builder.achternaam;
	}
	
	@Override
	public String toString() {
		return voornaam + " "
				+ ((tussenvoegsel != null) ? tussenvoegsel + " ": "")
				+ ((achternaam != null) ? achternaam + " ": "");
	}
	
	public static class Builder {
		private String voornaam;
		private String tussenvoegsel;
		private String achternaam;
				
		public Builder voornaam(String voornaam) {
			this.voornaam = voornaam;
			return this;
		}
		
		public Builder tussenvoegsel(String tussenvoegsel) {
			this.tussenvoegsel = tussenvoegsel;
			return this;
		}
		
		public Builder achternaam(String achternaam) {
			this.achternaam = achternaam;
			return this;
		}
		
		public Klant build() {
			return new Klant(this);
		}
	}
}
