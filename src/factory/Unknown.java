package factory;

public class Unknown implements Voertuig {

	@Override
	public void move() {

		System.out.println("Onbekend voertuig, voortbeweging onbekend");
	}

}
