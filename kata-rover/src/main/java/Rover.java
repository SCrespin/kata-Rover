
public class Rover {
	private Position position;
	private DirectionState direction;
	
	
	public Rover(Position position, DirectionState direction) {
		this.position = position;
		this.direction = direction;
	}
	
	public Rover(Position position) {
		this.position = position;
		this.direction = new NorthDirectionState();
	}
	
	public Rover() {
		this.position = new Position(0, 0);
		this.direction = new NorthDirectionState();
	}
	
	
	public void moveForward() {
		this.direction.moveForward(this.position);
	}
	
	public void moveBackward() {
		this.direction.moveBackward(this.position);
	}
	
	public void turnLeft() {
		this.direction = this.direction.turnLeft();
	}
	
	public void turnRight() {
		this.direction = this.direction.turnRight();
	}
	
	
	
	
	public int getX() {
		return position.getX();
	}
	
	public int getY() {
		return position.getY();
	}
	
	public Position getPosition() {
		return position;
	}
	
	public String getDirection() {
		return direction.toString();
	}
	
	public void setDirection(DirectionState direction) {
		this.direction = direction;
	}
	
	public void setX(int X) {
		this.position.setX(X);
	}
	
	public void setY(int Y) {
		this.position.setY(Y);
	}
	
}
