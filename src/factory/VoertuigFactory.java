package factory;

public class VoertuigFactory {

	private int voertuigType = 0;
	
	public void setVoertuigType(int voertuigType) {
		this.voertuigType = voertuigType;
	}
	
	public Voertuig create() {
		
		if (voertuigType == 0) {
			return new Auto();
		}
		if (voertuigType == 1) {
			return new Fiets();
		}
		return new Unknown();
	}
}
