
public class SouthDirectionState extends DirectionState {

	@Override
	public void moveForward(Position position) {
		position.setY(position.getY() - 1);
	}
	
	@Override
	public void moveBackward(Position position) {
		position.setY(position.getY() + 1);
	}
	
	@Override
	public String toString() {
		return "South";
	}

	@Override
	public DirectionState turnLeft() {
		return new WestDirectionState();
	}
	
	@Override
	public DirectionState turnRight() {
		return new EastDirectionState();
	}
	
}
