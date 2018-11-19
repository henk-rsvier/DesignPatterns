package strategy;

public class Unit {
	
	private MoveStrategy moveStrategy;
	
	public void setMoveStrategy(MoveStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}
	
	public void ExecuteMove() {
		// Pas op voor nulpointer als de strategy niet gezet is.
		// Opties zijn de strategy in constructor te vereisen, een default strategy te gebruiken
		// of een RuntimeException te gooien (bv IllegalStateException)
		moveStrategy.move();
	}
}
