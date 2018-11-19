package strategy;

public class TestStrategy {

	public static void main(String[] args) {
		
		Unit unit = new Unit();
		unit.setMoveStrategy(new DriveMovementStrategy());
		unit.ExecuteMove();
		unit.setMoveStrategy(new FlyMovementStrategy());
		unit.ExecuteMove();

	}
}
