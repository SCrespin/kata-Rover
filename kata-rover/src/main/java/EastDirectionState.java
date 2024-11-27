
public class EastDirectionState extends DirectionState {

	@Override
	public void moveForward(Position position) {
		position.setX(position.getX() + 1);
	}
	
	@Override
	public void moveBackward(Position position) {
		position.setX(position.getX() - 1);
	}
	
	@Override
	public String toString() {
		return "East";
	}
	
	@Override
	public DirectionState turnLeft() {
		return new SouthDirectionState();
	}
	
	@Override
	public DirectionState turnRight() {
		return new NorthDirectionState();
	}

}
