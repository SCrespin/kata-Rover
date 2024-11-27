
public class NorthDirectionState extends DirectionState {
	
	@Override
	public void moveForward(Position position) {
		position.setY(position.getY() + 1);
	}
	
	@Override
	public void moveBackward(Position position) {
		position.setY(position.getY() - 1);
	}
	
	public String toString() {
		return "North";
	}
	
	public DirectionState turnLeft() {
		 return new WestDirectionState();
	}
	
	public DirectionState turnRight() {
		return new EastDirectionState();
	}
}
