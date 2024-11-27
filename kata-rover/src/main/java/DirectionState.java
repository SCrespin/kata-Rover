
public abstract class DirectionState {
	
	public abstract void moveForward(Position position);
	
	public abstract void moveBackward(Position position);
	
	public abstract String toString();
	
	public abstract DirectionState turnLeft();
	
	public abstract DirectionState turnRight();
}
